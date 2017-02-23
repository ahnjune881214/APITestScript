/*******************************************************************************
 * Copyright (c) 2017 by QA Team of Wemakeprice. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software and its documentation for
 * educational, research, and not-for-profit purposes, without fee and without a signed licensing agreement,
 * is hereby granted, provided that the above copyright notice appears in all copies, modifications, and distributions.
 *******************************************************************************/

package AppiumVerification.mobileapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.jayway.jsonpath.JsonPath;

import AppiumVerification.DBUtil.DBUtil;

public class MobileAPIoverlapCheck extends NonListOfMobileAPI {
	public static String jsonString = null;
	public static List<String> lList = null;
	public static List<String> deal_name = null;
	public static List<Integer> deal_id = null;
	public static int pageNo = 0;
	public static int totalCount = 0;

	public static String[][] nonOrdering = { HOME_0DEPTH, BEST_0DEPTH, WONDER_0DEPTH };
	public static String[][] ordering = { SoftListOfMobileAPI.SORT_NEWTEACHER, SoftListOfMobileAPI.SORT_1MINMART,
			SoftListOfMobileAPI.SORT_SHOESCOACH, SoftListOfMobileAPI.SORT_BOOKANDPLAY, SoftListOfMobileAPI.SORT_FOOD,
			SoftListOfMobileAPI.SORT_LIFESTYLEANDKITCHEN, SoftListOfMobileAPI.SORT_BABYPRODUCT,
			SoftListOfMobileAPI.SORT_FASHION, SoftListOfMobileAPI.SORT_HOMEELECTANDBOOKS };

	public static void main(String[] args) throws Exception {
		
		ResultSet rs = null;
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		System.out.println("[작업 처리 요청]");
		Runnable run = new Runnable() {
			@Override
			public void run() {
				try {
					nonOrdering();
					ordering();

					ResultSet rs = null;
					Connection con = DBUtil.getConnection();
					String sql = "select DEAL_ID, DEAL_NAME, DEAL_URL from MOBILE_DEAL_OVERLAP ";
					PreparedStatement st = con.prepareStatement(sql);
					rs = st.executeQuery(); 
					System.out.println("[검사완료]");
		            while(rs.next()){
		                 System.out.print("[중복] " + rs.getInt("DEAL_ID") + " | " + rs.getString("DEAL_NAME") + "" + rs.getString("DEAL_URL"));
		            }
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Future future = executorService.submit(run);

		try {
			future.get();
			System.out.println("[작업 처리 완료]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		executorService.shutdown();
	}

	public static void nonOrdering() throws Exception {
		// Non Ordering
		for (int col = 0; col < nonOrdering.length; col++) {
			for (int row = 0; row < nonOrdering[col].length; row++) {
				lList = Arrays.asList(nonOrdering[col][row]); // URL 호출
				homeDealList_TodayPick(lList);
			}
		}

	}

	public static void ordering() throws Exception {
		// Ordering
		for (int col = 0; col < ordering.length; col++) {
			for (int row = 0; row < ordering[col].length; row++) {
				Integer[] sortNum = { 1, 5, 0, 3, 4 };
				for (int i = 0; i < sortNum.length; i++) {
					lList = Arrays.asList(ordering[col][row] + "&sort=" + sortNum[i]); // URL 호출
					homeDealList_TodayPick(lList);
				}
			}
		}
	}

	public static void homeDealList_TodayPick(List<String> lList) throws Exception {
		String urlPath = null;
		List<String> urlPATH = new ArrayList<String>();
		List<String> dealname_List = new ArrayList<String>();
		List<Integer> dealid_List = new ArrayList<Integer>();
		Connection con = DBUtil.getConnection();
		String sql = "INSERT INTO DEAL_OVERLAP"
				+ "(DEAL_ID, DEAL_NAME, DEAL_URL) "
				+ "Values (?,?,?)";

		PreparedStatement st = con.prepareStatement(sql);
		
		for (int length = 0; length < lList.size(); length++) {
			String url = lList.get(length);
			pageNo = JsonPath.read(callURL(lList.get(0)), "$.total_page"); // page
																			// total
																			// No
			System.out.println("[PageNumber] " + pageNo);

			for (int i = 1; i <= pageNo; i++) {
				if (url.indexOf("&page=") != -1)
					;
				{
					urlPath = url.replaceAll("\\&page=[\\d]", "\\&page=" + i);
				}
				if (url.indexOf("&idx_page=") != -1) {
					if (i != 1) {
						urlPath = url.replaceAll("\\&idx_page=[\\d]", "\\&page=" + i);
					}
				}

				jsonString = callURL(urlPath);
				deal_name = JsonPath.read(jsonString, "$..[?(@.content_type =~ /.*_list/i)]..deal_name");
				deal_id = JsonPath.read(jsonString, "$..[?(@.content_type =~ /.*_list/i)]..deal_id");
				List<String> list = new ArrayList<String>(Arrays.asList(urlPath));

				dealname_List.addAll(deal_name);
				dealid_List.addAll(deal_id);
			}

			System.out.println("dealid_List = " + dealname_List.size());
			System.out.println("dealid_List = " + dealid_List.size());

			int count = 0;
			for (count = 0; count < dealname_List.size(); count++) {
				
				String DEALNAME = dealname_List.get(count).toString();
				int DEALIID = Integer.valueOf(dealid_List.get(count)+"");
				

				int dealID = DEALIID; 
				String str1 = DEALNAME.replaceAll("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]", "");
				String str2 = url;
				
				System.out.println("No" + (count + 1) + " | " + dealID + " | " + str1 + " | " + str2);
				
				st.setInt(1, dealID);
				st.setString(2, str1);
				st.setString(3, str2);
				st.executeUpdate();
			}
		}
		Thread.sleep(5000);
		dbOverlap();
	}
	
	
	
	public static void dbOverlap(){
		try {
			ResultSet rs = null;
			Connection con = DBUtil.getConnection();
			String sql = "select DEAL_ID, DEAL_NAME, DEAL_URL from DEAL_OVERLAP group by DEAL_ID having count(*) > 2";
			PreparedStatement st = con.prepareStatement(sql);
			rs = st.executeQuery(); 
            while(rs.next()){
                 System.out.print(rs.getInt("DEAL_ID") + " | " + rs.getString("DEAL_NAME") + "" + rs.getString("DEAL_URL"));
                 String sql_overlap = "INSERT INTO MOBILE_DEAL_OVERLAP"
     					+ "(DEAL_ID, DEAL_NAME, DEAL_URL) "
     					+ "Values (?,?,?)";

     			st = con.prepareStatement(sql_overlap);
     			
     			st.setInt(1, rs.getInt("DEAL_ID"));
     			st.setString(2, rs.getString("DEAL_NAME"));
     			st.setString(3, rs.getString("DEAL_URL"));
     			
     			st.executeUpdate();
                 
            }
            st.executeQuery ("TRUNCATE TABLE DEAL_OVERLAP");
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void dbUpdate(Integer id, String str1, String str2) throws Exception {
		try {
			Connection con = DBUtil.getConnection();
			String sql = "INSERT INTO DEAL_OVERLAP"
					+ "(DEAL_ID, DEAL_NAME, DEAL_URL) "
					+ "Values (?,?,?)";

			PreparedStatement st = con.prepareStatement(sql);
			
			st.setInt(1, id);
			st.setString(2, str1);
			st.setString(3, str2);
			
			st.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public static String callURL(String myURL) {
		// System.out.println("Requested URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;

		try {
			URL url = new URL(myURL);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			int code = connection.getResponseCode();
			// System.out.println("Response code of the object is "+ code);

			if (code != 200) {
				// DB에 업데이트
			} else if (code == 200) {
				// System.out.println("Status : " + 200);
			}

			urlConn = url.openConnection();
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);

			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(), Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);

				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}

			in.close();

		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:" + myURL, e);
		}
		return sb.toString();
	}
}
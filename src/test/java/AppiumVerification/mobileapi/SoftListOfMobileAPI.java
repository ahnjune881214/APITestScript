/*******************************************************************************
 * Copyright (c) 2017 by QA Team of Wemakeprice. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software and its documentation for
 * educational, research, and not-for-profit purposes, without fee and without a signed licensing agreement,
 * is hereby granted, provided that the above copyright notice appears in all copies, modifications, and distributions.
 *******************************************************************************/

package AppiumVerification.mobileapi;

public class SoftListOfMobileAPI {
	//	- 인기순 :		sort=1
	//	- 무료배송 :	 	sort=5
	//	- 최신순 :		sort=0
	//	- 낮은가격순:		sort=3
	//	- 높은가격순: 		sort=4
	// &sort=1
	
	
	// 원더배송
	
	// 원더배송 > 신선생	
	public static String[] SORT_NEWTEACHER = {
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104001&idx_page=1", // 절대우위
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104002&idx_page=1", // 이유식만들기
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104003&idx_page=1", // 레시피/간편요리
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104004&idx_page=1", // 과일/채소
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104005&idx_page=1", // 쌀/견과 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104006&idx_page=1", // 정육/계란 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104007&idx_page=1", // 수산/건어물
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104008&idx_page=1", // 우유/치즈/요거트
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104009&idx_page=1", // 김치/반찬
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104010&idx_page=1"  // 타임세일
	};
	
	// 원더배송 > 1분 마트
	public static String[] SORT_1MINMART = {
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104101&idx_page=1", // 식품관
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104102&idx_page=1", // 생활관 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104103&idx_page=1", // 식용유/조미료/소스 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104104&idx_page=1", // 건강/다이어트 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104107&idx_page=1", // 출산/유아용품 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104111&idx_page=1"  // 반려동물
	};
	
	// 원더배송 > 슈즈코치
	public static String[] SORT_SHOESCOACH = {
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104201&idx_page=1", // 나이키
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104202&idx_page=1", // 아디다스 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104203&idx_page=1", // 컨버스
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104204&idx_page=1", // 뉴발란스 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104205&idx_page=1", // 닥터마틴 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104206&idx_page=1", // 라코스테 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104207&idx_page=1", // 리복 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104208&idx_page=1", // 푸마 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104209&idx_page=1", // 골든구스
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104212&idx_page=1", // 크록스 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104215&idx_page=1", // 기타브랜드 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104216&idx_page=1", // 유아동신발 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104217&idx_page=1", // 남여의류 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104219&idx_page=1"  // 모자 
	};
	
	// 원더배송 > 책과놀이
	public static String[] SORT_BOOKANDPLAY = {
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104301&idx_page=1", // 유아 도서
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104303&idx_page=1", // 완구/교구 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=104304&idx_page=1"  // 문구/사무용품 
	};
	
	// 원더배송 > 식품
	public static String[] SORT_FOOD = {
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102911&idx_page=1", // 신선식품
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102901&idx_page=1", // 과자/간식 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102902&idx_page=1", // 라면/면류 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102903&idx_page=1", // 조미료/소스/설탕
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102904&idx_page=1", // 즉석조리식품
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102905&idx_page=1", // 통조림/식용유/잼
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102906&idx_page=1", // 생수/음료
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102907&idx_page=1", // 두유/우유
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102908&idx_page=1", // 차/티백 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102909&idx_page=1", // 커피 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=102910&idx_page=1"  // 건강/다이어트식
	};
	
	// 원더배송 > 생활/주방
	public static String[] SORT_LIFESTYLEANDKITCHEN = {
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103001&idx_page=1", // 화장지/물티
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103002&idx_page=1", // 헤어/바디케어 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103003&idx_page=1", // 생리대/여성용품 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103004&idx_page=1", // 세제/섬유유연제 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103005&idx_page=1", // 방향/탈취/살균 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103006&idx_page=1", // 칫솔/면도/비누 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103007&idx_page=1", // 수납/정리/잡화
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103008&idx_page=1", // 주방용품 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103009&idx_page=1", // 욕실/청소 용품 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103010&idx_page=1", // 홈데코 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103011&idx_page=1", // 애완/문구/취미 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103012&idx_page=1"  // RESALE 특가 
	};
	
	// 원더배송 > 유아동 
	public static String[] SORT_BABYPRODUCT = {
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103101&idx_page=1", // 기저귀
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103102&idx_page=1", // 분유/이유식
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103103&idx_page=1", // 물티슈 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103104&idx_page=1", // 생활용품
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103105&idx_page=1", // 수유/출산용품
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103106&idx_page=1", // 유아스킨케어 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103107&idx_page=1", // 장난감/완구
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103108&idx_page=1", // 매트/안전용품
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103109&idx_page=1", // 유아의류/잡화
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103110&idx_page=1", // 유모차/외출용품
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103111&idx_page=1", // 유아도서
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103112&idx_page=1"  // RESALE 특가 
	};
	
	// 원더배송 > 패션 
	public static String[] SORT_FASHION = {
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103505&idx_page=1", // 여성의류 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103501&idx_page=1", // 남성의류 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103504&idx_page=1", // 스포츠 의류/용품 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103507&idx_page=1", // 샌들/슬리퍼 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103503&idx_page=1", // 운동화/캐주얼 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103508&idx_page=1", // 가방 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103502&idx_page=1"  // 패션소품
	};
	
	// 원더배송 > 가전도서 
	public static String[] SORT_HOMEELECTANDBOOKS = {
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103205&idx_page=1", // 생활가전
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103203&idx_page=1", // 모바일/액세서리 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103204&idx_page=1", // PC/주변 
			"http://mapi.wemakeprice.com/app/api/deal/get_list/1?cmd=5&app_version=4.9.8&os_type=1&referer=gnbmenuinfo&os=iphone&version=4.9.8&loc_id=103201&idx_page=1"  // 자동차 용품  
	};
}

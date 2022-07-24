package com.jpro.jconsumer;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface JConsumerInterface {
	//매장 선택
	//public Map<> storeSelect(Map<> map);
	
	//메뉴 보기
	public String JmenuSelect(); //이미지와 가격을 가져옴 -> 장바구니
	//리턴 : 상품정보(foodImg-img), 추가 특징(foodInfo-String), 메뉴 금액(J_menuPrice-int)
	
	//장바구니
	public String Jbag(String J_foodImg, String J_foodInfo, int J_menuPrice);
	
	//결제 및 상세정보
	public String Jpayhistory(int J_menuPrice);
	
	//결제 이후
	public void JpayAfter(String J_address, String J_apiAddressDetail, String J_totalPrice);
	
	//마이페이지
	public String JMyPage(String mId, String name, String email, int phone, int zipcode, String address);
	public JConsumerLoginVo selectUserInfo(Object object);
	
	//마이 페이지 수정
	
	public String JMyPageChange(String mId, String name, String email, int phone, int zipcode, String address);
	public void updateUserInfo(JConsumerLoginVo attribute);
	//public void updateUserInfo(JConsumerLoginVo vo);
	
	//주문 내역(보류, 이유 : 매개변수로 받아야 할 변수가 너무 많음)
	
	public List<JConsumerVo3> Jorderlist(Page page);
	
	//리뷰 작성 페이지(보류)
	public List<com.jpro.jconsumer.BoardAtt> upload(List<MultipartFile> multi);
	public void insertReview(JConsumerVo3 vo);
	
	//리뷰 목록 확인 페이지(리스트)
	public List<String> JReviewList(List<String> list);
	
	//FAQ(리스트)
	public List<String> JFAQ(List<String> list);





	




	
}

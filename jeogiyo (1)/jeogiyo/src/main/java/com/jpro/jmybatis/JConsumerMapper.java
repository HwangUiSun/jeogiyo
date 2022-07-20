package com.jpro.jmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.jpro.jconsumer.BoardAtt;
import com.jpro.jconsumer.JConsumerVo;
import com.jpro.jconsumer.JConsumerVo3;
import com.jpro.jconsumer.JconsumerVo2;
import com.jpro.jconsumer.Page;

@Mapper
@Repository
@Qualifier("consumerMapper")
public interface JConsumerMapper {
	public int totSize(Page page);
	
	//매장 선택
	public List<JconsumerVo2> storeSelect(Page page);
	
	//메뉴 보기
	public String JmenuSelect();
	
	//장바구니
	public String Jbag(String J_foodImg, String J_foodInfo, int J_menuPrice);
	
	//결제 및 개인 상세 정보
	public String Jpayhistory();
	
	//결제 이후
	public void JpayAfter(String J_address, String J_apiAddressDetail, String J_totalPrice);
	
	//마이페이지
	public String JMyPage(String mId, String name, String email, int phone, int zipcode, String address);
	
	//마이 페이지 수정
	
	public String JMyPageChange(String mId, String name, String email, int phone, int zipcode, String address);
	
	//주문 내역
	
	//public List<JConsumerVo3> Jorderlist(Page cosumerpage);
	
	//리뷰 작성 페이지
	public List<com.jpro.jconsumer.BoardAtt> upload(List<MultipartFile> multi);
	
	//리뷰 목록 확인 페이지
	public List<String> JReviewList(List<String> list);
	
	//FAQ(리스트)
	public List<String> JFAQ(List<String> list);
	public String findId(JConsumerVo vo);

	
}

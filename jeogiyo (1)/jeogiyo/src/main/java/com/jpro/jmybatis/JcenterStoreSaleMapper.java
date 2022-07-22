package com.jpro.jmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jstore.JpayAfterVo;

@Mapper
@Repository
@Qualifier("JcenterStoreSaleMapper")
public interface JcenterStoreSaleMapper {

	public Integer JsaleFind3(JpayAfterVo vo);
	public Integer totHit(JpayAfterVo vo);
	public Integer JsaleFind3_all(JpayAfterVo vo);
	public Integer totHit_all(JpayAfterVo vo);
	public List<JpayAfterVo> storeSaleList(JpayAfterVo vo);
	public List<JpayAfterVo> storeSaleList_all(JpayAfterVo vo);

	
	// 아이디값으로 스토어네임 가져오기
	public String selectStoreName(String mid); 
	// 가지고온 값으로 totsize 뽑기
	public int StoreNametotSize(String stn);
	// 리스트 출력
	public List<JpayAfterVo> selectSale(com.jpro.common.Page page);
	// 설정된 기간 리스트 출력
	public List<JpayAfterVo> selectSaleday(JpayAfterVo vo);
	// 설정된 기간 총 금액 출력
	public int selectSaledayAll(JpayAfterVo vo);
	// 설정된 기간 총 판매 건수 출력
	public int selectSaledayAllHit(JpayAfterVo vo);
	// 설정된 기간 totosize
	public int selectSaledaytotSize(JpayAfterVo vo);
}

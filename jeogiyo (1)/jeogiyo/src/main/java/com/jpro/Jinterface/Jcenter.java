package com.jpro.Jinterface;

import java.util.List;

import com.jpro.jcenter.JcenterVo;
import com.jpro.jcenter.Page;
import com.jpro.jstore.JpayAfterVo;
import com.jpro.jstore.JstoreVo;

public interface Jcenter {
	// 공통
	public List<JcenterVo> centerSelect(Page page); // 본사Vo 리스트
	public List<JstoreVo> storeSelect(Page page);   // 가맹Vo 리스트
	
	// 공지사항
	public JcenterVo notiSelectOne(int sno);	  // 공지 상세보기
	public boolean notiInsert(JcenterVo vo); 	  // 공지 입력
	public boolean notiUpdate(JcenterVo vo); 	  // 공지 수정
	public boolean notiDelete(JcenterVo vo); 	  // 공지 삭제
	
	// 발주
	public JstoreVo orderSelectOne(int sno); 	  // 발주 상세보기
	public boolean orderOk(JstoreVo vo);		  // 발주 승인
	public boolean orderWait(JstoreVo vo);		  // 발주 대기 **
	
	// 발주 품목 관리
	public boolean orderListAdd(String product);
	public boolean orderListDelete(int sno);
	public boolean orderListChangeStatus(int sno);
	
	// 가맹 관리
	public JstoreVo JsaleFind2(String date1, String date2);   // 가맹 매출 조회
	public boolean storeBan(JstoreVo vo);		  // 가맹 해지 (본사 입장 )
	
	// 지역별 매출 현황
	public JpayAfterVo JsaleFind3(String mainLocal, String date1, String date2);
	public List<JstoreVo> selectStoreList(Page page, String district);
	// TOP3 가맹점 리스트 가져오기, 가맹 관리에서 지역별 가맹점 리스트 가져오기
	
	// 가맹 탈퇴 게시판
	public JstoreVo dropSelectOne(int sno); 	  // 가맹 탈퇴 상세보기
	public boolean banOk(JstoreVo vo);			  // 탈퇴 승인
	public boolean banWait(JstoreVo vo);		  // 탈퇴 대기 **
	
	// 회원 관리는 목록만 띄우고 끝
	// public List<JconsumerVo> consumerSelect(Page page);
}

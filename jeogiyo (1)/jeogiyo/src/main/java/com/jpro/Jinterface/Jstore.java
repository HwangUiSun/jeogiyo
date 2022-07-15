package com.jpro.Jinterface;

import java.util.List;

import com.jpro.common.J_orderVo;
import com.jpro.jcenter.JcenterVo;
import com.jpro.jstore.JstoreVo;
import com.jpro.jstore.Page;

public interface Jstore {
	// 공통
	public List<JcenterVo> centerSelect(Page page); // 본사Vo 리스트
	public List<JstoreVo> storeSelect(Page page);  // 가맹Vo 리스트
	
	// 공지사항
	public JcenterVo notiSelectOne(int sno);	  // 공지 상세보기
	
	// 발주
	public JstoreVo orderSelectOne(int sno); 	  // 발주 상세보기
	
	
	 public List<J_orderVo> orderList(J_orderVo vo);   // 강사님께 피드백 받기
	 public boolean JorderInput(J_orderVo vo);   // 강사님께 피드백 받기
	 public boolean JorderUpdate(J_orderVo vo ); // 강사님께 피드백 받기
	 public boolean JorderDelete(J_orderVo vo ); // 강사님께 피드백 받기
	
	
	// 매출관리
	public JstoreVo JsaleFind(String date1, String date2);	// 가맹 매출 조회
	
	// 주문현황
	// public boolean timeOut(jmenuVo vo);   // 완료처리 됐을 때
	// public boolean orderNope(jmenuVo vo); // 거부 클릭 시 리스트에서 삭제
	
	// 가맹 탈퇴
	public boolean dropSave(JstoreVo vo);	 // 가맹 탈퇴 작성 저장
	public boolean dropCancle(JstoreVo vo);  // 가맹 탈퇴 신청 클릭
	
	public JstoreVo login(JstoreVo vo);
}

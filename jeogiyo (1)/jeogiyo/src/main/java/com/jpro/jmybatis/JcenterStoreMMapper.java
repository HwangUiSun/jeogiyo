package com.jpro.jmybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jcenter.Page;
import com.jpro.jstore.JstoreVo;

@Mapper
@Repository
@Qualifier("JcenterStoreM")
public interface JcenterStoreMMapper {
	public List<JstoreVo> storeSelect(com.jpro.jcenter.Page page);
	public JstoreVo JsaleFind2(String date1, String date2);
	public boolean storeBan(JstoreVo vo);
	
	// 지역별 매출 현황
	public JstoreVo JsaleFind3(String date1, String date2);
	public List<JstoreVo> selectStoreList(Page page, String district);
	
	// 가맹 탈퇴 게시판
	public JstoreVo dropSelectOne(int sno);
	public boolean banOk(JstoreVo vo);
	public boolean banWait(JstoreVo vo);
	
	public int totSize(com.jpro.jcenter.Page page);
	
/*-----------------------------------------------------------------------------*/
	//가맹관리
	public List<JstoreVo> selectCenterStore(Page page);

	public Integer selectCenterStoreCount();
	
	public List<JstoreVo> selectCenterStoreBylocal(Map<String,Object> ParamPageAndlocal);

	public Integer selectCenterStoreBylocalCount(String local);
	
	public List<String> selectCenterSotreMainLocal();
/*--------------------------------------------------------------------------------*/
	
}

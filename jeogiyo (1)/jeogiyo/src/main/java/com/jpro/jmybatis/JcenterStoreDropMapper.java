package com.jpro.jmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jcenter.JcenterDropListVo;
import com.jpro.jcenter.Page;
import com.jpro.jstore.JstoreVo;


@Mapper
@Repository
@Qualifier("JcenterStoreDropMapper")
public interface JcenterStoreDropMapper {
	// 본사
	public Integer storeDrop(Page page);
	public List<JstoreVo> storeDropM(Page page);
	public List<JstoreVo> centerStoreFindstr(Page page);
	public JcenterDropListVo drop_view(String mid);
	
	// 가맹
	public int drop_insert(JstoreVo vo);
	
}

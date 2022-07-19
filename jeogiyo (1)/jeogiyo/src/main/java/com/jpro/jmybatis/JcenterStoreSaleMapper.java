package com.jpro.jmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jcenter.Page;
import com.jpro.jstore.JpayAfterVo;
import com.jpro.jstore.JstoreVo;

@Mapper
@Repository
@Qualifier("JcenterStoreSaleMapper")
public interface JcenterStoreSaleMapper {
	public JpayAfterVo JsaleFind3(String mainLocal, String date1, String date2);
	public List<JstoreVo> selectStoreList(Page page, String district);
}

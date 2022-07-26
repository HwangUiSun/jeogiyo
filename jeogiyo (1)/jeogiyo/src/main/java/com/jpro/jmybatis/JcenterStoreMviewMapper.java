package com.jpro.jmybatis;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jcenter.JpayAfterVo8;
import com.jpro.jstore.JpayAfterVo;
import com.jpro.jstore.JstoreVo;



@Mapper
@Repository
@Qualifier("JcenterStoreMviewMapper")
public interface JcenterStoreMviewMapper {
	public JstoreVo centerStoreMview (JstoreVo jstoreVo);
	public JpayAfterVo center_StoreMview2(JpayAfterVo rq);
	public List<JpayAfterVo8> centerStoreMview3 (JpayAfterVo8 vo);
	public Integer totHit(JpayAfterVo vo);
	public Integer JsaleFind3_all(JpayAfterVo vo);
	}

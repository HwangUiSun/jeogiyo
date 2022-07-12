package com.jpro.jmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.common.J_notiVo;
import com.jpro.common.Page;


@Mapper
@Repository
@Qualifier("notiMapper")
public interface JnotiMapper{
	public int totSize(Page page);
	public List<J_notiVo> select(Page page);
}

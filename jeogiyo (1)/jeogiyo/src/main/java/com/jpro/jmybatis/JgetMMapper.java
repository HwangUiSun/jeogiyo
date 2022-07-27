package com.jpro.jmybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jstore.JgetMVo;

@Mapper
@Repository
@Qualifier("JgetMMapper")
public interface JgetMMapper {
	public List<JgetMVo> chart(Map<String, String> map);

}

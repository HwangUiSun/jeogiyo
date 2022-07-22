package com.jpro.jmybatis;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jconsumer.JConsumerLoginVo;


@Mapper
@Repository
@Qualifier("JloginMapper")
public interface JloginMapper {
	
	public JConsumerLoginVo login(Map map);

}
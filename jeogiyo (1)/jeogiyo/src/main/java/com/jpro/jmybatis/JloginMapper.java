package com.jpro.jmybatis;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jconsumer.JConsumerLoginVo;
import com.jpro.jconsumer.JConsumerVo;


@Mapper
@Repository
@Qualifier("JloginMapper")
public interface JloginMapper {
	
	public JConsumerLoginVo login(Map map);
	public String findId(JConsumerLoginVo vo);
	public String findPwd(JConsumerLoginVo vo);

    public JConsumerLoginVo selectUserInfo(Object object); 
	public void updateUserInfo(JConsumerLoginVo attribute);
	public void insertUser(JConsumerLoginVo vo);
	
	

}
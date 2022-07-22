package com.jpro.jmybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jstore.JstoreVo;

@Mapper
@Repository
@Qualifier("J_loginMapper")
public interface J_loginMapper {
	public JstoreVo login(JstoreVo vo);
}

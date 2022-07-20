package com.jpro.jmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jcenter.JbaljuManageVo;
import com.jpro.jcenter.Page;

@Mapper
@Repository
@Qualifier("JbaljuManageMapper") 
public interface JbaljuManageMapper {
	public int selectTotoSize(Page page);
	public List<JbaljuManageVo> select(Page page);
	
}

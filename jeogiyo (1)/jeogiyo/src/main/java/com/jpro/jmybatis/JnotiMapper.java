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
	public J_notiVo selectOne(int sno); // sno 값 주고 데이터에서 알맞은 상세보기 가져오기 
	
	public int update(J_notiVo vo);  
	public int delete(int sno);  
	public int insert(J_notiVo vo);  
	
	
	
	
}

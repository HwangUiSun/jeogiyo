package com.jpro.jmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.jpro.jconsumer.JConsumerVo3;

import com.jpro.jconsumer.Page;

@Mapper
@Repository
@Qualifier("JorderlistMapper")
public interface JorderlistMapper {
	public int totSize(Page page);
	
	public List<JConsumerVo3> Jorderlist(Page cosumerpage);

	public void insertReview(JConsumerVo3 vo);
	

}

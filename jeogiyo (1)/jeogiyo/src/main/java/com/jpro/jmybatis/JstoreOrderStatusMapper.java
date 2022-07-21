package com.jpro.jmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jstore.JstoreOrderStatusVo;
import com.jpro.jstore.statusPage;

@Mapper
@Repository
@Qualifier("OrderStatusMapper")
public interface JstoreOrderStatusMapper {
	public int totSize(statusPage page);
	public List<JstoreOrderStatusVo> select(statusPage page);
	public int delete(int sno);
}

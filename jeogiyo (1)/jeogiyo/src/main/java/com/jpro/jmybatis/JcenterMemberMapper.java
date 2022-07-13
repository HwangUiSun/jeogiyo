package com.jpro.jmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jcenter.JcenterMemberVo;
import com.jpro.jcenter.Page;

@Mapper
@Repository
@Qualifier("mCenterMember")
public interface JcenterMemberMapper {
	public int totSize(Page page);
	public List<JcenterMemberVo> select(Page page);
}

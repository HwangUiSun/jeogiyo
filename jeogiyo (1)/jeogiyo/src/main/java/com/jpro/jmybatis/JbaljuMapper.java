package com.jpro.jmybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jpro.jstore.JbaljuListVo;
import com.jpro.jstore.JbaljudetailsVo;
import com.jpro.jstore.Page;

@Mapper
@Repository
@Qualifier("JbaljuMapper") 
public interface JbaljuMapper {
	public void createTable(Map<String, String> map); //테이블 복사 생성
	public void update(Map<String, String> map); // sno기준으로 한줄씩 데이터 변경(0로변경도 이힘수 사용)
	public void delete(Map<String, String> map); // drop table 테이블 삭제
	public void deleteSno(Map<String, String> map); // sno기준으로 한줄 품목 삭제
	public void insertVO(Map<String, String> map); // sno기준으로 한줄 품목 추가
	public void updateStatusTrue(Map<String, String> map); // sno기준으로 status True 설정
	public void updateStatusFalse(Map<String, String> map);// sno기준으로 status false 설정
	public int totSize(Page page);
	public List<JbaljudetailsVo> select(Page page);
	public List<JbaljuListVo> selectList(Page page);
	public List<JbaljuListVo> selecSubtList(Page page);
}

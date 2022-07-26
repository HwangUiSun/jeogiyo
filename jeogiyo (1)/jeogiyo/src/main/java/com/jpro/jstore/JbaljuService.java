package com.jpro.jstore;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.jpro.common.TableVo;
import com.jpro.jmybatis.JbaljuMapper;


@Service
public class JbaljuService {
	@Autowired
	@Qualifier("JbaljuMapper")
	JbaljuMapper mapper;
	Page page;
	
	@Autowired
	DataSourceTransactionManager transaction;
	TransactionStatus status;
	
	public Page getPage() {
		return this.page;
	}	

	
	public List<JbaljuListVo> selectList(Page page, String storeName){
		List<JbaljuListVo> list =new ArrayList<JbaljuListVo>();
		int totSize = 0;
		String sql = "select * from "+storeName+ " where ea = 0";
		try {
			totSize = mapper.totSize(page);		
			page.setTotSize(totSize);
			page.compute();	
			list = mapper.selectList(sql);
		}catch(Exception ex) {
			String msg = ex.getMessage();
					
		}
		
		return list;
	}
	public List<JbaljuListVo> selecSubtList(Page page,String storeName){
		List<JbaljuListVo> list =new ArrayList<JbaljuListVo>();
		String sql = "select * from "+storeName+ " where ea > 0";
		int totSize = 0;
		try {
			totSize = mapper.totSize(page);		
			page.setTotSize(totSize);
			page.compute();	
			list = mapper.selecSubtList(sql);			
		}catch(Exception ex) {
			String msg = ex.getMessage();
		
		}
		
		return list;
	}
	
	public void changeStatus(String title) {
		try {					
			mapper.changeStatus(title);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void waitOrder(String title) {
		try {					
			mapper.waitOrder(title);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public List<JbaljudetailsVo> select(Page mpage) {
		List<JbaljudetailsVo> list = new ArrayList<JbaljudetailsVo>();
		int totSize = 0;
		try {
			totSize = mapper.totSize(mpage);		
			mpage.setTotSize(totSize);
			mpage.compute();			
			list = mapper.select(mpage);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		this.page = mpage;
		return list;
	}
	
	public JbaljudetailsVo selectOneDetail(int sno) {
		
		JbaljudetailsVo vo = new JbaljudetailsVo();
		try {
			vo = mapper.selectOneDetail(sno);		
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return vo;
	}
	
	public String createTable(String mstoreName) {

		// 현재 날짜 구하기 (시스템 시계, 시스템 타임존)        
		LocalDate now = LocalDate.now();         
		// 연도, 월(문자열, 숫자), 일, 일(year 기준), 요일(문자열, 숫자)        
		int year = now.getYear();
		int monthValue = now.getMonthValue();        
		int dayOfMonth = now.getDayOfMonth();  
		String days = year+"_"+monthValue+"_"+dayOfMonth;
		String storeName=mstoreName ;
		String create_table = "CREATE TABLE "+storeName+days+ " AS select * from jbaljulist";
		Map<String,String> map = new HashMap<String,String>();
		map.put("create_table",create_table);
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			mapper.createTable(map);
			transaction.commit(status);
		}catch(Exception ex) {
			String msg = ex.getMessage();			
		}
		
		return storeName+days;
	}
	
	//row 한줄 ea값 변경 함수
	public void updateEa(int ea, int sno, String mstoreName) {
		String storeName=mstoreName ;
		String insertTable = "update "+ storeName+" set ea = \""+ea+" \"where sno = "+ sno;
		Map<String,String> map = new HashMap<String,String>();
		map.put("insertTable",insertTable);
		try {			
				mapper.update(map);
				status = transaction.getTransaction(new DefaultTransactionDefinition());				transaction.commit(status);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//row 한줄 ea값 0로 변경
	public void updateToZoro(int sno, String mstoreName) {
		String storeName=mstoreName ;
		String insertTable = "update "+storeName+" set ea = 0 where sno = "+ sno ;
		Map<String,String> map = new HashMap<String,String>();
		map.put("insertTable",insertTable);
		try {			
				mapper.update(map);
				status = transaction.getTransaction(new DefaultTransactionDefinition());
				transaction.commit(status);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//  테이블 완전 삭제
	public void droptable(String mstoreName) {		
		String drop_table = "drop table "+mstoreName;
		Map<String,String> map = new HashMap<String,String>();
		map.put("drop_table",drop_table);
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			mapper.delete(map);
			transaction.commit(status);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	//발주품목관리함수들
	//발주품목삭제
	public void deleteSno(int sno, String mstoreName) {
		String storeName= mstoreName;
		String deleteSno = "delete from "+storeName+" where sno = "+sno;
		Map<String,String> map = new HashMap<String,String>();
		map.put("deleteSno",deleteSno);
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			mapper.deleteSno(map);
			transaction.commit(status);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	//발주품목추가 
	public void insertVO(JbaljuListVo vo, String mstoreName) {
		String storeName = mstoreName;
		String category = vo.getCategory();
		String producName = vo.getProductName();
		
		String insert ="insert into "+storeName+" (category, productName, ea, status) "+
		"values(\""+category+"\", \""+producName+"\", 0, true)";  
		Map<String,String> map = new HashMap<String,String>();
		map.put("insert",insert);
		try {			
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			mapper.insertVO(map);
			transaction.commit(status);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	
	
	//발주품목관리 함수끝
	
	//jbaljulist status컬럼 값 변경 함수
	public void updateStatusTrue(int sno, String mstoreName){
		String storeName=mstoreName;
		String updateStatusTrue = "update "+ storeName +" set status = true where sno = "+sno;
		Map<String,String> map = new HashMap<String,String>();
		map.put("updateStatusTrue",updateStatusTrue);
		try {
		status = transaction.getTransaction(new DefaultTransactionDefinition());
		mapper.updateStatusTrue(map);
		transaction.commit(status);
	}catch(Exception ex) {
		ex.printStackTrace();
	}}
	
	public List<JbaljudetailsVo> selectTitle() {
		List<JbaljudetailsVo> list = null;
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			list = mapper.selectTitle();
			transaction.commit(status);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	public void updateStatusFalse(int sno, String mstoreName){
		String storeName=mstoreName;
		String updateStatusFalse = "update "+ storeName +" set status = false where sno = "+sno;
		Map<String,String> map = new HashMap<String,String>();
		map.put("updateStatusFalse",updateStatusFalse);
		try {
		status = transaction.getTransaction(new DefaultTransactionDefinition());
		mapper.updateStatusFalse(map);
		transaction.commit(status);
	}catch(Exception ex) {
		ex.printStackTrace();
	}}
	
	public String insertJbaljudetails(String title,String id) {
	
		String sql = "insert into jbaljudetails(title, id,status) values(\""+title+"\", \""+id+"\", false)";
		String msg="";
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			mapper.insertBalsulistTitle(sql);
			transaction.commit(status);
			msg="등록성공";
					
		}catch(Exception ex) {
			msg ="이미 있습니다";
		}
		return msg;
	}
	
	public boolean updateTable(String tableName) {
		boolean b = false;
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			mapper.updateTable(tableName);
			transaction.commit(status);
			b=true;					
		}catch(Exception ex) {
			
		}

		return b;
	}
	
}

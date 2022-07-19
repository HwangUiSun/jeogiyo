package com.jpro.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.jpro.jcenter.JcenterStoreVo;
import com.jpro.jmybatis.JnotiMapper;


@Service
public class J_notiService {
	@Autowired
	@Qualifier("notiMapper")
	JnotiMapper mapper;
	Page notipage;
	
	@Autowired
	DataSourceTransactionManager transaction;
	TransactionStatus status;
	
	public J_notiService() {
		System.out.println("J_notiService......");
	}
	public Page getPage() {
		return this.notipage;
	}
	
	
	
	public List<J_notiVo> select(Page notipage) {
		
		List<J_notiVo> list = null;
		this.notipage = notipage;
		try {	
			System.out.println(notipage);
			int totSize = mapper.totSize(notipage);	
			
			notipage.setTotSize(totSize);
			notipage.compute();
			list = mapper.select(notipage);
			System.out.println(list);
			System.out.println(totSize);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}
	
	
	
	public J_notiVo selectOne(int sno) {
		J_notiVo vo = null;
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			vo = mapper.selectOne(sno);
			transaction.commit(status);
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback(status);
		}
		return vo;
	}
	
	
	
	
	public boolean update(J_notiVo vo) {
		boolean b = false;
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			int cnt = mapper.update(vo);
			if(cnt>0) {
				transaction.commit(status);
				b=true;
			}else {
				transaction.rollback(status);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return b;
	}  
	
	
	public boolean delete(int sno) {
		boolean b = false;
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			int cnt=mapper.delete(sno);
			if(cnt>0) {
				transaction.commit(status);
				b = true;
			}else {
				transaction.rollback(status);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}  
	
	public boolean insert(J_notiVo vo) {
		boolean b = false;
		try {
			status = transaction.getTransaction(new DefaultTransactionDefinition());
			int cnt = mapper.insert(vo);
			
			if(cnt>0) {
				transaction.commit(status);
				b = true;
			}else {
				transaction.rollback(status);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	} 
	
}

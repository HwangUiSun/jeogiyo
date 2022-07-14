package com.jpro.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

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
		try {			
			int totSize = mapper.totSize(notipage);			
			notipage.setTotSize(totSize);
			notipage.compute();
			list = mapper.select(notipage);
			System.out.println(list);
			System.out.println(totSize);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		this.notipage = notipage;
		return list;
	}
	

}

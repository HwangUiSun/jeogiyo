package com.jpro.jstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

import com.jpro.jstore.statusPage;
import com.jpro.jmybatis.JstoreOrderStatusMapper;

@Service
public class JstoreOrderStatusService {
	@Autowired
	@Qualifier("OrderStatusMapper")
	JstoreOrderStatusMapper mapper;
	statusPage statusPage;
	
	@Autowired
	DataSourceTransactionManager transaction;
	TransactionStatus status;
	
	public JstoreOrderStatusService() {
		System.out.println("JstoreOrderStatusService...");
	}
	
	public statusPage getStatusPage() {
		return this.statusPage;
	}
	
public List<JstoreOrderStatusVo> select(statusPage statusPage) {
		
		List<JstoreOrderStatusVo> list = null;
		this.statusPage = statusPage;
		try {	
			System.out.println(statusPage);
			int totSize = mapper.totSize(statusPage);	
			
			statusPage.setTotSize(totSize);
			statusPage.compute();
			list = mapper.select(statusPage);
			System.out.println(list);
			System.out.println(totSize);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}

}

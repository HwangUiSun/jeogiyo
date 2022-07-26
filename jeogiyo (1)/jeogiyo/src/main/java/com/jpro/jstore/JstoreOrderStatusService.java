package com.jpro.jstore;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

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
			System.out.println(statusPage.getNowPage());
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}

public String orderTimeMin(HttpServletRequest req) {
	HttpSession session = req.getSession();
	String min = "hi";
	session.setAttribute("min", min);
	return min;
	
}

public String orderTimeSec(HttpServletRequest req) {
	HttpSession session = req.getSession();
	String sec = null;
	session.setAttribute("sec", sec);
	return sec;
	
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

}

package com.jpro.jcenter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.jpro.jmybatis.JcenterStoreMviewMapper;
import com.jpro.jstore.JpayAfterVo;
import com.jpro.jstore.JstoreVo;

@Service
public class JcenterStoreMviewService {
	
	 @Autowired
	   DataSourceTransactionManager transaction;
	   TransactionStatus status;

	@Autowired
	@Qualifier("JcenterStoreMviewMapper")
	JcenterStoreMviewMapper mapper;
	
	public JstoreVo view(String storeName, String mid) {
		JstoreVo vo = null;
		status = transaction.getTransaction(new DefaultTransactionDefinition());
		try {
			JstoreVo paramJstoreVo = new JstoreVo();
			paramJstoreVo.setStoreName(storeName);
			paramJstoreVo.setMid(mid);
			
			
			vo = mapper.centerStoreMview(paramJstoreVo);
			transaction.commit(status);
			System.out.println("성공");
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback(status);
		} 
		return vo;
	}
	
	public List<JpayAfterVo8> view3(JpayAfterVo8 vo) {

		status = transaction.getTransaction(new DefaultTransactionDefinition());
		try {
			List<JpayAfterVo8>  jpayAfterVo8 = mapper.centerStoreMview3(vo);
			transaction.commit(status);
			System.out.println("성공");
			
			return jpayAfterVo8;
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback(status);
			throw ex;
		} 

	}
	
	
	
	
	public Integer view2(JpayAfterVo qr) {
		int sno = 0;
		status = transaction.getTransaction(new DefaultTransactionDefinition());
		try {
			qr = mapper.center_StoreMview2(qr);
			transaction.commit(status);
			System.out.println("성공");
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback(status);
		} 
		return sno;
	}
	


	
	
	
}

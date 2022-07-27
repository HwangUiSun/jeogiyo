package com.jpro.jstore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.jpro.jmybatis.JcenterStoreDropMapper;
import com.jpro.jmybatis.JgetMMapper;

@Service
public class JgetMService {

	
	@Autowired
	JgetMMapper mapper;
	
	@Autowired
	DataSourceTransactionManager transaction;
	TransactionStatus status;
	
	public List<JgetMVo> chart(String date1, String date2) {
		List<JgetMVo> list = null;
		status = transaction.getTransaction(new DefaultTransactionDefinition());
		Map<String, String> map  = new HashMap<String, String>();

		map.put("date1", date1);
		map.put("date2", date2);

		
		try {
			
			list = mapper.chart(map);			
			transaction.commit(status);
	
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}
	
}

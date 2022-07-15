package com.jpro.jconsumer;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

import com.jpro.common.J_notiVo;
import com.jpro.common.Page;
import com.jpro.jmybatis.JConsumerMapper;

@Service
public class JConsumerService {
	@Autowired
	@Qualifier("consumerMapper")
	JConsumerMapper mapper;
	com.jpro.jconsumer.Page consumerpage;
	
	@Autowired
	DataSourceTransactionManager transaction;
	TransactionStatus status;
	
	public JConsumerService() {
		System.out.println("JConsumerService......");
	}
	public com.jpro.jconsumer.Page getPage() {
		return this.consumerpage;
	}
	
	public List<JConsumerVo> storeSelect(com.jpro.jconsumer.Page cosumerpage) {
		
		List<JConsumerVo> list = null;
		try {			
			int totSize = mapper.totSize(cosumerpage);			
			cosumerpage.setTotSize(totSize);
			cosumerpage.compute();
			list = mapper.storeSelect(cosumerpage);
			System.out.println(list);
			System.out.println(totSize);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		this.consumerpage = cosumerpage;
		return list;

}
}


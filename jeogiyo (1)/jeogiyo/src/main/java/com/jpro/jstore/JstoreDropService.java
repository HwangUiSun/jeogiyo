package com.jpro.jstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.jpro.jcenter.JcenterDropListVo;
import com.jpro.jcenter.Page;
import com.jpro.jmybatis.JcenterStoreDropMapper;

@Service
public class JstoreDropService implements JcenterStoreDropMapper{
	
	@Autowired
	JcenterStoreDropMapper mapper;
	
	@Autowired
	DataSourceTransactionManager transaction;
	TransactionStatus status;
	
	@Override
	public Integer storeDrop(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JcenterDropListVo> storeDropM(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JcenterDropListVo> centerStoreFindstr(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int drop_insert(JstoreVo vo) {
		int b = 0;
		System.out.println(vo.getDoc());
		status = transaction.getTransaction(new DefaultTransactionDefinition());
		try {
			b = mapper.drop_insert(vo);
			if(b > 0) {
				transaction.commit(status);
			}else {
				transaction.rollback(status);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return b;
	}

	@Override
	public JcenterDropListVo drop_view(String storeName) {
		JcenterDropListVo vo = null;
		
		try {
			vo = mapper.drop_view(storeName);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return vo;
	}
	
	
	
}

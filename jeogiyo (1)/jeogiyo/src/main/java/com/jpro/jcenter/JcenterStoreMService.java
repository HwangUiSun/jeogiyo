package com.jpro.jcenter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

import com.jpro.Jinterface.Jcenter;
import com.jpro.jmybatis.JcenterStoreMMapper;
import com.jpro.jstore.JstoreVo;

@Service
public class JcenterStoreMService implements Jcenter{
	
	@Autowired
	@Qualifier("JcenterStoreM")
	JcenterStoreMMapper mapper;
	Page page;
	
	@Autowired
	DataSourceTransactionManager transaction;
	TransactionStatus status;
	
	public Page getPage() {
		return this.page;
	}

	@Override
	public List<JstoreVo> storeSelect(Page page) {
		List<JstoreVo> list = null;
		try {
			page.setFindStr("서울");
			int totSize = mapper.totSize(page);
			page.setTotSize(totSize);
			page.compute();
			list = mapper.storeSelect(page);
			System.out.println("sertoto"+totSize);
			System.out.println(list);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public JstoreVo JsaleFind2(String date1, String date2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean storeBan(JstoreVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<JstoreVo> selectStoreList(Page page, String district) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// 안씀

	@Override
	public List<JcenterVo> centerSelect(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JcenterVo notiSelectOne(int sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean notiInsert(JcenterVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notiUpdate(JcenterVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notiDelete(JcenterVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JstoreVo orderSelectOne(int sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean orderOk(JstoreVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean orderWait(JstoreVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean orderListAdd(String product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean orderListDelete(int sno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean orderListChangeStatus(int sno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JstoreVo JsaleFind3(String date1, String date2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JstoreVo dropSelectOne(int sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean banOk(JstoreVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean banWait(JstoreVo vo) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

package com.jpro.jcenter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

import com.jpro.Jinterface.Jcenter;
import com.jpro.jmybatis.JcenterStoreSaleMapper;
import com.jpro.jstore.JpayAfterVo;
import com.jpro.jstore.JstoreVo;

@Service
public class JcenterStoreSaleService implements Jcenter{

	@Autowired
	@Qualifier("JcenterStoreSaleMapper")
	JcenterStoreSaleMapper mapper;
	
	@Autowired
	DataSourceTransactionManager transaction;
	TransactionStatus status;

	@Override
	public List<JcenterVo> centerSelect(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public boolean storeBan(JstoreVo vo) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<JstoreVo> storeSelect(Page page) {
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
	public JstoreVo JsaleFind2(String date1, String date2) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer JsaleFind3(JpayAfterVo vo) {
		System.out.println("Sale Service OK...");
		Integer totSale = 0;
		System.out.println(vo.getAddress());
		System.out.println(vo.getDate1());
		System.out.println(vo.getDate2());
		String main = vo.getMainLocal();
		try {
			totSale = mapper.JsaleFind3(main);
			System.out.println("try 성공");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return totSale;
	}

	@Override
	public List<JstoreVo> selectStoreList(Page page, String district) {
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

package com.jpro.jcenter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		try {
			if(vo.getAddress().equals("전지역")) {
				totSale = mapper.JsaleFind3_all(vo);
			}else {
				totSale = mapper.JsaleFind3(vo);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return totSale;
	}
	
	public Integer totHit(JpayAfterVo vo) {
		Integer totHit = 0;
		
		try {
			if(vo.getAddress().equals("전지역")) {
				totHit = mapper.totHit_all(vo);
			}else {
				totHit = mapper.totHit(vo);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return totHit;
	}

	@Override
	public List<JpayAfterVo> selectStoreList(JpayAfterVo vo) {
		List<JpayAfterVo> list = null;
		
		try {
			if(vo.getAddress().equals("전지역")) {
				list = mapper.storeSaleList_all(vo);
				System.out.println("전지역" + list);
			}else {
				list = mapper.storeSaleList(vo);
				System.out.println("전지역말고" + list);
				System.out.println(list.get(0).getStoreName());
				System.out.println(list.get(0).getHarutotal());
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
			
		return list;
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

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
	
	
// 스토어 네임 추출
	public String StoreName(String mid) {
		String stn = ""; 
		try {
			stn=mapper.selectStoreName(mid);
		}catch (Exception e) {
			e.printStackTrace();
		}	
		return stn;
	}
	
	// 가맹에서 매출관리 눌렀을때
		public List<JpayAfterVo> selectOne(String mid, com.jpro.common.Page page) {
			List<JpayAfterVo> list =  null;
			try {
				// 스토어 네임
				String stn=mapper.selectStoreName(mid);
				System.out.println(stn);
				// totsize 
				int totSize = mapper.StoreNametotSize(stn);
				page.setTotSize(totSize);
				page.setStoreName(stn);
				page.compute();
				System.out.println("tot"+page.getTotSize());
				
				list=mapper.selectSale(page);

			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			return list;
		}
		
		// 설정된 기간 리스트 출력
		public List<JpayAfterVo> selectSaleday(String mid, JpayAfterVo vo, com.jpro.common.Page page){
			List<JpayAfterVo> list = null;
			int total = 0;
			try {
	
				// totsize 
				int totSize = mapper.selectSaledaytotSize(vo);
				System.out.println(totSize);
				page.setTotSize(totSize);
				page.setStoreName(vo.getStoreName());
				page.compute();
				list=mapper.selectSaleday(vo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			return list;
		}
		
		
		// 설정된 기간 총 금액 출력
		public int selectSaledayAll(JpayAfterVo vo) {
			int a = 0;
			try {
				a = mapper.selectSaledayAll(vo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return a;
		}
		
		
		// 설정된 기간 총 판매 건수 출력
		public int selectSaledayAllHit(JpayAfterVo vo) {
			int b = 0;
			try {
				b = mapper.selectSaledayAllHit(vo);
			} catch (Exception e) {
			}
			
			return b;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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

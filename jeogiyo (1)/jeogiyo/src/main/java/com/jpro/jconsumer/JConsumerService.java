package com.jpro.jconsumer;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.web.multipart.MultipartFile;

import com.jpro.jmybatis.JConsumerMapper;
import com.jpro.jmybatis.JloginMapper;
import com.jpro.jmybatis.JorderlistMapper;

@Service
public class JConsumerService implements JConsumerInterface {
	@Autowired
	@Qualifier("consumerMapper")
	JConsumerMapper mapper;
	com.jpro.jconsumer.Page consumerpage;
	
	@Autowired
	@Qualifier("JorderlistMapper")
	JorderlistMapper amapper;
	Page apage;
	
	@Autowired
	@Qualifier("JloginMapper")
	JloginMapper JloginMapper;
	
	@Autowired
	DataSourceTransactionManager transaction;
	TransactionStatus status;
	Page page;
	
	public JConsumerService() {
		System.out.println("JConsumerService......");
	}
	public com.jpro.jconsumer.Page getPage() {
		return this.page;
	}
	
	public List<JconsumerVo2> storeSelect(com.jpro.jconsumer.Page cosumerpage) {
		
		List<JconsumerVo2> list = null;
		try {
			System.out.println(cosumerpage.getStartNo());
			System.out.println(cosumerpage.getListSize());
			System.out.println(cosumerpage.getMapFindStr());
			System.out.println(cosumerpage.getStoreFindStr());
			System.out.println(cosumerpage.getFindStore());
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
	public JConsumerLoginVo login(String mid, String pwd) {
		JConsumerLoginVo rVo = null;
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("mid", mid);
		map.put("pwd", pwd);
		System.out.println(map);
	
		try {  
	        
			rVo = JloginMapper.login(map);

			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(JloginMapper.login(map));
		return rVo;
	}
	
	
	public String findId(JConsumerLoginVo vo) {
	String mId ="";
		
		try {
			mId=JloginMapper.findId(vo);
	
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return mId;
		
	}
	public String findPwd(JConsumerLoginVo vo) {
	String pwd ="";
		
		try {
			pwd=JloginMapper.findPwd(vo);
	
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return pwd;
		
	}
	@Override
	public String JmenuSelect() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Jbag(String J_foodImg, String J_foodInfo, int J_menuPrice) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String Jpayhistory(int J_menuPrice) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void JpayAfter(String J_address, String J_apiAddressDetail, String J_totalPrice) {
		// TODO Auto-generated method stub
		
	}

	//마이페이지
	@Override 
	public JConsumerLoginVo selectUserInfo(Object object) {
		JConsumerLoginVo vo =null;
		
		try {
			vo = JloginMapper.selectUserInfo(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
		  
    //마이페이지 수정
	@Override
	public void updateUserInfo(JConsumerLoginVo vo) {
		
		try {
			JloginMapper.updateUserInfo(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * @Override
	 * public void updateUserInfo(JConsumerLoginVo vo) {
	 * 	public JConsumerLoginVo updateUserInfo(Object attribute) {
		// TODO Auto-generated method stub
		return null;
	} }
	 */
	
	 
	
	@Override
	public List<JConsumerVo3> Jorderlist(Page apage) {		
		List<JConsumerVo3> list = null;
		try {			
			int totSize = amapper.totSize(apage);			
			apage.setTotSize(totSize);
			apage.compute();
			list = amapper.Jorderlist(apage);
			//System.out.println(list);
			System.out.println("dd"+totSize);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(apage.getEndPage());
		this.page = apage;
		return list;

}
	@Override
	public List<BoardAtt> upload(List<MultipartFile> multi) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> JReviewList(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<String> JFAQ(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}
	public void insertOrder(JConsumerVo3 vo) {
		amapper.insertOrder(vo);
	}
	public JConsumerVo3 selectOneVo(String sno) {
		JConsumerVo3 rvo = null;
		rvo = amapper.selectOneVo(sno);
		return rvo;
	}
	public void insertPayHistory(JpayHistoryVo vo) {
		mapper.insertPayHistory(vo);
		
	}
	@Override
	public String JMyPage(String mId, String name, String email, int phone, int zipcode, String address) {
		// TODO Auto-generated method stub
		return null;
		}
	@Override
	public String JMyPageChange(String mId, String name, String email, int phone, int zipcode, String address) {
		// TODO Auto-generated method stub
		return null;
	}
	public void insertUser(JConsumerLoginVo vo) {
		JloginMapper.insertUser(vo);
		
	}
	@Override
	public void insertReview(JConsumerVo3 vo) {
		amapper.insertReview(vo);
		
	}
	public List<JConsumerVo3> review(Page apage) {
		List<JConsumerVo3> list = null;
		try {
		int totpage = amapper.totpage(apage);			
		apage.setTotSize(totpage);
		apage.compute();
		list = amapper.reviewInput(apage);
		System.out.println(list);
		System.out.println(totpage);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		this.apage = apage;
		return list;
		
	}

}

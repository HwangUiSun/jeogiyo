package com.jpro.jconsumer;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.web.multipart.MultipartFile;

import com.jpro.jmybatis.JConsumerMapper;

@Service
public class JConsumerService implements JConsumerInterface {
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
	
	public List<JconsumerVo2> storeSelect(com.jpro.jconsumer.Page cosumerpage) {
		
		List<JconsumerVo2> list = null;
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
	public JConsumerVo login(JConsumerVo vo, HttpServletRequest req) {
		// TODO Auto-generated method stub
		return null;
	}
	public String findId(JConsumerVo vo) {
	String mId ="";
		
		try {
			mId=mapper.findId(vo);
	
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return mId;
		
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
	@Override
	public List<String> JOrderList(List<String> list) {
		// TODO Auto-generated method stub
		return null;
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
}


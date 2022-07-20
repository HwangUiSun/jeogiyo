package com.jpro.jcenter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpro.jmybatis.JbaljuManageMapper;
import com.jpro.jmybatis.JcenterStoreDropMapper;

@Service
public class JbaljuManageService {
	
	@Autowired
	@Qualifier("JbaljuManageMapper")
	JbaljuManageMapper mapper;
	Page page;
	
	
	public List<JbaljuManageVo> memberSelect(Page page) {
		List<JbaljuManageVo> list = null;
		try {			
			int totSize = mapper.selectTotoSize(page);			
			page.setTotSize(totSize);
			page.compute();
			list = mapper.select(page);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		this.page = page;
		return list;

	}
	
	
	public boolean changeStatus(String rsno, String rbool) {
		boolean b = false;
		String sno = rsno;
		String bool = rbool;
		Map<String, String> map = new HashMap<String, String>();
		try {
			map.put("sno", sno);
			map.put("bool", bool);
			mapper.changeStatus(map);
			
			b=true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return b;

	}
	
	public boolean add(String str) {
		boolean b = false;
		String productName = str;		

		try {
			mapper.add(productName);			
			b=true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return b;

	}
	
	public boolean sub(String rsno) {
		boolean b = false;
		String sno = rsno;
	
		try {
			mapper.sub(sno);			
			b=true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return b;

	}
}

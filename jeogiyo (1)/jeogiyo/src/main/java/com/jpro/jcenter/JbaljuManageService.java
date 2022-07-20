package com.jpro.jcenter;

import java.util.List;

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
			System.out.println(totSize);
			System.out.println(list);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		this.page = page;
		return list;

	}
}

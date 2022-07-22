package com.jpro.jcenter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpro.jmybatis.JcenterStoreDropMapper;
import com.jpro.jstore.JstoreVo;

@Service
public class JcenterstoreDropService {

	@Autowired
	@Qualifier("JcenterStoreDropMapper")
	JcenterStoreDropMapper mapper;
	Page page;
	
	
	public Page getPage() {
		return this.page;
	}
	
	public List<JcenterDropListVo> storeDrop(Page page){
		List<JcenterDropListVo> list = null;
		this.page = page;
		try {
			int totSize = mapper.storeDrop(page);
			System.out.println(totSize);
			page.setTotSize(totSize);
			page.compute();
			list = mapper.storeDropM(page);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

	
	
	
	
	
}

package com.jpro.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpro.jmybatis.J_loginMapper;
import com.jpro.jstore.JstoreVo;

@Service
public class J_loginService {
	
	@Autowired
	@Qualifier("J_loginMapper")
	J_loginMapper J_loginMapper;
	
	
	public J_loginService() {
		System.out.println("J_loginService OK.....");
	}
	
	public JstoreVo login(JstoreVo vo, HttpServletRequest req) {
		JstoreVo rVo = null;
		
		HttpSession session = req.getSession();
		try {
			rVo = J_loginMapper.login(vo);
			System.out.println(rVo.getMid());
			
			if(rVo != null) {
				session.setAttribute("mid", rVo.getMid());
				System.out.println("성공");
			}else {
				session.setAttribute("mid", null);
				System.out.println("실패");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return rVo;
	}
	
}

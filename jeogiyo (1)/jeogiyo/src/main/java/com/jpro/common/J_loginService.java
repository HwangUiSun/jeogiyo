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
		String msg = "";
		
		HttpSession session = req.getSession();
		try {
			rVo = J_loginMapper.login(vo);
			
			if(rVo != null) {
				session.setAttribute("mid", rVo.getMid());
			}else {
				session.setAttribute("mid", null);
				msg = "아이디나 비밀번호를 확인해주세요.";
				session.setAttribute("msg", msg);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return rVo;
	}
	
}

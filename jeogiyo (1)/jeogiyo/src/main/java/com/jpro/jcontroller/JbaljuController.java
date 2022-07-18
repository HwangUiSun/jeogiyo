package com.jpro.jcontroller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpro.jstore.JbaljuService;
import com.jpro.jstore.JbaljuListVo;

@RestController
public class JbaljuController {
	@Autowired
	JbaljuService dao;
	//테이블 복사 생성 (가맹 발주하기 페이지 갈때 테이블 생성)
	@RequestMapping("cTable")
	public ModelAndView createTable(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		String storeName = (String)req.getAttribute("mid"); 
		//String storeName = "testStore"; //테스트할려고 넣은 변수이므로 주석처리나 삭제해도되욤
		dao.createTable(storeName);
		mv.setViewName("center/center_index");		
		return mv;
	}
	//복사 테이블 드랍하는 함수(가맹 발주신청페이지에서 삭제버튼눌루면 사용)
	@RequestMapping("dTable")
	public ModelAndView deleteTable(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		//(실 사용 변수) String storeName = (String)req.getAttribute("storeName");
		String storeName = "testStore"; //테스트할려고 넣은 변수이므로 주석처리나 삭제해도되욤
		dao.droptable(storeName);
		mv.setViewName("center/center_index");		
		return mv;
	}
	
	//ea 갯수 변경 하기
	@RequestMapping("updateEa")
	public ModelAndView updateTable(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		//(실 사용 변수) int ea = Integer.parse(req.getAttribute("ea"));
		//(실 사용 변수) int sno = Integer.parse(req.getAttribute("sno"));
		//(실 사용 변수) String storeName = (String)req.getAttribute("storeName");
		String storeName= "jbaljulist";
		int ea =5;
		int sno = 50; //테스트할려고 넣은 변수이므로 주석처리나 삭제해도되욤
		dao.updateEa(ea,sno,storeName);
		mv.setViewName("center/center_index");		
		return mv;
	}
	
	//ea값 0으로 셋팅
	@RequestMapping("updateToZoro")
	public ModelAndView updateToZoro(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		//(실 사용 변수) int sno = Integer.parse(req.getAttribute("sno"));
		//(실 사용 변수) String storeName = (String)req.getAttribute("storeName");
		int sno = 50; //테스트할려고 넣은 변수이므로 주석처리나 삭제해도되욤
		String storeName= "jbaljulist";
		dao.updateToZoro(sno,storeName);
		mv.setViewName("center/center_index");		
		return mv;
	}
	
	//sno기준 한줄 삭제
	@RequestMapping("deleteSno")
	public ModelAndView deleteSno(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		//(실 사용 변수) int sno = Integer.parse(req.getAttribute("sno"));
		//(실 사용 변수) String storeName = (String)req.getAttribute("storeName");
		int sno = 52; //테스트할려고 넣은 변수이므로 주석처리나 삭제해도되욤
		String storeName= "jbaljulist";
		dao.deleteSno(sno,storeName);
		mv.setViewName("center/center_index");		
		return mv;
	}
	
	//JbaljuListVo 추가하기
	@RequestMapping("insertVO")
	public ModelAndView insertVO(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		//(실 사용 변수) jbaljuListVo vo = (jbaljuListVo)req.getAttribute("vo");
		//(실 사용 변수) String storeName = (String)req.getAttribute("storeName");
		JbaljuListVo vo = new JbaljuListVo("테스트카테고리","테스트제품이름",10,true); //테스트할려고 넣은 변수이므로 주석처리나 삭제해도되욤
		String storeName= "jbaljulist";
		dao.insertVO(vo,storeName);
		mv.setViewName("center/center_index");		
		return mv;
	}
		
	//jbaljulist status컬럼 값 변경 함수
	@RequestMapping("updateStatusTrue")
	public ModelAndView updateStatusTrue(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		//(실 사용 변수) int sno = Integer.parse(req.getAttribute("sno"));
		//(실 사용 변수) String storeName = (String)req.getAttribute("storeName");
		int sno = 50; //테스트할려고 넣은 변수이므로 주석처리나 삭제해도되욤
		String storeName= "jbaljulist";
		dao.updateStatusTrue(sno,storeName);
		mv.setViewName("center/center_index");		
		return mv;
	}

	@RequestMapping("updateStatusFalse")
	public ModelAndView updateStatusFalse(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		//(실 사용 변수) int sno = Integer.parse(req.getAttribute("sno"));
		//(실 사용 변수) String storeName = (String)req.getAttribute("storeName");
		int sno = 50; //테스트할려고 넣은 변수이므로 주석처리나 삭제해도되욤
		String storeName= "jbaljulist";
		dao.updateStatusFalse(sno,storeName);
		mv.setViewName("center/center_index");		
		return mv;
	}
	
}

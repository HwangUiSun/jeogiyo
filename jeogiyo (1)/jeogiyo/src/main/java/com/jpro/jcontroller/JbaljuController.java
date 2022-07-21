package com.jpro.jcontroller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpro.jstore.JbaljuService;
import com.jpro.jcenter.JbaljuManageService;
import com.jpro.jcenter.JbaljuManageVo;
import com.jpro.jcenter.Page;
import com.jpro.jstore.JbaljuListVo;

@RestController
public class JbaljuController {
	@Autowired
	JbaljuService dao;
	
	@Autowired
	JbaljuManageService baljuManagedao;
	//테이블 복사 생성 (가맹 발주하기 페이지 갈때 테이블 생성)
	
	
	@RequestMapping("baljuM")
	public ModelAndView baljumain(Page page, HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		String url = "../center/baljumagang.jsp";
		mv.addObject("inc",url);
		List<JbaljuManageVo> list = baljuManagedao.memberSelect(page);
		mv.addObject("JbaljuManage",list);
		mv.setViewName("center/center_index");		
		return mv;
	}
	
	@RequestMapping("changS")
	public ModelAndView changeStatus(Page page, HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		
		String sno = req.getParameter("sno");
		String bool = req.getParameter("bool");
		boolean b = baljuManagedao.changeStatus(sno, bool);
		if(b == true) {
			String url = "../center/baljumagang.jsp";
			mv.addObject("inc",url);
			List<JbaljuManageVo> list = baljuManagedao.memberSelect(page);
			mv.addObject("JbaljuManage",list);
			mv.setViewName("center/center_index");
			return mv;
		}
		String url = "../common/order_main2.jsp";
		mv.addObject("inc",url);
		mv.setViewName("center/center_index");		
		return mv;
	}
	
	
	
	@RequestMapping("addsub")
	public ModelAndView addsub(Page page, HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();	
		List<JbaljuManageVo> list = null;
		String bool= req.getParameter("addsub");			
		String productName = req.getParameter("productName");
		if(productName.equals("") || productName == null) {
			String url = "../center/baljumagang.jsp";
			mv.addObject("inc",url);
			String str="제품이름이 없습니다.";
			list = baljuManagedao.memberSelect(page);
			mv.addObject("JbaljuManage",list);
			mv.addObject("str",str);
			mv.setViewName("center/center_index");
			return mv;
		}
		String sno = req.getParameter("selectSno");
		list = baljuManagedao.memberSelect(page);
		boolean b = false;
		boolean check = true;
		if(bool.equals("add")) {

			String str = "";
			for(JbaljuManageVo i : list) {
				if(i.getProductName().equals(productName)) {
					str = "이미 있는 제품이름 입니다.";
					check = false;	
					b =true;
				}else {					
					continue;
				}				
			}
			if(check) {
				b = baljuManagedao.add(productName);
				str = "등록완료되었습니다";
			}			
			mv.addObject("str",str);
		}else {
			
			b = baljuManagedao.sub(sno);
			String str = "삭제완료되었습니다.";
			mv.addObject("str",str);
		}
		
		if(b == true) {
			String url = "../center/baljumagang.jsp";
			mv.addObject("inc",url);
			list = baljuManagedao.memberSelect(page);
			mv.addObject("JbaljuManage",list);
			mv.setViewName("center/center_index");
			return mv;
		}
		String url = "../common/order_main2.jsp";
		mv.addObject("inc",url);
		mv.setViewName("center/center_index");		
		return mv;
	}
	
	
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

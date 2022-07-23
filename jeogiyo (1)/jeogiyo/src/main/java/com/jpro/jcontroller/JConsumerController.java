 package com.jpro.jcontroller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpro.jconsumer.JConsumerLoginVo;
import com.jpro.jconsumer.JConsumerService;
import com.jpro.jconsumer.JConsumerVo;
import com.jpro.jconsumer.JConsumerVo3;
import com.jpro.jconsumer.JconsumerVo2;
import com.jpro.jconsumer.JpayHistoryVo;
import com.jpro.jconsumer.Page;


@RestController
public class JConsumerController {
	@Autowired
	JConsumerService dao;

	

	//메인페이지 메인
	@RequestMapping("consumer")
	public ModelAndView order() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/Jlogin");
		
		return mv;
	}
	//로그인페이지
	
	@RequestMapping("loginBtn")
	public ModelAndView loginBtn( HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		HttpSession session =req.getSession();
		System.out.println(req.getSession());
	    String mid =req.getParameter("mId");
		String pwd = req.getParameter("password");
		System.out.println(mid);
		System.out.println(pwd);
		JConsumerLoginVo rVo = dao.login(mid, pwd);
		mv.addObject("rVo",rVo);
		System.out.println(rVo+"fff");
		HttpSession s = req.getSession();
		if(rVo != null) {
			session.setAttribute("id", rVo.getMid());
			mv.setViewName("jconsumer/Jconsumer_index");
		}else{
			mv.setViewName("jconsumer/Jlogin_result");
		}
		return mv;
	
	}
	
/*	@RequestMapping("loginR")
	public ModelAndView loginR(JConsumerVo vo , HttpServletRequest req) {
				//service에서 로그인 할때 vo, req를 보내왔기때문에 매개변수로 잡음
		ModelAndView mv = new ModelAndView();
		JConsumerVo rVo = dao.login(vo,req);
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc",url);	
		
		@RequestMapping("login_fail")
	public ModelAndView login_fail() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jconsumer/Jlogin");
		
		return mv;
	}
		
				
		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}*/
	
	@RequestMapping("Jlogin_fail")
	public ModelAndView login_fail() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jconsumer/Jlogin");		
		return mv;
	}
	
	
	@RequestMapping("JsignUp")
	public ModelAndView Jlogin() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JsignUp");
		
		return mv;
	}
	
	@RequestMapping("JfindId")
	public ModelAndView JfindId() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JfindId");
		
		return mv;
	}
	
	@RequestMapping("JfindPwd")
	public ModelAndView JfindPwd() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JfindPwd");
		
		return mv;
	}
	
	//아이디찾기
	/*@RequestMapping("findIdBtn")
	public ModelAndView findIdBtn(JConsumerVo vo) {
		ModelAndView mv = new ModelAndView();
		String id = dao.findId(vo);
				
		mv.addObject("msg", id);
		
		mv.setViewName("jconsumer/find_id_result");
		
		return mv;
	}*/
	/*@RequestMapping("findIdBtn")
	public ModelAndView findIdBtn() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/Jlogin");
		
		return mv;
	}*/
	@RequestMapping("findIdR")
	public ModelAndView findIdR(JConsumerLoginVo vo) {
		ModelAndView mv = new ModelAndView();
		String mid = dao.findId(vo);
		
		mv.addObject("msg", mid);
		mv.setViewName("jconsumer/find_id_result");
		return mv;
	}
	
	//비밀번호 찾기
	/*@RequestMapping("findPwdBtn")
	public ModelAndView findPwdBtn() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/Jlogin");
		
		return mv;
	}*/
	
	@RequestMapping("findPwdR")
	public ModelAndView findPwdR(JConsumerLoginVo vo) {
		ModelAndView mv = new ModelAndView();
		String pwd = dao.findPwd(vo);
		
		mv.addObject("msg", pwd);
		mv.setViewName("jconsumer/find_pwd_result");
		return mv;
	}
	
	
	
	
	
	//회원가입페이지
	
	@RequestMapping("signUpBtn")
	public ModelAndView signUpBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc",url);
		/*List<JConsumerVo> conlist = dao.storeSelect(consumerpage); 
		consumerpage = dao.getPage();
		mv.addObject("storeSelectlist",conlist);
		mv.addObject("storeSelectpage",consumerpage);*/

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	
	//top
	@RequestMapping("homeBtn")
	public ModelAndView top1() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		
		return mv;
	}
	
	@RequestMapping("JstoreSelect")
	public ModelAndView JstoreSelect(Page page) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc",url);
		
		System.out.println("111");
		List<JconsumerVo2> conlist = dao.storeSelect(page); 
		System.out.println(conlist);
		page = dao.getPage();
		mv.addObject("storeSelectlist",conlist);
		mv.addObject("consumerpage",page);
		mv.setViewName("jconsumer/Jconsumer_index");	
		return mv;
	}
	
	@RequestMapping("MyPage")
	public ModelAndView MyPage(Page page, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		HttpSession session =req.getSession();
		JConsumerLoginVo rVo = dao.selectUserInfo(session.getAttribute("id"));
		page=dao.getPage();
		mv.addObject("mid" , rVo.getMid());
		mv.addObject("name" , rVo.getName());
		mv.addObject("phone" , rVo.getPhone());
		mv.addObject("zipcode" , rVo.getZipcode());
		mv.addObject("address" , rVo.getAddress());
		mv.addObject("email" , rVo.getEmail());
		
		String url = "../jconsumer/MyPage.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	@RequestMapping("JorderList")
	public ModelAndView MyPJorderListage(Page page) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JorderList.jsp";

		mv.addObject("inc",url);
		System.out.println("222");
		List<JConsumerVo3> conlist = dao.Jorderlist(page); 
		System.out.println(conlist);
		page = dao.getPage();
		mv.addObject("orderlist",conlist);
		mv.addObject("orderlistpage",page);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	@RequestMapping("FAQ")
	public ModelAndView FAQ(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/fnq.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	
	
	
	//매장선택페이지
	
	@RequestMapping("orderBtn")
	public ModelAndView orderBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JmenuSelect.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	
	/*@RequestMapping("checkReviewBtn")
	public ModelAndView checkReviewBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JReview.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}*/
	@RequestMapping("checkReviewBtn")
	public ModelAndView storeSelect2() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JReview");
		
		return mv;
	}
	
	//메뉴선택
	@RequestMapping("bagBtn")
	public ModelAndView bagBtn(com.jpro.jconsumer.Page consumerpage, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/Jbag.jsp";
		String strMenu = req.getParameter("values");
		String strPrice = req.getParameter("prices");
	
		String[] TempMenu = strMenu.split(",");
		String[] TempstrPrice = strPrice.split(",");
		List<String> menus = new ArrayList<String>();
		List<String> prices = new ArrayList<String>();
		for(String i : TempMenu) {
			if(i.equals("")) {
				
			}else {
				menus.add(i);
			}
		}
		for(String i : TempstrPrice) {
			if(i.equals("")) {
				
			}else {
				prices.add(i);
			}
		}

		
		mv.addObject("inc",url);		
		mv.addObject("menus",menus);
		mv.addObject("prices",prices);
		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}

	
	//장바구니 페이지
	@RequestMapping("menuAddBtn")
	public ModelAndView menuAddBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JmenuSelect.jsp";
		String msg = "처음부터 다시 선택해주세요";
		mv.addObject("inc",url);
		mv.addObject("msg",msg);

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}

	
	@RequestMapping("jorderBtn")
	public ModelAndView jorderBtn(com.jpro.jconsumer.Page consumerpage,
			HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/Jpayhistory.jsp";
		//String가져와 '[',']',','요소 제거하기
		String prices = req.getParameter("priceArray");
		prices = prices.replace("[", "");
		prices = prices.replace("]", "");
		prices = prices.replace(" ", "");

		String totalPrice = req.getParameter("totalPrice");
		String menus = req.getParameter("menus");
		menus = menus.replace("[", "");
		menus = menus.replace("]", "");
		menus = menus.replace(" ", "");
		
		//문자열 -> 배열로전환
		String[] menusTepm = menus.split(",");
		String[] priceArrayTepm = prices.split(",");
		
		//list형으로 전환해주기
		List<String> priceArray = new ArrayList<String>();
		List<String> menusArray = new ArrayList<String>();
		for(String i : priceArrayTepm) {	
			priceArray.add(i);
		}
		for(String i : menusTepm) {	
			menusArray.add(i);
		}

		//값 mv에 담아서 리턴
		mv.addObject("menus",menusArray);
		mv.addObject("totalPrice",totalPrice);
		mv.addObject("priceArray",priceArray);
		mv.addObject("inc",url);		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	

	//주문하기페이지

	
	@RequestMapping("payBtn")
	public ModelAndView payBtn(HttpServletRequest req) {
		System.out.println(req);
		JpayHistoryVo vo = new JpayHistoryVo();
		vo.setAddress(req.getParameter("address")+" "+req.getParameter("apiAddressDetail"));
		System.out.println(req.getParameter("address")+" "+req.getParameter("apiAddressDetail"));
		vo.setHowtopay(req.getParameter("radioSelect"));
		System.out.println(req.getParameter("radioSelect"));
		vo.setOrdermenu(req.getParameter("menu"));
		System.out.println(req.getParameter("menu"));
		vo.setTotalprice(req.getParameter("totalPrice"));
		System.out.println(req.getParameter("totalPrice"));
		dao.insertPayHistory(vo);
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JpayAfter.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	@RequestMapping("paycancelBtn")
	public ModelAndView paycancelBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	
	//주문이후 페이지
	
	@RequestMapping("endBtn")
	public ModelAndView endBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}

	
	//마이페이지
	
	@RequestMapping("change_1Btn")
	public ModelAndView change_1Btn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/MyPageChange.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}



	//마이페이지 수정
	
	@RequestMapping("change_2Btn")
	public ModelAndView change_2Btn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/MyPage.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	
	//주문 내역 -> 리뷰작성
	@RequestMapping("reviewBtn")
	public ModelAndView reviewBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/upload.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	
	//리뷰 작성 버튼 -> 리뷰 작성 리스트
	
	@RequestMapping("writeBtn")
	public ModelAndView upload() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JReview");		

		return mv;
	}	
	
	//리뷰작성 -> 돌아가기	
	@RequestMapping("backBtn")
	public ModelAndView backBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JorderList.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}

	
	//내정보 -> 회원탈퇴 버튼 -> 매장페이지 
	@RequestMapping("joinOutBtn")
	public ModelAndView joinOutBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		
		return mv;
	}
	
	//메뉴보기 -> 담기
	@RequestMapping("addBtn")
	public ModelAndView addBtn() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/Jbag");
		
		return mv;
	}
}

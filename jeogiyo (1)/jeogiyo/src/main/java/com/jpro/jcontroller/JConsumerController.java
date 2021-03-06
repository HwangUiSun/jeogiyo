package com.jpro.jcontroller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	// 메인페이지 메인
	@RequestMapping("consumer")
	public ModelAndView order() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("jconsumer/Jlogin");

		return mv;
	}
	// 로그인페이지

	@RequestMapping("loginBtn")
	public ModelAndView loginBtn(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		System.out.println(req.getSession());
		String mid = req.getParameter("mId");
		String pwd = req.getParameter("password");
		System.out.println(mid);
		System.out.println(pwd);
		JConsumerLoginVo rVo = dao.login(mid, pwd);
		mv.addObject("rVo", rVo);
		System.out.println(rVo + "fff");
		HttpSession s = req.getSession();
		if (rVo != null) {
			session.setAttribute("id", rVo.getMid());
			String url = "../jconsumer/Jmain.jsp";

			mv.addObject("inc", url);
			mv.setViewName("jconsumer/Jconsumer_index");
		} else {
			mv.setViewName("jconsumer/Jlogin_result");
		}
		return mv;

	}

	/*
	 * @RequestMapping("loginR") public ModelAndView loginR(JConsumerVo vo ,
	 * HttpServletRequest req) { //service에서 로그인 할때 vo, req를 보내왔기때문에 매개변수로 잡음
	 * ModelAndView mv = new ModelAndView(); JConsumerVo rVo = dao.login(vo,req);
	 * String url = "../jconsumer/JstoreSelect.jsp";
	 * 
	 * mv.addObject("inc",url);
	 * 
	 * @RequestMapping("login_fail") public ModelAndView login_fail() { ModelAndView
	 * mv = new ModelAndView(); mv.setViewName("jconsumer/Jlogin");
	 * 
	 * return mv; }
	 * 
	 * 
	 * mv.setViewName("jconsumer/Jconsumer_index"); return mv; }
	 */

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

	// 아이디찾기
	/*
	 * @RequestMapping("findIdBtn") public ModelAndView findIdBtn(JConsumerVo vo) {
	 * ModelAndView mv = new ModelAndView(); String id = dao.findId(vo);
	 * 
	 * mv.addObject("msg", id);
	 * 
	 * mv.setViewName("jconsumer/find_id_result");
	 * 
	 * return mv; }
	 */
	/*
	 * @RequestMapping("findIdBtn") public ModelAndView findIdBtn() { ModelAndView
	 * mv = new ModelAndView();
	 * 
	 * mv.setViewName("jconsumer/Jlogin");
	 * 
	 * return mv; }
	 */
	@RequestMapping("findIdR")
	public ModelAndView findIdR(JConsumerLoginVo vo) {
		ModelAndView mv = new ModelAndView();
		String mid = dao.findId(vo);

		mv.addObject("msg", mid);
		mv.setViewName("jconsumer/find_id_result");
		return mv;
	}

	// 비밀번호 찾기
	/*
	 * @RequestMapping("findPwdBtn") public ModelAndView findPwdBtn() { ModelAndView
	 * mv = new ModelAndView();
	 * 
	 * mv.setViewName("jconsumer/Jlogin");
	 * 
	 * return mv; }
	 */

	@RequestMapping("findPwdR")
	public ModelAndView findPwdR(JConsumerLoginVo vo) {
		ModelAndView mv = new ModelAndView();
		String pwd = dao.findPwd(vo);

		mv.addObject("msg", pwd);
		mv.setViewName("jconsumer/find_pwd_result");
		return mv;
	}

	// 회원가입페이지

	@RequestMapping("signUpBtn")
	public ModelAndView signUpBtn(JConsumerLoginVo vo, HttpServletRequest req) {
		
		
		
		dao.insertUser(vo);
		ModelAndView mv = new ModelAndView();
		/*
		 * List<JConsumerVo> conlist = dao.storeSelect(consumerpage); consumerpage =
		 * dao.getPage(); mv.addObject("storeSelectlist",conlist);
		 * mv.addObject("storeSelectpage",consumerpage);
		 */

		mv.setViewName("jconsumer/Jlogin");
		return mv;
	}

	// top
	@RequestMapping("homeBtn")
	public ModelAndView top1() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("index");

		return mv;
	}

	@RequestMapping("JstoreSelect")
	public ModelAndView JstoreSelect( Page  page, BindingResult bindingResult) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc", url);
		
		

		System.out.println(page.getStartNo());
		System.out.println(page.getListSize());
		System.out.println(page.getMapFindStr());
		System.out.println(page.getStoreFindStr());
		System.out.println(page.getFindStore());
		List<JconsumerVo2> conlist = dao.storeSelect(page);
		System.out.println(conlist);
		page = dao.getPage();
		mv.addObject("storeSelectlist", conlist);
		mv.addObject("consumerpage", page);
		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	@RequestMapping("MyPage")
	public ModelAndView MyPage(Page page, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		JConsumerLoginVo rVo = dao.selectUserInfo(session.getAttribute("id"));
		page = dao.getPage();
		mv.addObject("mid", rVo.getMid());
		mv.addObject("name", rVo.getName());
		mv.addObject("phone", rVo.getPhone());
		mv.addObject("zipcode", rVo.getZipcode());
		mv.addObject("address", rVo.getAddress());
		mv.addObject("email", rVo.getEmail());

		String url = "../jconsumer/MyPage.jsp";

		mv.addObject("inc", url);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	@RequestMapping("JorderList")
	public ModelAndView MyPJorderListage(Page page, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JorderList.jsp";
		HttpSession session = req.getSession();
		page.setMid((String)session.getAttribute("id"));

		mv.addObject("inc", url);
		List<JConsumerVo3> conlist = dao.Jorderlist(page);
		System.out.println("sd"+conlist);
		page = dao.getPage();
		
		mv.addObject("orderlist", conlist);
		mv.addObject("orderlistpage", page);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	@RequestMapping("FAQ")
	public ModelAndView FAQ(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/fnq.jsp";

		mv.addObject("inc", url);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	// 매장선택페이지

	@RequestMapping("orderBtn")
	public ModelAndView orderBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JmenuSelect.jsp";

		mv.addObject("inc", url);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	/*
	 * @RequestMapping("checkReviewBtn") public ModelAndView
	 * checkReviewBtn(com.jpro.jconsumer.Page consumerpage) { ModelAndView mv = new
	 * ModelAndView(); String url = "../jconsumer/JReview.jsp";
	 * 
	 * mv.addObject("inc",url);
	 * 
	 * 
	 * mv.setViewName("jconsumer/Jconsumer_index"); return mv; }
	 */
	@RequestMapping("checkReviewBtn")
	public ModelAndView storeSelect2() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("jconsumer/JReview");

		return mv;
	}

	// 메뉴선택
	@RequestMapping("bagBtn")
	public ModelAndView bagBtn(com.jpro.jconsumer.Page consumerpage, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/Jbag.jsp";
		String strMenu = req.getParameter("values");
		String strPrice = req.getParameter("prices");
		String strEa = req.getParameter("eaArray");
		String strimg = req.getParameter("imgs");		
		System.out.println(strimg);
		String[] TempEa = strEa.split(",");
		String[] TempMenu = strMenu.split(",");
		
		String[] TempstrPrice = strPrice.split(",");
		String[] Tempstrimg = strimg.split(",");
		List<String> menus = new ArrayList<String>();
		List<String> prices = new ArrayList<String>();
		List<String> imgs = new ArrayList<String>();
		List<String> eas = new ArrayList<String>();
		for (String i : TempMenu) {
			if (i.equals("")) {

			} else {
				menus.add(i);
			}
		}
		for (String i : TempstrPrice) {
			if (i.equals("")) {

			} else {
				prices.add(i);
			}
		}
		for (String i : Tempstrimg) {
			if (i.equals("")) {

			} else {
				imgs.add(i);
			}
		}
		for (String i : TempEa) {
			if (i.equals("")) {

			} else {
				eas.add(i);
			}
		}

		mv.addObject("inc", url);
		mv.addObject("menus", menus);
		mv.addObject("prices", prices);
		mv.addObject("imgs" , imgs);
		mv.addObject("eas" , eas);
		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	// 장바구니 페이지
	@RequestMapping("menuAddBtn")
	public ModelAndView menuAddBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JmenuSelect.jsp";
		String msg = "처음부터 다시 선택해주세요";
		mv.addObject("inc", url);
		mv.addObject("msg", msg);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	@RequestMapping("jorderBtn")
	public ModelAndView jorderBtn(com.jpro.jconsumer.Page consumerpage, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/Jpayhistory.jsp";
		// String가져와 '[',']',','요소 제거하기
		String prices = req.getParameter("priceArray");
		prices = prices.replace("[", "");
		prices = prices.replace("]", "");
		prices = prices.replace(" ", "");

		String totalPrice = req.getParameter("totalPrice");
		String menus = req.getParameter("menus");
		menus = menus.replace("[", "");
		menus = menus.replace("]", "");
		menus = menus.replace(" ", "");

		String imgs = req.getParameter("imgArray");
		imgs = imgs.replace("[", "");
		imgs = imgs.replace("]", "");
		imgs = imgs.replace(" ", "");
		
		String eas = req.getParameter("eaArray");
		eas = eas.replace("[", "");
		eas = eas.replace("]", "");
		eas = eas.replace(" ", "");
		
		// 문자열 -> 배열로전환
		String[] menusTepm = menus.split(",");
		String[] priceArrayTepm = prices.split(",");
		String[] imgArrayTepm = imgs.split(",");
		String[] eaTepm = eas.split(",");

		// list형으로 전환해주기
		List<String> priceArray = new ArrayList<String>();
		List<String> menusArray = new ArrayList<String>();
		List<String> imgArray = new ArrayList<String>();
		List<String> eaArray = new ArrayList<String>();
		for (String i : priceArrayTepm) {
			priceArray.add(i);
		}
		for (String i : menusTepm) {
			menusArray.add(i);
		}
		for (String i : imgArrayTepm) {
			imgArray.add(i);
		}
		for (String i : eaTepm) {
			eaArray.add(i);
		}

		// 값 mv에 담아서 리턴
		mv.addObject("menus", menusArray);
		mv.addObject("totalPrice", totalPrice);
		mv.addObject("priceArray", priceArray);
		mv.addObject("imgArray", imgArray);
		mv.addObject("eaArray", eaArray);
		mv.addObject("inc", url);
		
		//개인정보 보내기
		HttpSession s = req.getSession();
		JConsumerLoginVo rVo = dao.selectUserInfo(s.getAttribute("id"));
	
		mv.addObject("mid", rVo.getMid());
		mv.addObject("name", rVo.getName());
		mv.addObject("phone", rVo.getPhone());
		mv.addObject("zipcode", rVo.getZipcode());
		mv.addObject("address", rVo.getAddress());
		mv.addObject("email", rVo.getEmail());

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	// 주문하기페이지

	@RequestMapping("payBtn")
	public ModelAndView payBtn(HttpServletRequest req) {
		//System.out.println(req);
		JConsumerVo3 vo = new JConsumerVo3();
		HttpSession session = req.getSession();
		vo.setMid((String) session.getAttribute("id"));
		System.out.println(vo.getMid());
		vo.setPhone(req.getParameter("phone"));
		vo.setAddress(req.getParameter("address") );
		//System.out.println(req.getParameter("address") + " " + req.getParameter("apiAddressDetail"));
		vo.setHowtopay(req.getParameter("radioSelect"));
		//System.out.println(req.getParameter("radioSelect"));
		vo.setOrdermenu(req.getParameter("menu"));
		//System.out.println(req.getParameter("menu"));
		vo.setTotalprice(Integer.parseInt(req.getParameter("totalPrice")));
		//System.out.println(req.getParameter("totalPrice"));
		dao.insertOrder(vo);
			
		//결제방법
		String howToPay = "";		
		if(req.getParameter("radioSelect")!=null) {
			howToPay= req.getParameter("radioSelect");
		}else {
			howToPay="만나서 결제";
		}
		//고개요청사항
		String consumerRequest ="";
		if(req.getParameter("request")!=null) {
			consumerRequest= req.getParameter("request");
		}else {
			consumerRequest="요청사항 없음";
		}
		
		
	
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JpayAfter.jsp";

		
		// String가져와 '[',']',','요소 제거하기
		String prices = req.getParameter("priceArray");
		prices = prices.replace("[", "");
		prices = prices.replace("]", "");
		prices = prices.replace(" ", "");

		String totalPrice = req.getParameter("totalPrice");
		String menus = req.getParameter("menus");
		menus = menus.replace("[", "");
		menus = menus.replace("]", "");
		menus = menus.replace(" ", "");

		String imgs = req.getParameter("imgArray");
		imgs = imgs.replace("[", "");
		imgs = imgs.replace("]", "");
		imgs = imgs.replace(" ", "");
				
		String eas = req.getParameter("eaArray");
		eas = eas.replace("[", "");
		eas = eas.replace("]", "");
		eas = eas.replace(" ", "");
				
		// 문자열 -> 배열로전환
		String[] menusTepm = menus.split(",");
		String[] priceArrayTepm = prices.split(",");
		String[] imgArrayTepm = imgs.split(",");
		String[] eaTepm = eas.split(",");

		// list형으로 전환해주기
		List<String> priceArray = new ArrayList<String>();
		List<String> menusArray = new ArrayList<String>();
		List<String> imgArray = new ArrayList<String>();
		List<String> eaArray = new ArrayList<String>();
		for (String i : priceArrayTepm) {
			priceArray.add(i);
		}
		for (String i : menusTepm) {
			menusArray.add(i);
		}
		for (String i : imgArrayTepm) {
			imgArray.add(i);
		}
		for (String i : eaTepm) {
			eaArray.add(i);
		}

		// 값 mv에 담아서 리턴
		mv.addObject("menus", menusArray);
		mv.addObject("totalPrice", totalPrice);
		mv.addObject("priceArray", priceArray);
		mv.addObject("imgArray", imgArray);
		mv.addObject("eaArray", eaArray);
		mv.addObject("inc", url);
		mv.addObject("howToPay", howToPay);
		mv.addObject("consumerRequest", consumerRequest);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	@RequestMapping("paycancelBtn")
	public ModelAndView paycancelBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc", url);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	// 주문이후 페이지

	@RequestMapping("endBtn")
	public ModelAndView endBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc", url);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	// 마이페이지

	
	  @RequestMapping("change_1Btn") 
	  public ModelAndView change_1Btn(HttpServletRequest req) 
	  { 
		  JConsumerLoginVo vo = new JConsumerLoginVo(); 
		  vo.setMid(req.getParameter("mid"));
		  System.out.println(req.getParameter("mid"));
		  vo.setName(req.getParameter("name"));
		  System.out.println(req.getParameter("name"));
		  vo.setPhone(req.getParameter("phone"));
		  System.out.println(req.getParameter("phone"));
		  vo.setZipcode(req.getParameter("zipcode"));
		  System.out.println(req.getParameter("zipcode"));
		  vo.setAddress(req.getParameter("address"));
		  System.out.println(req.getParameter("address"));
		  vo.setEmail(req.getParameter("email"));
		  System.out.println(req.getParameter("email")); 
		  dao.updateUserInfo(vo);
		  JConsumerLoginVo rVo = dao.selectUserInfo(vo.getMid());
		  ModelAndView mv = new ModelAndView(); 
		  mv.addObject("mid", rVo.getMid());
			mv.addObject("name", rVo.getName());
			mv.addObject("phone", rVo.getPhone());
			mv.addObject("zipcode", rVo.getZipcode());
			mv.addObject("address", rVo.getAddress());
			mv.addObject("email", rVo.getEmail());
		  String url = "../jconsumer/MyPage.jsp";
	  
		  mv.addObject("inc",url);
		  mv.setViewName("jconsumer/Jconsumer_index"); 
		  return mv; }
	 

	/*
	 * @RequestMapping("change_1Btn") public ModelAndView change_1Btn(Page page,
	 * HttpServletRequest req) { ModelAndView mv = new ModelAndView(); HttpSession
	 * session = req.getSession(); JConsumerLoginVo rVo =
	 * dao.updateUserInfo(session.getAttribute("id")); page = dao.getPage();
	 * mv.addObject("mid", rVo.getMid()); mv.addObject("name", rVo.getName());
	 * mv.addObject("phone", rVo.getPhone()); mv.addObject("zipcode",
	 * rVo.getZipcode()); mv.addObject("address", rVo.getAddress());
	 * mv.addObject("email", rVo.getEmail()); String url =
	 * "../jconsumer/MyPageChange.jsp";
	 * 
	 * mv.addObject("inc", url);
	 * 
	 * mv.setViewName("jconsumer/Jconsumer_index"); return mv; }
	 */

	// 마이페이지 수정

	@RequestMapping("change_2Btn")
	public ModelAndView change_2Btn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/MyPage.jsp";

		mv.addObject("inc", url);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	// 주문 내역 -> 리뷰작성
	@RequestMapping("reviewBtn")
	public ModelAndView reviewBtn(HttpServletRequest req) {
		HttpSession session = req.getSession();
		ModelAndView mv = new ModelAndView();
		mv.addObject("mid", session.getAttribute("id"));
		String url = "../jconsumer/upload.jsp";
		System.out.println(req.getParameter("sno"));
		String sno = req.getParameter("sno");
		mv.addObject("inc", url);
		mv.addObject("sno",sno);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}
	
	@RequestMapping("reviewRead")
	public ModelAndView reviewRead(HttpServletRequest req) {
		HttpSession session = req.getSession();
		ModelAndView mv = new ModelAndView();
		mv.addObject("mid", session.getAttribute("id"));
		String url = "../jconsumer/read.jsp";
		
		String sno = req.getParameter("sno");
		JConsumerVo3 vo = dao.selectOneVo(sno);
		System.out.println(vo.getMid());
		mv.addObject("inc", url);
		mv.addObject("sno",sno);
		mv.addObject("vo",vo);
		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	// 리뷰 작성 버튼 -> 리뷰 작성 리스트 수정

	@RequestMapping("writeBtn")
	public ModelAndView upload( HttpServletRequest req, Page page) {
		JConsumerVo3 vo = new JConsumerVo3(); 		
		
		if(req.getParameter("subjectinput") !=null) {
			vo.setDoc(req.getParameter("docinput"));
			vo.setSubject(req.getParameter("subjectinput"));
			vo.setMid(req.getParameter("mid"));
			vo.setOrdertime(req.getParameter("nal"));	
			vo.setSno(Integer.parseInt(req.getParameter("sno")));
			dao.insertReview(vo);
		}
				  
		
		
		ModelAndView mv = new ModelAndView(); 

	
		List<JConsumerVo3> conlist = dao.review(page);
		page = dao.getPage();
		mv.addObject("reviewlist", conlist);
		mv.addObject("reviewpage", page);
		String url = "../jconsumer/JReview.jsp";
		
		mv.addObject("inc", url);

		mv.setViewName("jconsumer/Jconsumer_index");

		return mv;
	}

	// 리뷰작성 -> 돌아가기
	@RequestMapping("backBtn")
	public ModelAndView backBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JorderList.jsp";

		mv.addObject("inc", url);

		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}

	// 내정보 -> 회원탈퇴 버튼 -> 로그인페이지
	@RequestMapping("joinOutBtn")
	public ModelAndView joinOutBtn() {
		ModelAndView mv = new ModelAndView();
		

		mv.setViewName("jconsumer/Jlogin");

		return mv;
	}

	// 메뉴보기 -> 담기
	@RequestMapping("addBtn")
	public ModelAndView addBtn() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("jconsumer/Jbag");

		return mv;
	}
}

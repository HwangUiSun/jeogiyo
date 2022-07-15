 package com.jpro.jcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpro.common.J_notiVo;
import com.jpro.common.Page;
import com.jpro.jconsumer.JConsumerService;
import com.jpro.jconsumer.JConsumerVo;


@RestController
public class JConsumerController {
	@Autowired
	JConsumerService dao;

	

	//메인페이지 메인
	@RequestMapping("consumer")
	public ModelAndView order() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/form_login");
		
		return mv;
	}
	//로그인페이지
	
	@RequestMapping("loginBtn")
	public ModelAndView loginBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	
	@RequestMapping("JsignUp")
	public ModelAndView Jlogin() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JsignUp");
		
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
	public ModelAndView JstoreSelect(com.jpro.jconsumer.Page consumerpage) {
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
	
	@RequestMapping("MyPage")
	public ModelAndView MyPage(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/MyPage.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
	@RequestMapping("JorderList")
	public ModelAndView MyPJorderListage(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JorderList.jsp";

		mv.addObject("inc",url);
		

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
	public ModelAndView bagBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/Jbag.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}

	
	//장바구니 페이지
	@RequestMapping("menuAddBtn")
	public ModelAndView menuAddBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JmenuSelect.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}

	
	@RequestMapping("jorderBtn")
	public ModelAndView jorderBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/Jpayhistory.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	

	//주문하기페이지
	
	@RequestMapping("payBtn")
	public ModelAndView payBtn(com.jpro.jconsumer.Page consumerpage) {
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

	
	@RequestMapping("apiBtn")
	public ModelAndView Jpayhistory3() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JchangeAddress");
		
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

	
	/*//장바구니 -> FNQ 링크
	
	@RequestMapping("FAQ")
	public ModelAndView FAQ() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/fnq");
		
		return mv;
	}*/
	//리뷰 작성 버튼
	/*@RequestMapping("writeBtn")
	public ModelAndView writeBtn() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JReview");
		
		return mv;
	}
	*/
}

 package com.jpro.jcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class JConsumerController {

	//메인페이지
	@RequestMapping("consumer")
	public ModelAndView order() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/form_login");
		
		return mv;
	}
	//로그인페이지
	
	@RequestMapping("loginBtn")
	public ModelAndView Jlogin2() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JstoreSelect");
		
		return mv;
	}
	
	@RequestMapping("JsignUp")
	public ModelAndView Jlogin() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/consumer_input_form");
		
		return mv;
	}
	//회원가입페이지
	@RequestMapping("signUpBtn")
	public ModelAndView JsignUp() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JstoreSelect");
		
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
	public ModelAndView top2() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JstoreSelect");
		
		return mv;
	}
	
	@RequestMapping("MyPage")
	public ModelAndView top3() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/MyPage");
		
		return mv;
	}
	
	@RequestMapping("JorderList")
	public ModelAndView top4() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JorderList");
		
		return mv;
	}
	
	@RequestMapping("FAQ")
	public ModelAndView top5() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/FAQ");
		
		return mv;
	}
	
	//매장선택페이지
	
	@RequestMapping("orderBtn")
	public ModelAndView storeSelect1() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JmenuSelect");
		
		return mv;
	}
	
	@RequestMapping("checkReviewBtn")
	public ModelAndView storeSelect2() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JReview");
		
		return mv;
	}
	
	//메뉴선택
	@RequestMapping("bagBtn")
	public ModelAndView JmenuSelect() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/Jbag");
		
		return mv;
	}
	
	//장바구니 페이지
	@RequestMapping("menuAddBtn")
	public ModelAndView Jbag1() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JmenuSelect");
		
		return mv;
	}
	
	@RequestMapping("jorderBtn")
	public ModelAndView Jbag2() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/Jpayhistory");
		
		return mv;
	}
	//주문하기페이지
	@RequestMapping("payBtn")
	public ModelAndView Jpayhistory1() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JpayAfter");
		
		return mv;
	}
	
	@RequestMapping("paycancelBtn")
	public ModelAndView Jpayhistory2() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JstoreSelect");
		
		return mv;
	}
	
	//주문이후 페이지
	@RequestMapping("endBtn")
	public ModelAndView JpayAfter() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JstoreSelect");
		
		return mv;
	}
	
	//마이페이지
	@RequestMapping("change_1Btn")
	public ModelAndView MyPage() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/MyPageChange");
		
		return mv;
	}

	//마이페이지 수정
	@RequestMapping("change_2Btn")
	public ModelAndView MyPageChange() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/JorderList");
		
		return mv;
	}
	
	//업로드 -> 리뷰 작성 리스트
	@RequestMapping("writeBtn")
	public ModelAndView upload() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("upload/JReview");		

		return mv;
	}	
	
	//업로드 -> 돌아가기
	@RequestMapping("backBtn")
	public ModelAndView upload_1() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("upload/JorderList");
		
		return mv;
	}
	
	//주문 내역
	@RequestMapping("reviewBtn")
	public ModelAndView JorderList() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/upload");
		
		return mv;
	}

	
}

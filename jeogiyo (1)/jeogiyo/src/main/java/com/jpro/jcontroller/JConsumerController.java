 package com.jpro.jcontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpro.jconsumer.JConsumerService;
import com.jpro.jconsumer.JConsumerVo;
import com.jpro.jconsumer.JConsumerVo3;
import com.jpro.jconsumer.JconsumerVo2;
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
	
	public ModelAndView loginBtn(com.jpro.jconsumer.Page consumerpage) {
		ModelAndView mv = new ModelAndView();
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc",url);
		

		mv.setViewName("jconsumer/Jconsumer_index");		
		return mv;
	}
	
/*	@RequestMapping("loginR")
	public ModelAndView loginR(JConsumerVo vo , HttpServletRequest req) {
				//service에서 로그인 할때 vo, req를 보내왔기때문에 매개변수로 잡음
		ModelAndView mv = new ModelAndView();
		JConsumerVo rVo = dao.login(vo,req);
		String url = "../jconsumer/JstoreSelect.jsp";

		mv.addObject("inc",url);
		
				
		mv.setViewName("jconsumer/Jconsumer_index");
		return mv;
	}*/
	
	
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
	public ModelAndView findIdR(JConsumerVo vo) {
		ModelAndView mv = new ModelAndView();
		String mId = dao.findId(vo);
		
		mv.addObject("msg", mId);
		mv.setViewName("jconsumer/find_id_result");
		return mv;
	}
	
	//비밀번호 찾기
	@RequestMapping("findPwdBtn")
	public ModelAndView findPwdBtn() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("jconsumer/Jlogin");
		
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
		mv.addObject("storeSelectpage",page);
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

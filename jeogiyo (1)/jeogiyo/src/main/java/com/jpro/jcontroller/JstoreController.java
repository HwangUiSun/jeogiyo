package com.jpro.jcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class JstoreController {
	
	@RequestMapping("storeCenter")
	public ModelAndView storeCenter() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("common/SC_login");
		
		return mv;
	}
	
	@RequestMapping("store_login")
	public ModelAndView store_login() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("store_findId")
	public ModelAndView store_findId() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("store/store_findId");
		
		return mv;
	}
	
	@RequestMapping("store_findPwd")
	public ModelAndView store_findPwd() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("store/store_findPwd");
		
		return mv;
	}
	
	@RequestMapping("store_join")
	public ModelAndView store_join() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("store/store_join");
		
		return mv;
	}
	
	@RequestMapping("noti")
	public ModelAndView noti() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/noti_main.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		
		return mv;
	}
	
	@RequestMapping("noti_view")
	public ModelAndView noti_view() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/noti_view.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("order")
	public ModelAndView order() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main.jsp";
		mv.addObject("inc",url);
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("order_view")
	public ModelAndView order_view() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_view.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("store_orderInput")
	public ModelAndView store_orderInput() {
		ModelAndView mv = new ModelAndView();
		String url = "../store/store_orderInput.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("store_orderUpdate")
	public ModelAndView store_orderUpdate() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("store_orderDelete")
	public ModelAndView store_orderDelete() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("store_orderCancel")
	public ModelAndView store_orderCancel() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("store_sale")
	public ModelAndView store_sale() {
		ModelAndView mv = new ModelAndView();
		String url = "../store/store_sale.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("store_orderStatus")
	public ModelAndView store_orderStatus() {
		ModelAndView mv = new ModelAndView();
		String url = "../store/store_orderStatus.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	
}

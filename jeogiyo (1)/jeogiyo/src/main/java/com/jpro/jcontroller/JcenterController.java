package com.jpro.jcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class JcenterController {
	
	@RequestMapping("center_login")
	public ModelAndView center_login() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_noti")
	public ModelAndView centerNoti() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/noti_main.jsp";
		mv.addObject("inc",url);
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_notiView")
	public ModelAndView center_notiView() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/noti_view.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_notiInput")
	public ModelAndView center_notiInput() {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_notiInput.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_order")
	public ModelAndView centerOrder() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main.jsp";
		mv.addObject("inc",url);
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_orderView")
	public ModelAndView centerOrder_view() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_view.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_orderAccept")
	public ModelAndView center_orderAccept() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_orderWait")
	public ModelAndView center_orderWait() {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	
	@RequestMapping("center_storeM")
	public ModelAndView storeM() {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_storeM.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_storeSale")
	public ModelAndView storeSale() {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_storeSale.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_consumerList")
	public ModelAndView consumerList() {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_consumerList.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_storeDrop")
	public ModelAndView center_storeDrop() {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_storeDrop.jsp";
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
}

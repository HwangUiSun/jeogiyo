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
	
	@RequestMapping("center_storeM")
	public ModelAndView storeM() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("center/center_storeM");
		
		return mv;
	}
	
	@RequestMapping("center_storeSale")
	public ModelAndView storeSale() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("center/center_storeSale");
		
		return mv;
	}
	
	@RequestMapping("center_consumerList")
	public ModelAndView consumerList() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("center/center_consumerList");
		
		return mv;
	}
	
	@RequestMapping("center_storeDrop")
	public ModelAndView center_storeDrop() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("center/center_storeDrop");
		
		return mv;
	}
	
}

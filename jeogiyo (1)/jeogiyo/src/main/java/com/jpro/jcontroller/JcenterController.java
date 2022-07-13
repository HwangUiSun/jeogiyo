package com.jpro.jcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpro.common.J_notiService;
import com.jpro.common.J_notiVo;
import com.jpro.jcenter.JcenterMemberVo;
import com.jpro.jcenter.JcenterStoreVo;
import com.jpro.jcenter.JcenterMemberService;
import com.jpro.jcenter.Page;

@RestController
public class JcenterController {
	@Autowired
	JcenterMemberService dao;
	@Autowired
	J_notiService notiDao;
	
	
	@RequestMapping("center_login")
	public ModelAndView center_login() {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("center/center_index");		
		return mv;
	}
	
	@RequestMapping("center_noti")
	public ModelAndView centerNoti(com.jpro.common.Page notipage) {
		ModelAndView mv = new ModelAndView();
		String url = "../common/noti_main.jsp";

		mv.addObject("inc",url);
		List<J_notiVo> notilist = notiDao.select(notipage); 
		notipage = notiDao.getPage();
		mv.addObject("notilist",notilist);
		mv.addObject("notipage",notipage);

		mv.setViewName("center/center_index");		
		return mv;
	}
	
	@RequestMapping("center_notiView")
	public ModelAndView center_notiView(com.jpro.common.Page notipage) {
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
	public ModelAndView centerOrder(com.jpro.common.Page notipage) {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main.jsp";
		mv.addObject("inc",url);
		
		List<J_notiVo> notilist = notiDao.select(notipage); 
		notipage = notiDao.getPage();
		mv.addObject("orderlist",notilist);
		mv.addObject("orderpage",notipage);
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
	public ModelAndView consumerList(Page page) {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_consumerList.jsp";
		mv.addObject("inc",url);
		String url2 = "../center/center_consumerList.jsp";
		List<JcenterMemberVo> list = dao.memberSelect(page); 
		page = dao.getPage();
		mv.addObject("list",list);
		mv.addObject("page",page);
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_storeDrop")
	public ModelAndView center_storeDrop(com.jpro.common.Page notipage) {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_storeDrop.jsp";
		mv.addObject("inc",url);
		
		List<J_notiVo> notilist = notiDao.select(notipage);
		
		notipage = notiDao.getPage();
		mv.addObject("notilist",notilist);
		mv.addObject("notipage",notipage);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_storeDropView")
	public ModelAndView center_storeDropView() {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_storeDrop_view.jsp";
		
		mv.addObject("inc", url);
		
		mv.setViewName("center/center_index");
		return mv;
	}
}

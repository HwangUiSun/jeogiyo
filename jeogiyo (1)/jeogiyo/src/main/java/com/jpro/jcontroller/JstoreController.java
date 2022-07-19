package com.jpro.jcontroller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpro.common.J_loginService;
import com.jpro.common.J_notiService;
import com.jpro.common.J_notiVo;
import com.jpro.common.Page;
import com.jpro.common.TableVo;
import com.jpro.jcenter.JcenterStoreSaleService;
import com.jpro.jstore.JbaljuListVo;
import com.jpro.jstore.JbaljuService;
import com.jpro.jstore.JbaljudetailsVo;

import com.jpro.jstore.JstoreOrderStatusService;
import com.jpro.jstore.JstoreOrderStatusVo;

import com.jpro.jstore.JpayAfterVo;

import com.jpro.jstore.JstoreVo;
import com.jpro.jstore.statusPage;

@RestController
public class JstoreController {
	int b=0;
	
	@Autowired
	J_notiService notiDao;
	
	@Autowired
	JbaljuService baljuDao;
	
	@Autowired
	J_loginService loginDao;
	
	@Autowired
	JstoreOrderStatusService orderStatusDao;
	
	@Autowired
	JcenterStoreSaleService saleDao;

	
	@RequestMapping("storeCenter")
	public ModelAndView storeCenter() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("common/SC_login");
		
		return mv;
	}
	
	@RequestMapping("store_login")
	public ModelAndView store_login(JstoreVo vo, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		HttpSession session =req.getSession();
		vo.setMid(req.getParameter("mId"));
		vo.setPwd(req.getParameter("password"));
		JstoreVo rVo = loginDao.login(vo, req);
		String tableName ="";
		HttpSession s = req.getSession();
		if(rVo != null) {
			if(rVo.getMid().equals("root")) {
				session.setAttribute("id", rVo.getMid());
				mv.setViewName("center/center_index");
			}else{
				session.setAttribute("id", rVo.getMid());
				mv.setViewName("store/store_index");
				tableName = baljuDao.createTable((String)s.getAttribute("mid"));
				s.setAttribute("tableName", tableName);
			}
		}
		else {
			mv.setViewName("common/SC_loginResult");
		}
		return mv;
	}
	
	@RequestMapping("login_fail")
	public ModelAndView login_fail() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("common/SC_login");
		
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
	public ModelAndView noti(Page notipage) {
		ModelAndView mv = new ModelAndView();
		String url = "../common/noti_main.jsp";
		mv.addObject("inc",url);
		List<J_notiVo> notilist = notiDao.select(notipage); 
		notipage = notiDao.getPage();
		mv.addObject("notilist",notilist);
		mv.addObject("notipage",notipage);
		
		
		mv.setViewName("store/store_index");
		
		
		return mv;
	}
	
	@RequestMapping("noti_view")
	public ModelAndView noti_view(Page notipage, int sno) {
		ModelAndView mv = new ModelAndView();
		String url = "../common/noti_view.jsp";
		J_notiVo vo = new J_notiVo();
		vo = notiDao.selectOne(sno);
		mv.addObject("vo", vo);
		mv.addObject("notipage",notipage);
		mv.addObject("inc",url);
		
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	@RequestMapping("order")
	public ModelAndView order(com.jpro.jstore.Page page,HttpServletRequest req) {
//		ModelAndView mv = new ModelAndView();
//		String url = "../common/order_main.jsp";
//		mv.addObject("inc",url);
//		mv.setViewName("store/store_index");
//		
//		List<J_notiVo> notilist = notiDao.select(notipage); 
//		notipage = notiDao.getPage();
//		mv.addObject("orderlist",notilist);
//		mv.addObject("orderpage",notipage);
//		mv.setViewName("store/store_index");
		
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main2.jsp";
		mv.addObject("inc",url);
		mv.setViewName("store/store_index");
		List<JbaljudetailsVo> baljulist = baljuDao.select(page);//발주리스트 가져오는함수
		page = baljuDao.getPage();
		mv.addObject("baljupage",page);
		mv.addObject("baljulist",baljulist);
		mv.setViewName("store/store_index");
		return mv;
	}
	
	@RequestMapping("order_view")
	public ModelAndView order_view(com.jpro.jstore.Page page,HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_view.jsp";
		mv.addObject("inc",url);
		mv.setViewName("store/store_index");
		//select(title)
		HttpSession s = req.getSession();
		String tableName =req.getParameter("title");
		List<JbaljuListVo> selectSubOne = null;	
		selectSubOne =baljuDao.selecSubtList(page,tableName);	
		mv.addObject("selectSubOne",selectSubOne);
		return mv;
	}
	
	@RequestMapping("store_orderInput")
	public ModelAndView store_orderInput(com.jpro.jstore.Page page,HttpServletRequest req,
			HttpServletResponse resp) {
//		ModelAndView mv = new ModelAndView();
//		String url = "../store/store_orderInput.jsp";
//		mv.addObject("inc",url);
//		
//		List<J_notiVo> notilist = notiDao.select(notipage); 
//		notipage = notiDao.getPage();
//		mv.addObject("orderlist",notilist);
//		mv.addObject("orderpage",notipage);
//		mv.setViewName("store/store_index");
		ModelAndView mv = new ModelAndView();	
		HttpSession s = req.getSession();
		String tableName="";
		if((String)s.getAttribute("tableName")!=null) {
			tableName = (String)s.getAttribute("tableName");
		}else {
			tableName = "jbaljulist";
		}
		
		String url = "../store/store_orderInput2.jsp";		
		List<JbaljuListVo> baljulist = baljuDao.selectList(page,tableName);
		List<JbaljuListVo> baljulist2 = baljuDao.selecSubtList(page,tableName);		
		page = baljuDao.getPage();
		
		mv.addObject("inc",url);
		mv.addObject("baljupage2",page);
		mv.addObject("baljulist2",baljulist);
		mv.addObject("baljulist3",baljulist2);		
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
	// ---------------------------------------------------------------------------
	@RequestMapping("store_sale")
	public ModelAndView store_sale(HttpServletRequest req, Page page) {
		ModelAndView mv = new ModelAndView();
		String url = "../store/store_sale.jsp";
		HttpSession session = req.getSession();
		String mid = (String)session.getAttribute("mid");
		List<JpayAfterVo> list =  null;
		
		String stn = saleDao.StoreName(mid);
		list=saleDao.selectOne(mid,page);
		
		
		mv.addObject("inc",url);
		mv.addObject("stn",stn);
		mv.addObject("list",list);
		mv.setViewName("store/store_index");
		
		return mv;
	}
	@RequestMapping("store_sale_find")
	public ModelAndView store_sale_find(HttpServletRequest req, Page page, JpayAfterVo vo) {
		ModelAndView mv = new ModelAndView();
		String url = "../store/store_sale.jsp";
		List<JpayAfterVo> list =  null;
		HttpSession session = req.getSession();
		int a = 0;
		
		
		String mid = (String)session.getAttribute("mid");
		String stn = saleDao.StoreName(mid);
		vo.setStoreName(stn);
		vo.setDate1(req.getParameter("date1"));
		vo.setDate2(req.getParameter("date2"));
		
		
		
		
		list=saleDao.selectSaleday(mid,vo,page);
		a=saleDao.selectSaledayAll(vo);
		b=saleDao.selectSaledayAllHit(vo);
		mv.addObject("date1", vo.getDate1());
		mv.addObject("date2", vo.getDate2());
		mv.addObject("inc",url);
		mv.addObject("stn",stn);
		mv.addObject("hit",b);
		mv.addObject("tot",a);
		mv.addObject("list",list);
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("store_orderStatus")
	public ModelAndView store_orderStatus(com.jpro.jstore.statusPage statusPage) {
		ModelAndView mv = new ModelAndView();
		String url = "../store/store_orderStatus.jsp";
		statusPage = new com.jpro.jstore.statusPage();
		statusPage.setNowPage(1);
		
		List<JstoreOrderStatusVo> statuslist = orderStatusDao.select(statusPage);
		statusPage = orderStatusDao.getStatusPage();
		
		mv.addObject("inc",url);
		mv.addObject("statuslist", statuslist);
		mv.addObject("statusPage", statusPage);
		mv.setViewName("store/store_index");
		
		return mv;
	}
	
	//update 발주리스트
	@RequestMapping("adds")
	public ModelAndView updateEa(com.jpro.jstore.Page page,HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		int ea = Integer.parseInt(req.getParameter("ea"));
		int sno = Integer.parseInt(req.getParameter("sno"));
		
		String url = "../store/store_orderInput2.jsp";
		mv.addObject("inc",url);
		mv.setViewName("store/store_index");
		HttpSession s = req.getSession();
		String tableName = req.getParameter("title");

		page.setTableName(tableName);	
		baljuDao.updateEa(ea, sno, tableName);
		List<JbaljuListVo> baljulist = baljuDao.selectList(page,tableName);
		List<JbaljuListVo> baljulist2 = baljuDao.selecSubtList(page,tableName);
		page = baljuDao.getPage();
		mv.addObject("baljupage2",page);
		mv.addObject("baljulist2",baljulist);//addList
		mv.addObject("baljulist3",baljulist2);//sublist		
		mv.setViewName("store/store_index");		
		return mv;
	}
	@RequestMapping("sub")
	public ModelAndView updateToZoro(com.jpro.jstore.Page page,HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();

		int sno = Integer.parseInt(req.getParameter("sno"));		
		String url = "../store/store_orderInput2.jsp";
		mv.addObject("inc",url);
		mv.setViewName("store/store_index");
		HttpSession s = req.getSession();
		String tableName = (String)s.getAttribute("tableName");
		
		page.setTableName(tableName);	
		baljuDao.updateToZoro(sno, tableName);
		List<JbaljuListVo> baljulist = baljuDao.selectList(page,tableName);
		List<JbaljuListVo> baljulist2 = baljuDao.selecSubtList(page,tableName);
		page = baljuDao.getPage();
		mv.addObject("baljupage2",page);
		mv.addObject("baljulist2",baljulist);//addList
		mv.addObject("baljulist3",baljulist2);//sublist		
		mv.setViewName("store/store_index");		
		return mv;
	}
	@RequestMapping("dropT")
	public ModelAndView droptable(com.jpro.jstore.Page page,HttpServletRequest req,
			HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();		
		String url = "../common/order_main2.jsp";
		mv.addObject("inc",url);	
		HttpSession s = req.getSession();		
		baljuDao.selectOneDetail(0);
		List<JbaljudetailsVo> baljulist = baljuDao.select(page);
		page = baljuDao.getPage();	
		mv.addObject("page",page);
		mv.addObject("baljulist",baljulist);//baljudetaillist
		mv.addObject("baljulist2","");//addList
		mv.addObject("baljulist3","");//sublist	
		s.setAttribute("tableName", "");
		mv.setViewName("store/store_index");		
		return mv;
	}
	
	
	@RequestMapping("insertba")
	public ModelAndView insertba(com.jpro.jstore.Page page,HttpServletRequest req,
			HttpServletResponse resp) {
			
		
			ModelAndView mv = new ModelAndView();
			String url = "../common/order_main2.jsp";
			mv.addObject("inc",url);	
			HttpSession s = req.getSession();
			JbaljudetailsVo vo=null;
			String msg="";
			String title = req.getParameter("title");
			mv.setViewName("store/store_index");
			vo = new JbaljudetailsVo();
			vo.setTitle(title);
			List<JbaljudetailsVo> baljulist = baljuDao.select(page);//발주리스트 가져오는함수
			page = baljuDao.getPage();
			mv.addObject("baljupage",page);
			mv.addObject("baljulist",baljulist);
			s.setAttribute("msg", msg);
			mv.addObject("msg",msg);					
			mv.setViewName("store/store_index");
			System.out.println("있다");
			List<JbaljudetailsVo> list=baljuDao.selectTitle();
			for(JbaljudetailsVo v : list) {
				if(v.getTitle().equals(title)) {
					System.out.println("있습니다 있는겁니다");
					return mv;
				}else {
					msg=baljuDao.insertJbaljudetails(title,(String)s.getAttribute("mid"));	
				}
			}
			
	       	
		return mv;
	}
	
	@RequestMapping("acceptOrder")
	public ModelAndView acceptOrder(com.jpro.jstore.Page page,HttpServletRequest req,
			HttpServletResponse resp) {
		HttpSession s = req.getSession();
		String title = req.getParameter("title");		
		baljuDao.changeStatus(title);
		List<JbaljudetailsVo> baljulist = baljuDao.select(page);//발주리스트 가져오는함수
		ModelAndView mv = new ModelAndView();			
		String url = "../common/order_main2.jsp";
		page = baljuDao.getPage();
		mv.addObject("baljupage",page);
		mv.addObject("inc",url);
		mv.addObject("title",title);
		mv.addObject("baljulist",baljulist);
		mv.setViewName("store/store_index");		
		return mv;
	}
	
	@RequestMapping("waitOrder")
	public ModelAndView waitOrder(com.jpro.jstore.Page page,HttpServletRequest req,
			HttpServletResponse resp) {
		HttpSession s = req.getSession();
		String title = req.getParameter("title");		
		baljuDao.waitOrder(title);
		List<JbaljudetailsVo> baljulist = baljuDao.select(page);//발주리스트 가져오는함수
		ModelAndView mv = new ModelAndView();			
		String url = "../common/order_main2.jsp";
		page = baljuDao.getPage();
		mv.addObject("baljupage",page);
		mv.addObject("inc",url);
		mv.addObject("title",title);
		mv.addObject("baljulist",baljulist);
		mv.setViewName("store/store_index");		
		return mv;
	}
	
	
}

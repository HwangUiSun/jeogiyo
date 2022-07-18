package com.jpro.jcontroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jpro.common.J_notiService;
import com.jpro.common.J_notiVo;
import com.jpro.jcenter.JcenterMemberVo;
import com.jpro.jcenter.JcenterStoreMService;
import com.jpro.jcenter.JcenterStoreVo;
import com.jpro.jcenter.JcenterMemberService;
import com.jpro.jcenter.Page;
import com.jpro.jstore.JbaljuListVo;
import com.jpro.jstore.JbaljuService;
import com.jpro.jstore.JbaljudetailsVo;
import com.jpro.jstore.JstoreVo;

@RestController
public class JcenterController {
	@Autowired
	JcenterMemberService dao;
	@Autowired
	J_notiService notiDao;
	
	@Autowired
	JbaljuService baljuDao;
	
	@Autowired
	JcenterStoreMService storeMDao;
	
	
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("center_login")
	public ModelAndView center_login() {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("center/center_index");		
		return mv;
	}
	// 공지사항~~~~~~~~~~~~~~~~~
	@RequestMapping("center_noti")
	public ModelAndView centerNoti(com.jpro.common.Page notipage) {
		ModelAndView mv = new ModelAndView();
		String url = "../common/noti_main.jsp";
		
		
		if(notipage.getFindStr() ==null) {
			notipage =  new com.jpro.common.Page();
			notipage.setNowPage(1);
			notipage.setFindStr("");
			
		}
	
		
		List<J_notiVo> notilist = notiDao.select(notipage); 
		notipage =  notiDao.getPage();
		
		mv.addObject("inc",url);
		mv.addObject("notilist",notilist);
		mv.addObject("notipage",notipage);

		mv.setViewName("center/center_index");
		return mv;
	}
	
	@RequestMapping("center_notiView")
	public ModelAndView center_notiView(com.jpro.common.Page notipage, int sno) {
		ModelAndView mv = new ModelAndView();
		String url = "../common/noti_view.jsp";
		J_notiVo vo = new J_notiVo();
		vo = notiDao.selectOne(sno);
		mv.addObject("vo", vo);
		mv.addObject("notipage",notipage);
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_notiInput") // 공지 작성 페이지 이동
	public ModelAndView center_notiInput(com.jpro.common.Page notipage) {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_notiInput.jsp";
	
		mv.addObject("inc",url);
		mv.addObject("notipage",notipage);
		mv.setViewName("center/center_index");
		
		return mv;
	}
	@RequestMapping("center_notiInputR") // 공지 작성 후
	public ModelAndView center_notiInputR(com.jpro.common.Page notipage, J_notiVo vo) {
		ModelAndView mv = new ModelAndView();
		System.out.println("con sno"+vo.getSno());
		System.out.println("con sub"+vo.getSubject());
		notiDao.insert(vo);
		mv =centerNoti(notipage);
		return mv;
	}
	
	@RequestMapping("center_notiUpdate") // 공지 수정 상세보기( summernote로 수정이 가능)
	public ModelAndView center_notiupdate(com.jpro.common.Page notipage, int sno) {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_notiInput.jsp";
		J_notiVo vo = new J_notiVo();
		vo=notiDao.selectOne(sno);
		
		mv.addObject("vo",vo);
		mv.addObject("notipage",notipage);
		mv.addObject("inc",url);
		
		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_notiUpdateR") 
	public ModelAndView center_notiupdateR(com.jpro.common.Page notipage, J_notiVo vo) {
		ModelAndView mv = new ModelAndView();
		// 수정 먼저 하고 리스트 호출
		notiDao.update(vo);
		
		mv=centerNoti(notipage);
		
		return mv;
	}
	
	@RequestMapping("center_notiDelete")
	public ModelAndView center_notiDelete(com.jpro.common.Page notipage, int sno) {
		ModelAndView mv = new ModelAndView();
		notiDao.delete(sno);
		mv= centerNoti(notipage);
		return mv;
	}
	

	
	
	
	
//----------------------------------------------------	
	
	
	@RequestMapping("center_order")
	public ModelAndView centerOrder(com.jpro.jstore.Page page) {
//		ModelAndView mv = new ModelAndView();
//		String url = "../common/order_main.jsp";
//		mv.addObject("inc",url);
//		
//		List<J_notiVo> notilist = notiDao.select(notipage); 
//		notipage = notiDao.getPage();
//		mv.addObject("orderlist",notilist);
//		mv.addObject("orderpage",notipage);
//		mv.setViewName("center/center_index");
//		
//		return mv;
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_main2.jsp";
		mv.addObject("inc",url);
		List<JbaljudetailsVo> baljulist = baljuDao.select(page);//발주리스트 가져오는함수
		page = baljuDao.getPage();
		mv.addObject("baljupage",page);
		mv.addObject("baljulist",baljulist);

		mv.setViewName("/center/center_index");

		return mv;
	}
	
	@RequestMapping("center_orderView")
	public ModelAndView centerOrder_view(com.jpro.jstore.Page page,HttpServletRequest req) {
		
		ModelAndView mv = new ModelAndView();
		String url = "../common/order_view.jsp";
		//select(title)
		HttpSession s = req.getSession();
		String tableName =req.getParameter("title");
		List<JbaljuListVo> selectSubOne = null;	
		selectSubOne =baljuDao.selecSubtList(page,tableName);	
		mv.addObject("selectSubOne",selectSubOne);
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
	public ModelAndView storeM(Page page) {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_storeM.jsp";
		
		mv.addObject("inc",url);
		List<JstoreVo> list = storeMDao.storeSelect(page);
		mv.addObject("list", list);

		mv.setViewName("center/center_index");
		
		return mv;
	}
	
	@RequestMapping("center_storeMview")
	public ModelAndView center_storeMview() {
		ModelAndView mv = new ModelAndView();
		String url = "../center/center_storeMview.jsp";
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
	
	@RequestMapping("acceptOrderC")
	public ModelAndView acceptOrderC(com.jpro.jstore.Page page,HttpServletRequest req,
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
		mv.setViewName("/center/center_index");		
		return mv;
	}
	
	@RequestMapping("waitOrderC")
	public ModelAndView waitOrderC(com.jpro.jstore.Page page,HttpServletRequest req,
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
		mv.setViewName("/center/center_index");		
		return mv;
	}
	
	@RequestMapping("addsC")
	public ModelAndView updateEa(com.jpro.jstore.Page page,HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		int ea = Integer.parseInt(req.getParameter("ea"));
		int sno = Integer.parseInt(req.getParameter("sno"));
		
		String url = "../common/order_view.jsp";
		mv.addObject("inc",url);
		HttpSession s = req.getSession();
		String tableName = req.getParameter("title");
		System.out.println("addc"+tableName);
		page.setTableName(tableName);	
		baljuDao.updateEa(ea, sno, tableName);
		

		//select(title)
		tableName =req.getParameter("title");
		System.out.println(tableName);
		List<JbaljuListVo> selectSubOne = null;	
		selectSubOne =baljuDao.selecSubtList(page,tableName);	
		mv.addObject("selectSubOne",selectSubOne);
		mv.addObject("inc",url);		
		mv.setViewName("center/center_index");		
		return mv;
	}

}

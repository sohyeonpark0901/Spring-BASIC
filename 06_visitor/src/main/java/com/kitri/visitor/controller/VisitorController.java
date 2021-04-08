package com.kitri.visitor.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kitri.visitor.service.VisitorService;
import com.kitri.visitor.service.VisitorServiceImpl;
import com.kitri.visitor.vo.VisitorVO;

@Controller
@RequestMapping("/visit")
public class VisitorController {
	
	//service객체 DI
	@Resource(name = "visitorServiceImpl")
	VisitorService visitorService;
	
	@RequestMapping("")
	public String visitor(Model model, @RequestParam(defaultValue = "")String msg) {
		System.out.println("visitor 호출");
		
		List<VisitorVO> vlist = visitorService.visitorList();
		model.addAttribute("vlist", vlist);
		
		return "visitor/visitor";
	}
	
	//글작성 mapping
	@RequestMapping(value = "/v-regist", method = RequestMethod.POST)
	public String vRegist(VisitorVO vo) {
		visitorService.visitorRegist(vo);
		return "redirect: /visitor/visit";
	}
	
	/*
	 * 
	 * Model 객체 
		Spring의 내장 객체로서 
		
		기존 WEB에서는 request나 session내장객체에
		setAttribute를 통해 데이터를 담아서 보내주었지만
		
		Spring에서 제공하는 model객체를 파라미터로 선언
		만 해주면 스프링이 알아서 해당객체를 만들고 
		화면에 데이터를 전달해 준다.
		
		>즉 스프링에서 사용하는 request 대체 객체
		생명주기는 request와 동일 하여 하나의 요청 처리에
		국한된다. 즉 데이터를 담기위한 객체
		
		ModelAndView
		스프링 2.0이전 버전에서 사용하던 객체로 최신버전
		에서도 사용 가능
		객체에 데이터를 담아 전송 할 수 있고 view로 
		이동까지 가능 
	 * */
	
	@RequestMapping("/update")
	public void update(VisitorVO vo, HttpServletResponse response) {
		String result = visitorService.visitorUpdate(vo);
		
		try {
			response.getWriter().print(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping("/delete")
	public String delete(int vNo,String vPwd) throws UnsupportedEncodingException {
		System.out.println(vNo+"\t"+vPwd);
		String msg = visitorService.visitorDelete(vNo, vPwd);
		return "redirect: /visitor/visit?msg="+URLEncoder.encode(msg,"UTF-8");
	}
	
}

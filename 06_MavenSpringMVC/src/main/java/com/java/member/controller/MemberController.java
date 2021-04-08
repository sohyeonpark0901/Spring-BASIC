package com.java.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.InternalResourceView;

import com.java.aop.HAspect;
import com.java.member.dto.MemberDto;
import com.java.member.service.MemberService;

@Controller
public class MemberController{	//Command
	@Autowired
	private MemberService memberService;
	
	/* ȸ�� ����
	 * */
	@RequestMapping(value="/member/main.do",method=RequestMethod.GET)
	public ModelAndView memberMain(HttpServletRequest request,HttpServletResponse response) {
		
		return new ModelAndView("member/main");
	}
	
	
	/* ȸ������
	 * */
	@RequestMapping(value="/member/register.do",method=RequestMethod.GET)
	public ModelAndView memberRegister(HttpServletRequest request,HttpServletResponse response) {
		
		return new ModelAndView("member/register");
	}
	
	@RequestMapping(value="/member/registerOk.do",method=RequestMethod.POST)
	public ModelAndView memberRegisterOk(HttpServletRequest request,HttpServletResponse response,MemberDto memberDto) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("memberDto",memberDto);
		memberService.memberRegisterOk(mav);
		
		return mav;
	}
	
	/* ���̵� Ȯ��
	 * */ 
	@RequestMapping(value="/member/idCheck.do",method=RequestMethod.GET)
	public ModelAndView memberIdCheck(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		memberService.memberidCheck(mav);
		
		return mav;
	}
	
	
	/* ȸ�� ����
	 * */
	@RequestMapping(value="/member/update.do",method=RequestMethod.GET)
	
	public ModelAndView memberUpdate(HttpServletRequest request,HttpServletResponse response,MemberDto memberDto) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		memberService.memberUpdate(mav);
		return mav;
	}
	
	@RequestMapping(value="/member/updateOk.do",method=RequestMethod.POST)
	public ModelAndView memberUpdateOk(HttpServletRequest request,HttpServletResponse response,MemberDto memberDto) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("memberDto",memberDto);
		memberService.memberUpdateOk(mav);
		
		return mav;
	}
	
	
	/* �α���
	 * */
	@RequestMapping(value="/member/login.do",method=RequestMethod.GET)
	public ModelAndView memberLogin(HttpServletRequest request,HttpServletResponse response) {
		
		
		return new ModelAndView("member/login");
		
	}
	
	@RequestMapping(value="/member/loginOk.do",method=RequestMethod.POST)
	public ModelAndView memberLoginOk(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		memberService.memberloginOk(mav);
		
		return mav;
	}
	
	
	/* �α׾ƿ�
	 * */
	@RequestMapping(value="/member/logout.do",method=RequestMethod.GET)
	public ModelAndView memberLoginOk(HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		
			if (session.getAttribute("id")!=null) {
				session.invalidate();
			}
			return new ModelAndView("redirect: /homepage");
		
	}
	
	
	/* ȸ��Ż��
	 * */
	@RequestMapping(value="/member/delete.do",method=RequestMethod.GET)
	public ModelAndView memberDelete(HttpServletRequest request,HttpServletResponse response) {
		return new ModelAndView("member/delete");
	}
	
	@RequestMapping(value="/member/deleteOk.do",method=RequestMethod.POST)
	public ModelAndView memberDelete(HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		memberService.memberDeleteOk(mav);
		
		if (session.getAttribute("id")!=null) {
			session.invalidate();
		}
		
		return new ModelAndView("redirect: /homepage");
	}
	
	
}

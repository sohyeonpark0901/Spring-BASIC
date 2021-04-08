package com.java.member.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.java.aop.HAspect;
import com.java.member.dao.MemberDao;
import com.java.member.dto.MemberDto;



@Component
public class MemberServiceImp implements MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public void memberRegisterOk(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		MemberDto memberDto = (MemberDto) map.get("memberDto");
		memberDto.setMemberLevel("BA");
		
		int check = memberDao.memberinsert(memberDto);
		mav.addObject("check",check);
		mav.setViewName("member/registerOk");
		
	}

	@Override
	public void memberidCheck(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		int check =0;
		String id = request.getParameter("id");
		String cId = memberDao.memberidCheck(id);
		if(cId != null) {
			check=1;
		}
		else {
			mav.addObject("id",id);
		}
		mav.addObject("check",check);
		mav.setViewName("member/idCheck");
	}

	@Override
	public void memberZipcode(ModelAndView mav) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberlogin(ModelAndView mav) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberloginOk(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		String memberLevel = memberDao.loginOk(id,password);
		mav.addObject("memberLevel",memberLevel);
		mav.addObject("id",id);
		mav.setViewName("member/loginOk");
		
	}
	
	public void memberDeleteOk(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		int check = memberDao.deleteOk(id,password);
		mav.addObject("check",check);
		mav.setViewName("member/deleteOk");
	}

	@Override
	public void main(ModelAndView mav) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void memberUpdateOk(ModelAndView mav) {
		Map<String,Object> map = mav.getModelMap();
		MemberDto memberDto = (MemberDto) map.get("memberDto");
		memberDto.setMemberLevel("BA");
		int check = memberDao.memberUpdateOk(memberDto);
		mav.addObject("check",check);
		mav.setViewName("member/updateOk");
		
	}

	@Override
	public void memberUpdate(ModelAndView mav) {
		
		Map<String,Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		MemberDto memberDto = memberDao.memberUpdate(id);
		mav.addObject("memberDto",memberDto);
		mav.setViewName("/member/update");
	}

	
	
	
}

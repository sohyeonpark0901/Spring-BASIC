package com.java.fileBoard.controller;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.fileBoard.dto.FileBoardDto;
import com.java.fileBoard.service.FileBoardService;

@Controller
public class FileBoardController{
	
	@Autowired
	private FileBoardService fileBoardService;
	/* 게시판 글쓰기 (답글도 가능)
	 * */
	@RequestMapping(value="/fileBoard/write.do")
	public ModelAndView fileBoardWrite(HttpServletRequest request,HttpServletResponse response) {
		// 맨처음 ModelAndView 객체 생성이유 : 답글형 게시판의 부모글 여부를 확인하기 위해서
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		fileBoardService.fileBoardWrite(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/fileBoard/writeOk.do")
	public ModelAndView fileBoardWriteOk(HttpServletRequest request,HttpServletResponse response,FileBoardDto fileBoardDto) {
		// 맨처음 ModelAndView 객체 생성이유 : 답글형 게시판의 부모글 여부를 확인하기 위해서
		ModelAndView mav = new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("fileBoardDto",fileBoardDto);
		fileBoardService.fileBoardWriteOk(mav);
		
		return mav;
	}
	
	
}

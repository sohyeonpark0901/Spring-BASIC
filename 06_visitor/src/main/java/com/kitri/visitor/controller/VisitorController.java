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
	
	//service��ü DI
	@Resource(name = "visitorServiceImpl")
	VisitorService visitorService;
	
	@RequestMapping("")
	public String visitor(Model model, @RequestParam(defaultValue = "")String msg) {
		System.out.println("visitor ȣ��");
		
		List<VisitorVO> vlist = visitorService.visitorList();
		model.addAttribute("vlist", vlist);
		
		return "visitor/visitor";
	}
	
	//���ۼ� mapping
	@RequestMapping(value = "/v-regist", method = RequestMethod.POST)
	public String vRegist(VisitorVO vo) {
		visitorService.visitorRegist(vo);
		return "redirect: /visitor/visit";
	}
	
	/*
	 * 
	 * Model ��ü 
		Spring�� ���� ��ü�μ� 
		
		���� WEB������ request�� session���尴ü��
		setAttribute�� ���� �����͸� ��Ƽ� �����־�����
		
		Spring���� �����ϴ� model��ü�� �Ķ���ͷ� ����
		�� ���ָ� �������� �˾Ƽ� �ش簴ü�� ����� 
		ȭ�鿡 �����͸� ������ �ش�.
		
		>�� ���������� ����ϴ� request ��ü ��ü
		�����ֱ�� request�� ���� �Ͽ� �ϳ��� ��û ó����
		���ѵȴ�. �� �����͸� ������� ��ü
		
		ModelAndView
		������ 2.0���� �������� ����ϴ� ��ü�� �ֽŹ���
		������ ��� ����
		��ü�� �����͸� ��� ���� �� �� �ְ� view�� 
		�̵����� ���� 
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

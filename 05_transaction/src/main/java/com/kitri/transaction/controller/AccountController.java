package com.kitri.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kitri.transaction.service.AccountService;

@Controller
public class AccountController {
	
	//��ü controller
	//service�� ȣ��
	@Autowired
	AccountService service;
	
	@RequestMapping("/")
	public String transferPage() {
		System.out.println("account");
		return "account";
	}
	
	
	
	
}

package com.kitri.visitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/visit")
public class VisitorController {
	
	@RequestMapping("")
	public String visitor(Model model, @RequestParam(defaultValue="")String msg) {
		System.out.println("visitor»£√‚");
		return "/visitor/visitor";
	}
	
}

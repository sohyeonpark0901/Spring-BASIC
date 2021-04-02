package com.kitri.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class interceptorTest implements HandlerInterceptor {
	
			
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//controller 실행 전
		System.out.println("Interceptor-1 preHandler");
		return true;
	}

	@Override  
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//controller 실행 후
		System.out.println("Interceptor-1 postHandle");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//view 전송 후 실행
		System.out.println("Interceptor-1 afterCompletion");

		
	}

}

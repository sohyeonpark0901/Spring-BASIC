package com.java.aop05;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopAspect {
	public void before() {
		System.out.println("공통 기능 before 실행");
	}
	public void after() {
		System.out.println("공통 기능 after 실행");
	}
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("공통 기능 이전");
		pjp.proceed();
		System.out.println("공통 기능 이후");
	}
	
}

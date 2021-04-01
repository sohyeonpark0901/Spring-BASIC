package com.java.aop06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopAspect {
	
	//핵심 기능 설정
	@Pointcut("execution(void com.java.aop06..*(..))")
	private void pointCut() {
		
	}
	//공통기능 설정
	@Before("pointCut()")
	public void before() {
		System.out.println("공통 기능 before 실행");
	}
	@After("pointCut()")
	public void after() {
		System.out.println("공통 기능 after 실행");
	}
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("공통 기능 이전");
		pjp.proceed();
		System.out.println("공통 기능 이후");
	}
	
}

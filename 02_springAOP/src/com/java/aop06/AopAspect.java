package com.java.aop06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopAspect {
	
	//�ٽ� ��� ����
	@Pointcut("execution(void com.java.aop06..*(..))")
	private void pointCut() {
		
	}
	//������ ����
	@Before("pointCut()")
	public void before() {
		System.out.println("���� ��� before ����");
	}
	@After("pointCut()")
	public void after() {
		System.out.println("���� ��� after ����");
	}
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("���� ��� ����");
		pjp.proceed();
		System.out.println("���� ��� ����");
	}
	
}

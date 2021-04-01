package com.java.aop05;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopAspect {
	public void before() {
		System.out.println("���� ��� before ����");
	}
	public void after() {
		System.out.println("���� ��� after ����");
	}
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("���� ��� ����");
		pjp.proceed();
		System.out.println("���� ��� ����");
	}
	
}

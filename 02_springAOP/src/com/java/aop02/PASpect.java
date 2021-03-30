package com.java.aop02;

import org.aspectj.lang.JoinPoint;

public class PASpect {
	//공통 클래스 : aspect
	
	public void awake(JoinPoint joinPoint) { // 공통함수 : advice
		System.out.println("일어난다");		 // JOINPOINT: 핵심코드를 가져온다.
		
	}
	
	public void sleep(JoinPoint joinPoint) { // 공통함수 : advice
											 // JOINPOINT: 핵심코드를 가져온다.
		System.out.println("잠을잔다");
	}
}

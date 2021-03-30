package com.java.aop03;

import org.aspectj.lang.JoinPoint;

public class PAspect {
	public void open(JoinPoint joinPoint) {
		System.out.println("수업시작! 강의장에 들어온다");
	}
	
	public void close(JoinPoint joinPoint) {
		System.out.println("수업끝! 강의장에 나간다");
	}
	public void error(JoinPoint joinPoint) {
		System.out.println("떠들어서 쫓겨났다.");
	}
	public void eat(JoinPoint joinPoint) {
		System.out.println("점심을 맛있게 먹는다.");
	}
}

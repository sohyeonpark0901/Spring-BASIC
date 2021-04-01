package com.java.aop05;

public class AopTest {
	//핵심클래스
	public void method1() {
		System.out.println("핵심기능(비즈니스 로직 method1 호출");
	}
	public void method2() {
		System.out.println("핵심기능(비즈니스 로직 method2 호출");
	}
	public String method3() {
		System.out.println("핵심기능(비즈니스 로직 method3 호출");
		return "";
	}
	public int method4() {
		System.out.println("핵심기능(비즈니스 로직 method4 호출");
		return 0;
	}
}

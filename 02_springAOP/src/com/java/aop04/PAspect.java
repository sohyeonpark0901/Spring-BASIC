package com.java.aop04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class PAspect {
	public void sub(ProceedingJoinPoint joinPoint) throws Throwable {
		try {
			//핵심함수 전
			System.out.println("강의장 입실");
			//핵심코드 : joinPoint를 어디에 거느냐에 따라 핵심함수 전 시점이 달라짐
			joinPoint.proceed();
			//정상적으로 종료되었을때
			System.out.println("점심식사를 맛나게 한다.");
		} catch (Exception e) {
			//exception 발생시
			System.out.println("떠들어서 쫓겨남");
		}finally {
			//정상함수 종료 시 
			System.out.println("수업끝 강의장을 나간다.");
		}
	}
}

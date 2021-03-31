package com.java.di09.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle1 implements InitializingBean, DisposableBean{

	//빈 소멸 과정에서 호출
	@Override
	public void destroy() throws Exception {
		
		System.out.println("빈 소멸 실행");
		System.out.println("close, 값 반환");
		
	}
	
	//빈 초기화 과정에서 호출
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("빈 초기화 실행");
		System.out.println("DB설정, 트랜잭션, 초기화");
		
	}
	
}

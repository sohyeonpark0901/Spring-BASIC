package com.java.di07;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Excel2 {
	
	// 타입 : 인터페이스를 구현한 객체
	//자동 주입 방식
	//@Autowired // 타입으로 찾는다. 같은 타입클래스가 2개 이상일 때 에러
			   // 같은 인터페이스를 상속받는 클래스
	//@Qualifier("print-a1")//같은 타입의 클래스가 2개 이상일 때 아이디로 찾아줌
						  //@Autowired가 항상 같이 붙어있어야함
	//@Resource(name="print-a1") //name으로 찾는다. name이 없을 경우 타입으로 찾음
	@Inject //타입으로 찾는다. 
	@Named("print-a1")
	Print print;
		
	public void excelPrint() {
		print.print();
	}
	
	
}

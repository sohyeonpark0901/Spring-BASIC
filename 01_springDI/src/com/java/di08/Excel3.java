package com.java.di08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Excel3 {
	
	@Autowired(required = true) //객체가 존재하지 않을 경우 예외 발생
	@Qualifier("print-A")
	Print print;
	
	//new Excel3() 객체 생성시 호출
	public Excel3() {
		System.out.println("Excel3 객체 생성");
	}
	public void excelPrint() {
		if (print != null) {
			print.print();
		}else {
			System.out.println("print is null");
		}
	}
	
	
}

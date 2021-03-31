package com.java.di06;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	//내부적으로 싱글톤 패턴이 적용된다.
	@Bean
	public Print print() {
		
		PrintA printA = new PrintA("프린터 출력입니다.");
		return printA;
		
	}
	
	@Bean
	public Excel excel() {
		Excel excel = new Excel(print());
		return excel;
	}
	
	@Bean
	public Print printB() {
		
		PrintA printB = new PrintA("프린터 출력입니다.");
		return printB;
		
	}
	@Bean
	public Excel excelList() {
		
		Excel excel = new Excel();
		ArrayList<Print> printList = new ArrayList<Print>();
		printList.add(print());
		printList.add(printB());
		excel.setPrintList(printList);
		return excel;
		
	}
	
}

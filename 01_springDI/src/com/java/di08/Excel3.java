package com.java.di08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Excel3 {
	
	@Autowired(required = true) //��ü�� �������� ���� ��� ���� �߻�
	@Qualifier("print-A")
	Print print;
	
	//new Excel3() ��ü ������ ȣ��
	public Excel3() {
		System.out.println("Excel3 ��ü ����");
	}
	public void excelPrint() {
		if (print != null) {
			print.print();
		}else {
			System.out.println("print is null");
		}
	}
	
	
}

package com.java.di07;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Excel2 {
	
	// Ÿ�� : �������̽��� ������ ��ü
	//�ڵ� ���� ���
	//@Autowired // Ÿ������ ã�´�. ���� Ÿ��Ŭ������ 2�� �̻��� �� ����
			   // ���� �������̽��� ��ӹ޴� Ŭ����
	//@Qualifier("print-a1")//���� Ÿ���� Ŭ������ 2�� �̻��� �� ���̵�� ã����
						  //@Autowired�� �׻� ���� �پ��־����
	//@Resource(name="print-a1") //name���� ã�´�. name�� ���� ��� Ÿ������ ã��
	@Inject //Ÿ������ ã�´�. 
	@Named("print-a1")
	Print print;
		
	public void excelPrint() {
		print.print();
	}
	
	
}

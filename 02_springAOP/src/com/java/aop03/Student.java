package com.java.aop03;

import java.util.Scanner;

public class Student implements Person {

	@Override
	public void work() {
		System.out.println("�л��� ���θ� �Ѵ�.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �Է� : ");
		int su = sc.nextInt();
		
		if (su==5) {
			System.out.println(su/0);
		}
		sc.close();
	}

}

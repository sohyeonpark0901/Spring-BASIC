package com.java.aop04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class PAspect {
	public void sub(ProceedingJoinPoint joinPoint) throws Throwable {
		try {
			//�ٽ��Լ� ��
			System.out.println("������ �Խ�");
			//�ٽ��ڵ� : joinPoint�� ��� �Ŵ��Ŀ� ���� �ٽ��Լ� �� ������ �޶���
			joinPoint.proceed();
			//���������� ����Ǿ�����
			System.out.println("���ɽĻ縦 ������ �Ѵ�.");
		} catch (Exception e) {
			//exception �߻���
			System.out.println("���� �Ѱܳ�");
		}finally {
			//�����Լ� ���� �� 
			System.out.println("������ �������� ������.");
		}
	}
}

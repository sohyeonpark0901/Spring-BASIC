package com.java.di09.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle1 implements InitializingBean, DisposableBean{

	//�� �Ҹ� �������� ȣ��
	@Override
	public void destroy() throws Exception {
		
		System.out.println("�� �Ҹ� ����");
		System.out.println("close, �� ��ȯ");
		
	}
	
	//�� �ʱ�ȭ �������� ȣ��
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("�� �ʱ�ȭ ����");
		System.out.println("DB����, Ʈ�����, �ʱ�ȭ");
		
	}
	
}

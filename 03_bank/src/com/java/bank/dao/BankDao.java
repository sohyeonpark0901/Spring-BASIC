package com.java.bank.dao;

import java.util.List;

import com.java.bank.dto.BankDto;

public interface BankDao {
	//���� ����
	public int makeAccount(BankDto bankDto);
	
	//��ü ���� ��ȸ
	public List<BankDto> showData();
	
	//�Ϲ� ��ȸ
	public BankDto select(String id);
	
	//��|���
	public int update(BankDto bankDto);
	
	
}

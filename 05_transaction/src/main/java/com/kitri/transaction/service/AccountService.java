package com.kitri.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;

@Service
public class AccountService {
	
	
	@Autowired
	AccountDAO dao;
	
	@Autowired
	PlatformTransactionManager transactionManager;

	public void transfer(int money, String accountNum) throws Exception {
		
		
		//홍길동의 계좌에서 출급
		dao.withdraw(money,"1234-5678");
		
		//System.out.println(dao.transfering());
		
		//임꺽정의 계좌에서 입금
		dao.deposit(money,accountNum);
		System.out.println(dao.transferOk());
	}

}

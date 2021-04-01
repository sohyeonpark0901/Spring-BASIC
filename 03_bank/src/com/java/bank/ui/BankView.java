package com.java.bank.ui;

import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dto.BankDto;

public class BankView implements BankUi{
	
	private BankDao bankDao;
	private BankDto bankDto;

	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}

	public void setBankDto(BankDto bankDto) {
		this.bankDto = bankDto;
	}

	public BankView(BankDao bankDao, BankDto bankDto) {
		super();
		this.bankDao = bankDao;
		this.bankDto = bankDto;
	}

	public BankView() {}
	
	
	@Override
	public void execute() {
		
		//화면을 만드는 method
		printMenu();
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요.");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			makeAccount();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
		case 4:
			inquiry();
			break;
		case 5:
			showData();
			break;
		case 6:
			break;
		default:
			System.out.println("숫자를 잘못 입력 하였습니다.");
			break;
		}
		
		sc.close();
		
		
	}
	
	private void showData() {
		// TODO Auto-generated method stub
		
	}

	private void inquiry() {
		// TODO Auto-generated method stub
		
	}

	private void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호:");
		String id = sc.next();
		bankDto = bankDao.select(id);
		if(bankDto !=null) {
			System.out.println("입금액:");
			long money = sc.nextLong();
			bankDto.setBalance(bankDto.getBalance()+money);
			
			int check = bankDao.update(bankDto);
			
			if(check>0) {
				System.out.println("입금완료");
			}else {
				System.out.println("입금실패");
			}
		}else {
			System.out.println("계좌번호를 확인 후 다시 시도하세요");
		}
		sc.close();
	}

	private void makeAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호:");
		String id = sc.next();
		
		//비교만 해주면 되므로 여기서만 쓰고 말 비교값이기 때문에
		BankDto dto = bankDao.select(id);
		
		if(dto!=null) {
			System.out.println("이미 존재하는 계좌 번호 입니다.");
		}else {
			bankDto.setId(id);
			System.out.println("이름:");
			bankDto.setName(sc.next());
			
			System.out.println("입금액:");
			bankDto.setBalance(sc.nextLong());
			
			int check = bankDao.makeAccount(bankDto);
			
			System.out.println("계좌가 생성되었습니다.");
		}
		sc.close();
		
	}

	public void printMenu() {
		System.out.println("Menu=============");
		System.out.println("1. 계좌계설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 잔액조회");
		System.out.println("5. 전체줄력");
		System.out.println("6. 종료");
	}
	
	
}

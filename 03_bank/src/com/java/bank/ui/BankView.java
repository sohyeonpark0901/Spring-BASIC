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
		
		//ȭ���� ����� method
		printMenu();
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϼ���.");
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
			System.out.println("���ڸ� �߸� �Է� �Ͽ����ϴ�.");
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
		System.out.println("���¹�ȣ:");
		String id = sc.next();
		bankDto = bankDao.select(id);
		if(bankDto !=null) {
			System.out.println("�Աݾ�:");
			long money = sc.nextLong();
			bankDto.setBalance(bankDto.getBalance()+money);
			
			int check = bankDao.update(bankDto);
			
			if(check>0) {
				System.out.println("�ԱݿϷ�");
			}else {
				System.out.println("�Աݽ���");
			}
		}else {
			System.out.println("���¹�ȣ�� Ȯ�� �� �ٽ� �õ��ϼ���");
		}
		sc.close();
	}

	private void makeAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���¹�ȣ:");
		String id = sc.next();
		
		//�񱳸� ���ָ� �ǹǷ� ���⼭�� ���� �� �񱳰��̱� ������
		BankDto dto = bankDao.select(id);
		
		if(dto!=null) {
			System.out.println("�̹� �����ϴ� ���� ��ȣ �Դϴ�.");
		}else {
			bankDto.setId(id);
			System.out.println("�̸�:");
			bankDto.setName(sc.next());
			
			System.out.println("�Աݾ�:");
			bankDto.setBalance(sc.nextLong());
			
			int check = bankDao.makeAccount(bankDto);
			
			System.out.println("���°� �����Ǿ����ϴ�.");
		}
		sc.close();
		
	}

	public void printMenu() {
		System.out.println("Menu=============");
		System.out.println("1. ���°輳");
		System.out.println("2. �Ա�");
		System.out.println("3. ���");
		System.out.println("4. �ܾ���ȸ");
		System.out.println("5. ��ü�ٷ�");
		System.out.println("6. ����");
	}
	
	
}

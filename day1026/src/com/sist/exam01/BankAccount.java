package com.sist.exam01;

public class BankAccount {
	private int balance;
	public void deposit(int amount) {
		balance += amount;
		System.out.printf("%d���� �Ա��Ͽ� �ܾ��� %d���Դϴ�.\n", amount,balance);
	}
	public void withdraw(int amount)throws NegativeArraySizeException {
		//������� �ܾ׺��� �� ũ�ٸ�, ����� ���� ������ NefativeBalanceException
		if(amount>balance) {
			throw new NegativeArraySizeException("�ܾ��� �����մϴ�.");
		}
		balance -= amount;
		System.out.printf("%d���� �����Ͽ� �ܾ��� %d���Դϴ�.\n", amount,balance);
	}
		
}

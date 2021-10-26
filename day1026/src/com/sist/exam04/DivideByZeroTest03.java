package com.sist.exam04;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DivideByZeroTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2 , result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ����");
		number1= sc.nextInt();
		
		System.out.println("�� ��° ����");
		number2= sc.nextInt();
		
		try{result = quotient(number1, number2);
			System.out.println(result);
		}catch(DivideByZeroException e) {
			e.printStackTrace();
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}finally {
			System.out.println("�۾��Ϸ�");
		}
	}
	
	public static int quotient(int numerator, int demoninator) 
			throws DivideByZeroException {
		if(demoninator==0) {
			throw new DivideByZeroException("�и� 0�� �� ���� �����!");
		}
		return numerator/demoninator;
	}

	
}

//20,5   	=>4
//20,"abc"  =>InputMismatchException: "abc"
//20,0 		=>ArithmeticException : �и� 0(x)

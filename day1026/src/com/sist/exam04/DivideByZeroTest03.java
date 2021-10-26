package com.sist.exam04;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DivideByZeroTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2 , result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수");
		number1= sc.nextInt();
		
		System.out.println("두 번째 정수");
		number2= sc.nextInt();
		
		try{result = quotient(number1, number2);
			System.out.println(result);
		}catch(DivideByZeroException e) {
			e.printStackTrace();
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}finally {
			System.out.println("작업완료");
		}
	}
	
	public static int quotient(int numerator, int demoninator) 
			throws DivideByZeroException {
		if(demoninator==0) {
			throw new DivideByZeroException("분모가 0이 될 수가 없어요!");
		}
		return numerator/demoninator;
	}

	
}

//20,5   	=>4
//20,"abc"  =>InputMismatchException: "abc"
//20,0 		=>ArithmeticException : 분모가 0(x)

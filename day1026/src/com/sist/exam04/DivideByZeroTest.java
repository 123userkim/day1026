package com.sist.exam04;
import java.util.Scanner;


public class DivideByZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2 , result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수");
		number1= sc.nextInt();
		
		System.out.println("두 번째 정수");
		number2= sc.nextInt();
		
		result = number1/ number2;
		System.out.println(result);
	}

	
}

//20,5   	=>4
//20,"abc"  =>InputMismatchException: "abc"
//20,0 		=>ArithmeticException : 분모가 0(x)

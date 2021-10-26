package com.sist.exam04;
import java.util.*;
import java.util.Scanner;


public class DivideByZeroTest02 {

	public static void main(String[] args) {
		try {
		int number1, number2 , result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수");
		number1= sc.nextInt();
		
		System.out.println("두 번째 정수");
		number2= sc.nextInt();
		
		result = number1/ number2;
		System.out.println(result);
		}catch(Exception e) {  //예외를 받는 변수의 이름은 보통 e
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("작업완료");
		}
	}

}

//20,5   	=>4
//20,"abc"  =>InputMismatchException: "abc"
//20,0 		=>ArithmeticException : 분모가 0(x)

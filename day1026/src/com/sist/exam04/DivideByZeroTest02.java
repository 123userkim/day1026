package com.sist.exam04;
import java.util.*;
import java.util.Scanner;


public class DivideByZeroTest02 {

	public static void main(String[] args) {
		try {
		int number1, number2 , result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ����");
		number1= sc.nextInt();
		
		System.out.println("�� ��° ����");
		number2= sc.nextInt();
		
		result = number1/ number2;
		System.out.println(result);
		}catch(Exception e) {  //���ܸ� �޴� ������ �̸��� ���� e
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("�۾��Ϸ�");
		}
	}

}

//20,5   	=>4
//20,"abc"  =>InputMismatchException: "abc"
//20,0 		=>ArithmeticException : �и� 0(x)

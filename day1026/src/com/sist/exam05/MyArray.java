package com.sist.exam05;

import java.util.Scanner;

public class MyArray {
	public int []data;
	public MyArray() {
		data= new int [10];
		//data = new int[0];
		
		try {
		data= new int [-10];
		Scanner sc = new Scanner (System.in);
		for(int i=0; i<data.length;i++) {
			System.out.printf("%d��°�� �����͸� �Է��ϼ���",i+1);
			data[i]=sc.nextInt();
		}
		}catch(NegativeArraySizeException e) {
			System.out.println("���ܹ߻� : �迭�� ũ��� ������ �� �� ����");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻� : �迭�� �ε��� ������ �Ѿ���");
		}catch(NullPointerException e)  {
			System.out.println("�迭�� �������� �ʾҽ��ϴ�.");
		}
		
	}
	
	public double getAverage() {
		double avg=0;
		int sum = 0;
		try {
			for(int i=0; i<data.length ;i++) {
				sum+=data[i];
			}
		avg=sum/data.length;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻� : �迭�� ������ �Ѿ����ϴ�.");
		}catch(NullPointerException e) {
			System.out.println("���ܹ߻� : �迭�� �������� �ʾҽ��ϴ�.");
		}
		return avg;
	}
}

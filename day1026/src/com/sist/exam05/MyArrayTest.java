package com.sist.exam05;

public class MyArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray array = new MyArray();
		System.out.println("�迭�� ��� : "+array.getAverage());
	}

}

/*
1)�� ���α׷����� ArithmeticException�� ���� �߻��ϳ�?
	=> �迭�� ���̰� 0�� ��
2)NegativeArraySizeException 
	=>�迭�� ũ�Ⱑ ������ ��
3)ArrayIndexOutOfBoundsException
	=>�迭�� �ε��� ������ �Ѵ� �ε����� �����Ϸ��� �� ��
4)NullPointerException
 	=>

*/
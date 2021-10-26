package com.sist.exam06;

public class MyArrayTest {

	public static void main(String[] args) {
		try {
		MyArray array = new MyArray();
		System.out.println("�迭�� ��� : "+array.getAverage());
		}catch(NegativeArraySizeException e) {
			System.out.println("���ܹ߻� : �迭�� ũ��� ������ �� �� ����");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻� : �迭�� �ε��� ������ �Ѿ���");
		}catch(NullPointerException e)  {
			System.out.println("���ܹ߻� : �迭�� �������� �ʾҽ��ϴ�.");
		}
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
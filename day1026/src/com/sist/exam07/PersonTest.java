package com.sist.exam07;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("ȫ�浿"); 
		Person p2 = new Person("������");
		p.sayHello();  //��κ��� ��ó���� �޼ҵ�� ������� , �޼ҵ带 thread��� ��
		p2.sayHello();  //�����ϸ�, ���� ���ÿ� �����ϵ��� �ϰ� ���� ->multi thread
	}

}

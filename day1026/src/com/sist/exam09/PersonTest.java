package com.sist.exam09;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("����ȣ");
		Person p2 = new Person("������");
		//p.start();  runnable�������̽��� start�޼ҵ尡 ����=>thread��ü�� �����ϱ�
		/*
		Thread t = new Thread(p);
		Thread t2 = new Thread(p2);
		t.start();
		t2.start();*/
		
		new Thread(p).start();
		new Thread(p2).start();
		
		
	}

}
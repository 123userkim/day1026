package com.sist.exam08;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1= new Person("�����");
		Person person2= new Person("����ȣ");
		Person person3= new Person("������");
		 
		person1.start();
		person2.start();
		person3.start();
		
		//�����带 ����(���ÿ� �����ϰ� ����) ��Ű���� start()�޼ҵ带 ȣ��
		//start�� ȣ������ �ʰ�, run()�� ����ȣ���ϸ�->����x �Ϲݸ޼ҵ�ó�� ����
		//ȣ���� ��� ������� �� �����
		/*
		person1.run();
		person2.run();
		person3.run();
		*/
		}

}

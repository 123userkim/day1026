package com.sist.exam08;

public class Person extends Thread {
	private String name;
	public Person(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		for(int i =1 ; i<=10;i++) {
			System.out.println("�ȳ� "+name+"====>"+i);
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
	}
	
	
	//personTest�� main�޼ҵ忡�� 
	//�� ���� person��ü�� ������ ����
	//thread ����
	
}

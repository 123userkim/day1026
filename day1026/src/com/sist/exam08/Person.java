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
			System.out.println("안녕 "+name+"====>"+i);
			try{
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
	}
	
	
	//personTest의 main메소드에서 
	//두 개의 person객체를 생성한 다음
	//thread 가동
	
}

package com.sist.exam08;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1= new Person("김수연");
		Person person2= new Person("최현호");
		Person person3= new Person("윤태인");
		 
		person1.start();
		person2.start();
		person3.start();
		
		//쓰레드를 가동(동시에 공평하게 실행) 시키려면 start()메소드를 호출
		//start를 호출하지 않고, run()을 직접호출하면->공평x 일반메소드처럼 동작
		//호출한 대로 순서대로 쭉 실행됨
		/*
		person1.run();
		person2.run();
		person3.run();
		*/
		}

}

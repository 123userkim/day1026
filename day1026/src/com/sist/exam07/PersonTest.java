package com.sist.exam07;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("홍길동"); 
		Person p2 = new Person("유관순");
		p.sayHello();  //대부분의 일처리는 메소드로 만들어짐 , 메소드를 thread라고 함
		p2.sayHello();  //가능하면, 둘이 동시에 실행하도록 하고 싶음 ->multi thread
	}

}

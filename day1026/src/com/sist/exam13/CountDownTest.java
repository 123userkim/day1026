package com.sist.exam13;

public class CountDownTest {
	 
	 public static void main(String[] args) {
		
	
	CountDown c= new CountDown();
	CountDownEvent e = new CountDownEvent(2, "������ġ �и�");
	c.start();
	e.start();
	}
}

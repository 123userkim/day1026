package com.sist.exam12;

public class CountDownEventTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------");
		CountDownEvent e = new CountDownEvent(3, "연결장치 분리");
		e.start();
	}

}
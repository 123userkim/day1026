package com.sist.exam10;

public class CountDown extends Thread{

	@Override
	public void run() {
		
		for(int i =20 ;i>0 ;i--) {  //0보다 클 동안
			System.out.println(i+"초 전입니다.");
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				
		    }
		
	    }
	}

}

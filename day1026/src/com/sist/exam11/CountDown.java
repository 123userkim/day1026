package com.sist.exam11;

public class CountDown extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =20 ; i>0;i=i-1) {
			System.out.println(i+"초 전입니다.");
			
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}

		}
	}

	
}

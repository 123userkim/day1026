package com.sist.exam10;

public class CountDown extends Thread{

	@Override
	public void run() {
		
		for(int i =20 ;i>0 ;i--) {  //0���� Ŭ ����
			System.out.println(i+"�� ���Դϴ�.");
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				
		    }
		
	    }
	}

}

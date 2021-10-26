package com.sist.exam14;

import java.util.Date;

public class SayHello extends Thread{
	
		
			@Override
			public void run() {
				while(true) {			//계속돌아가게
					Date now = new Date();
					System.out.println(now+ " 안녕하세요?");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
						
					}
				}	 
			}
}

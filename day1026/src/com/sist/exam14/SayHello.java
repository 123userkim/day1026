package com.sist.exam14;

import java.util.Date;

public class SayHello extends Thread{
	
		
			@Override
			public void run() {
				while(true) {			//��ӵ��ư���
					Date now = new Date();
					System.out.println(now+ " �ȳ��ϼ���?");
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
						
					}
				}	 
			}
}

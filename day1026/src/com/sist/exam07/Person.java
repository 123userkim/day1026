package com.sist.exam07;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		for(int i=1; i<=10;i++) {
			System.out.println("¾È³ç, "+name+"----->"+i);
			try {
				Thread.sleep(100); //Àá±ñ ¸ØÃã: ±Ùµ¥ ¾ê´Â ÀÓÀÇ·Î ¿¹¿Ü ¼³Á¤ ÇÊ¼ö
			}catch(Exception e) {
				
			}
		}
	}

}

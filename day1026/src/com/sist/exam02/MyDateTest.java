package com.sist.exam02;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data = "2022/03/11";
			MyDate lastDate= new MyDate(data);
			int year = lastDate.getYear();
			int month = lastDate.getMonth();
			int date = lastDate.getDate();
			System.out.printf("수료일은 %d년, %d월, %d일 입니다.\n",year,month,date);
			
		}catch(IlleagalArgumentException e) {
			//System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}
	}

}

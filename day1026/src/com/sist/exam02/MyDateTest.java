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
			System.out.printf("�������� %d��, %d��, %d�� �Դϴ�.\n",year,month,date);
			
		}catch(IlleagalArgumentException e) {
			//System.out.println("���ܹ߻�:"+e.getMessage());
			e.printStackTrace();
		}
	}

}

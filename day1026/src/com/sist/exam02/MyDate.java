package com.sist.exam02;

import java.util.StringTokenizer;

public class MyDate {
	private int year;
	private int month;
	private int date;
	public MyDate(String data) throws IlleagalArgumentException {
		
		if(data ==null) {
			throw new IlleagalArgumentException("날짜 데이터가 전달되지 않음");
		}
		StringTokenizer stringTokenizer = new StringTokenizer(data,"/");
		year = Integer.parseInt(stringTokenizer.nextToken());
		month = Integer.parseInt(stringTokenizer.nextToken());
		date = Integer.parseInt(stringTokenizer.nextToken());
		
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}

}

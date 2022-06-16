package com.webmarket.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		//현재 달력
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1 );
		System.out.println(calendar.get(Calendar.DATE));
		
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println(date);
		
		calendar.set(2023, 9, 18); // 10월 18일
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 1 ~ 7 일 ~ 토

		

	}

}

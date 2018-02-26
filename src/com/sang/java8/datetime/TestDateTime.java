package com.sang.java8.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestDateTime {
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println(localDate.plusDays(1));
		System.out.println(localDate.plusMonths(1));
		System.out.println(localDate.plusYears(1));
		System.out.println(localDate.minusDays(1));
		
		localDate = LocalDate.of(1988, 12, 17);
		System.out.println(localDate);
		System.out.println("------------------------");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println(localDateTime.plusMinutes(60));
		localDateTime = LocalDateTime.of(1988, 12, 17, 2, 01, 01, 00);
		System.out.println(localDateTime);
		System.out.println("------------------------");
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		System.out.println("------------------------");
		
		//Parsing
		String anotherDate = "04 Apr 2016";
		 
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate random = LocalDate.parse(anotherDate, df);
		 
		System.out.println(anotherDate + " parses as " + random);
		
		String mydate = "17/12/1988 12:12";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println(LocalDateTime.parse(mydate, dateTimeFormatter));
		
		
		//Duration
		LocalDateTime localDateTime2 = LocalDateTime.now();
		LocalDateTime localDateTime3 = LocalDateTime.of(2001, 02, 17, 12, 00);
		
		Duration duration = Duration.between(localDateTime2, localDateTime3);
		System.out.println(duration);
		
		//Period
		LocalDate localDate2 = LocalDate.now();
		LocalDate localDate3 = LocalDate.of(2001, 02, 17);
		Period period = Period.between(localDate2, localDate3);
		System.out.println(period);
		
		
	}
}

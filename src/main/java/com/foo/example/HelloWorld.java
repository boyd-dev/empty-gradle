package com.foo.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

	public static void main(String ...args) {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSSSSS");
		System.out.println("Hello, World! " + dtf.format(now));
	}
	
	
	public String hello() {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSSSSS");
		return "Hello, World! " + dtf.format(now);
		
	}	

}

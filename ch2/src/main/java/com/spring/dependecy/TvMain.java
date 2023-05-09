package com.spring.dependecy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {
	String str="String";
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config2.xml");
			
		TV tv =(TV) ctx.getBean("tv");
			tv.powerOn();
			tv.volumeUp();
			tv.volumeDown();
			tv.powerOff();
	}
}


package com.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {
	String str="String";
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//					TV tv =(TV) ctx.getBean("samsungTV");  @Component 로 생성시 id 는 클래스명 사용(앞자리는 소문자)
//					@Component("id") 형식으로 지정도 가능
			TV tv =(TV) ctx.getBean("tv");
			tv.powerOn();
			tv.volumeUp();
			tv.volumeDown();
			tv.powerOff();
	}
}


package com.spring.dependecy;

public class TvMain {
	String str="String";
	public static void main(String[] args) {
		// 생성자를 사용한 멤버변수 초기화
//		TV tv = new SamsungTV(new SonySpeaker()) ;
		
		//setter 를 사용한 멤버 변수 초기화
		SamsungTV tv = new SamsungTV();
		tv.setSpeaker(new SonySpeaker());
		
			tv.powerOn();
			tv.volumeUp();
			tv.volumeDown();
			tv.powerOff();
			

	}
}


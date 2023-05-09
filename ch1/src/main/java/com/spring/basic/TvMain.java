package com.spring.basic;

public class TvMain {

	public static void main(String[] args) {
//			LgTV lgTV = new LgTV() ;
//			lgTV.turnOn();
//			lgTV.soundDown();
//			lgTV.soundUp();
//			lgTV.turnOff();
			
			TV samsungTV = new SamsungTV();
			samsungTV.powerOn();
			samsungTV.volumeDown();
			samsungTV.volumeUp();
			samsungTV.powerOff();
	}

}

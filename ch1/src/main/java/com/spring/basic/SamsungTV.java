package com.spring.basic;

public class SamsungTV implements TV {
	@Override
	public void powerOn() {
		System.out.println("SamsungTV - Àü¿ø On");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV - Àü¿ø Off");
	}
	@Override
	public void volumeUp() {
		System.out.println("SamsungTV - º¼·ý Up");
	}
	@Override
	public void volumeDown() {
		System.out.println("SamsungTV - º¼·ý Down");
	}
}

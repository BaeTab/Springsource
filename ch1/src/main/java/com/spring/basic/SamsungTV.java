package com.spring.basic;

public class SamsungTV implements TV {
	@Override
	public void powerOn() {
		System.out.println("SamsungTV - ���� On");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV - ���� Off");
	}
	@Override
	public void volumeUp() {
		System.out.println("SamsungTV - ���� Up");
	}
	@Override
	public void volumeDown() {
		System.out.println("SamsungTV - ���� Down");
	}
}

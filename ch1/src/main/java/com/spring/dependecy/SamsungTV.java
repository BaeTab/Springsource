package com.spring.dependecy;

public class SamsungTV implements TV {
	private  SonySpeaker speaker; // has-a(포함) 관계
	
	//매개변수를 받지 않는 상성자 : default 생성자
	public SamsungTV() {
		
	}
		

	public SamsungTV(SonySpeaker speaker) {
		super();
		this.speaker = speaker; 	//멤버변수 초기화
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV - 전원 On");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV - 전원 Off");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
		
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	
	}
}

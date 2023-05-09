package com.spring.dependecy;

public class SamsungTV implements TV {
	private  SonySpeaker speaker; // has-a(����) ����
	
	//�Ű������� ���� �ʴ� ���� : default ������
	public SamsungTV() {
		
	}
		

	public SamsungTV(SonySpeaker speaker) {
		super();
		this.speaker = speaker; 	//������� �ʱ�ȭ
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

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
		speaker.volumeUp();
		
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	
	}
}

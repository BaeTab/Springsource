package com.spring.dependecy;

public class TvMain {
	String str="String";
	public static void main(String[] args) {
		// �����ڸ� ����� ������� �ʱ�ȭ
//		TV tv = new SamsungTV(new SonySpeaker()) ;
		
		//setter �� ����� ��� ���� �ʱ�ȭ
		SamsungTV tv = new SamsungTV();
		tv.setSpeaker(new SonySpeaker());
		
			tv.powerOn();
			tv.volumeUp();
			tv.volumeDown();
			tv.powerOff();
			

	}
}


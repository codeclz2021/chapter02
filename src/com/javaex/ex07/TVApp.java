package com.javaex.ex07;

public class TVApp {

	// 필드

	// 생성자

	// 메소드 g/s

	// 메소드 일반
	public static void main(String[] args) {
		// 초기값 학인
		System.out.println("*초기값확인--------------------------------------------------");
		TV tv = new TV(7, 20, true); // 전원이 켜졌을때
		// TV tv = new TV(7, 20, false); //전원이 꺼졌을때

		tv.status();

		System.out.println("");
		System.out.println("*채널 번호입력--------------------------------------------------");
		// 채널확인-번호입력
		tv.channel(222); // 채널 7-->222
		tv.status();

		// 채널확인-번호입력
		tv.channel(12); // 채널 222-->12
		tv.status();

		// 채널확인-번호입력 최대값
		tv.channel(256); // 채널 12-->256-->255
		tv.status();

		// 채널확인-번호입력 최소값
		tv.channel(0); // 채널 255-->0-->1
		tv.status();

		System.out.println("");
		System.out.println("*채널 up down--------------------------------------------------");

		tv.channel(133);
		tv.status();

		// 채널확인-up
		tv.channel(true); // 채널 133-->134
		tv.status();

		// 채널확인-down
		tv.channel(false); // 채널 134-->133
		tv.status();

		// 채널확인-up 최대값
		tv.channel(255); // 채널 134-->255
		tv.status();
		tv.channel(true); // 채널 255-->256-->255
		tv.status();

		// 채널확인-down 최소값
		tv.channel(1); // 채널 255-->1
		tv.status();
		tv.channel(false); // 채널 1-->0-->1
		tv.status();

		System.out.println("");
		System.out.println("*볼륨 번호입력--------------------------------------------------");

		// 볼륨확인-번호입력
		tv.volume(99); // 볼륨 20-->99
		tv.status();

		// 볼륨확인-번호입력
		tv.volume(2); // 볼륨 99-->2
		tv.status();

		// 볼륨확인-번호입력 최대값
		tv.volume(102); // 볼륨 2-->102-->100
		tv.status();

		// 볼륨확인-번호입력 최소값
		tv.volume(-12); // 볼륨 100-->-12-->0
		tv.status();

		System.out.println("");
		System.out.println("*볼륨 up down--------------------------------------------------");

		tv.volume(50); // 볼륨 0-->50
		tv.status();

		// 볼륨확인-up
		tv.volume(true); // 볼륨 50-->51
		tv.status();

		// 볼륨확인-down
		tv.volume(false); // 볼륨 51-->50
		tv.status();

		// 볼륨확인-up 최대값
		tv.volume(100); // 채널 51-->100
		tv.status();
		tv.volume(true); // 채널 100-->101-->100
		tv.status();

		// 볼륨확인-down 최소값
		tv.volume(0); // 채널 100-->0
		tv.status();
		tv.volume(false); // 채널 0-->-1-->0
		tv.status();

	}

}

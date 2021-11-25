package com.javaex.ex04;

public class GoodsApp {
	//필드
	
	//생성자
	
	//메소드 -g/s
	
	//메소드 -일반
	public static void main(String[] args) {
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.toString());
		
		
	}

}

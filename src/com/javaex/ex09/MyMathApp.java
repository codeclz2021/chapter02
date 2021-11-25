package com.javaex.ex09;

public class MyMathApp {

	//필드
	
	//생성자 - 디폴트

	//메소드 g/s
		
	//메소드 일반
	public static void main(String[] args) {
        int sum01 = MyMath.plus(3, 6);
		System.out.println(sum01);
		
		double sum02 = MyMath.plus(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03 = MyMath.plus(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = MyMath.plus(20, 99.9);
		System.out.println(sum04);
		
		double sum05 = MyMath.circleArea(5);
		System.out.println(sum05);
		
		double sum06 = MyMath.circleRound(5);
		System.out.println(sum06);
		
		/* 	
		MyMath myMath = new MyMath();
		
		int sum01 =  myMath.plus(3, 6);
		System.out.println(sum01);
		
		double sum02 = myMath.plus(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03 = myMath.plus(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = myMath.plus(20, 99.9);
		System.out.println(sum04);
		
		System.out.println("=====");
		*/
	}
}

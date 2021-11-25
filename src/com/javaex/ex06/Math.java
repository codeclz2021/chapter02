package com.javaex.ex06;

public class Math {
	
	//필드(생략)
	
	//생성자(디폴드 생성자 사용)
	/*
	public Math() {
	}
	*/
	
	//메소드 - g/s(생략)
	
	//메소드 - 일반
	/*
	public int plusInt(int num01, int num02) {
		int sum = num01+num02;
		return sum;
	}
	
	public double plusDouble(double num01, double num02) {
		double sum = num01+num02;
		return sum;
	}
	*/

	
	public int plus(int num01, int num02) {
		int sum = num01+num02;
		return sum;
	}
	
	public double plus(double num01, double num02) {
		double sum = num01+num02;
		return sum;
	}
	
	
	public double plus(int num01, double num02) {
		double sum = num01 + num02;
		return sum;
	}
	
	public double plus(double num01, int num02) {
		double sum = num01 + num02;
		return sum;
	}
	
	
}

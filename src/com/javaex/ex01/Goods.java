package com.javaex.ex01;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//메소드
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품명: " + name );
		System.out.println("가격: " + price );
		System.out.println("----------------------" );
	}
	

}

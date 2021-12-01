package com.javaex.ex17;

public class Rectangle extends Shape {

	// 필드
	// private String lineColor;
	// private String fillColor;

	private int width;
	private int height;

	// 생성자
	public Rectangle() {
		super(); // Shape 기본생성자 Shape();
	}

	/* 부모를 고려해서 생성자를 만든다 */
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반
	// 부모쪽에도 같은 메소드가 있다
	// 부모쪽의 메소드 사용 못하게 할려고 같은 이름으로 "재정의"
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}

	public void draw() { //draw() 메소드를 작성하지 않으면 부모의 draw()사용됨
		System.out.println("선색:" + super.lineColor + " 면색:" + super.fillColor + " 가로:" + this.width + " 세로:"
				+ this.height + " 사각형을 그렸습니다.");
	}
	
	public double area() { //Shape 추상클래스(미완성 클래스)를 상속받았음
		                   //Shape 를 상속 받을며년 미완성인부분을 구현해줘야함 --> area() 작성해야함
		double result = width * height;
		return result;
	}

}

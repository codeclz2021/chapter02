package com.javaex.ex15;

public class Circle extends Shape {

	// 필드
	// private String lineColor;
	// private String fillColor;

	private int radius;

	// 생성자
	public Circle() {
		super(); // Shape 기본생성자 Shape();
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}

	// 메소드 g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 일반
	// 부모쪽에도 같은 메소드가 있다
	// 부모쪽의 메소드 사용 못하게 할려고 같은 이름으로 "재정의"
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}

	public void draw() {
		System.out.println("선색:" + super.lineColor + " 면색:" + super.fillColor + " 반지름:" + this.radius + " 원을 그렸습니다.");
	}

}

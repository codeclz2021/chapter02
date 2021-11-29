package com.javaex.ex14;

public class Triangle extends Shape {

	// 필드
	// private String lineColor;
	// private String fillColor;

	private int width;
	private int height;

	// 생성자
	public Triangle() {
		super(); // Shape 기본생성자 Shape();
	}

	/* 부모를 고려해서 생성자를 만든다 */
	public Triangle(String lineColor, String fillColor, int width, int height) {
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

	public void draw() {
		System.out.println("선색:" + super.lineColor + " 면색:" + super.fillColor + " 가로:" + this.width + " 세로:"
				+ this.height + " 삼각형을 그렸습니다.");
	}

}

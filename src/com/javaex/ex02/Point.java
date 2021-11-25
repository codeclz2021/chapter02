package com.javaex.ex02;

public class Point {
	
	//필드
	private int x;
	private int y;

	//생성자
	public Point() {
		//해당클래스를 메모리에 올리는 일
		System.out.println("Point()");
	}

	public Point(int x) {
		//해당클래스를 메모리에 올리는 일
		this.x = x;
		System.out.println("Point(1)");
	}
	
	/*
	public Point(int y) {
		//해당클래스를 메모리에 올리는 일
		this.y = y;
	}
	*/
	
	public Point(int x, int y) {
		//해당클래스를 메모리에 올리는 일
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}

	
	//메소드
	public void setX(int x){
		if(x>=0) {
			this.x = x;
		}else {
			this.x = 0;
		}
	}
	
	public int getX(){
		if(x<0) {
			return 0;
		}else {
			return x;
		}
		
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x=" + this.getX() + ", y=" + this.getY() +"]을 그렸습니다.");
	}

	//action=true 그리는기능 ,   action=false 지우는 기능
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점[x=" + x + ", y=" + y +"]을 그렸습니다.");
		}else if(action == false) {
			System.out.println("점[x=" + x + ", y=" + y +"]을 지웠습니다.");
		}else {
			System.out.println("잘못된 입력");
		}	
		
	}
	
	

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	
}

package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		//도형(Shape, 모든도형)을 관리하는 배열을 만든다
		Shape[] sArray = new Shape[3];
		
		Shape r01 = new Rectangle("빨강", "빨강", 5, 5);
		//r01.draw();
		
		Shape c01 = new Circle("노랑", "노랑", 100);
		//c01.draw();
		
		Shape t01 = new Triangle("파랑", "파랑", 20, 20);
		//t01.draw();
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		System.out.println(((Circle)c01).getRadius());
		
		
	}

}

package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {

		// 메모리가 움직이는 스토리

		// 사각형 3개를 만든다(메모리 올린다)
		Rectangle r01 = new Rectangle("빨강", "노랑", 5, 5);
		Rectangle r02 = new Rectangle("파랑", "노랑", 10, 20);
		Rectangle r03 = new Rectangle("빨강", "빨강", 55, 77);

		// 사각형 관리를 위해서 배열을 만든다
		Rectangle[] rArray = new Rectangle[3];

		// 사각형을 배열에 넣는다 (주소)
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		// rArray[0].draw();

		// 모두 draw 하기
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

		/*
		 * //모든 사각형에 선색만 출력 for(int i=0; i<rArray.length; i++) {
		 * System.out.println(rArray[i].getLineColor()); }
		 */

		//////////////////////////////////////////////////////////

		// 원을 관리할 배열
		Circle[] cArray = new Circle[3];

		// 원 3개(를 만들었음
		Circle c01 = new Circle("보라", "빨강", 15);
		Circle c02 = new Circle("검정", "노랑", 5);
		Circle c03 = new Circle("파랑", "초록", 7);

		// 원을 배열에 넣기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		// 모든 원 그리기
		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}

		///////////////////////////////////////////////////////////

		// 삼각형을 관리할 배열
		Triangle[] tArray = new Triangle[3];

		// 삼각형 3개를 만들었음
		Triangle t01 = new Triangle("빨강", "빨강", 5, 5);
		Triangle t02 = new Triangle("파랑", "파랑", 8, 8);
		Triangle t03 = new Triangle("노랑", "노랑", 13, 13);

		// 삼각형을 배열에 넣기
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;

		// 모든 삼각형 그리기
		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();
		}

	}

}

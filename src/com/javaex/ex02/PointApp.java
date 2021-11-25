package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point(3,6);   // Point(2)
		//p01.setX(3);
		//p01.setY(6);
		p01.draw();
		
		Point p02 = new Point();  // Point()
		p02.setX(7);
		p02.setY(7);
		p02.draw();
		
		
		Point p03 = new Point(55, 65);
		p03.draw(true);
		p03.draw(false);
		p03.draw();
		
		
		p01.draw(false);
		
				

	}

}

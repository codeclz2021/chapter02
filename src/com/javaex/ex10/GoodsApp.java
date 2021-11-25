package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {

		
		/*
		int[] intArray = new int[3];
		intArray[0] = 34;
		intArray[1] = 99;
		*/
		
		Goods[] goodsArray= new Goods[3];

		Goods camera = new Goods("니콘", 400000);		
		goodsArray[0] = camera;
		
		
		Goods cup = new Goods("머그컵", 2000);
		goodsArray[1] = cup;
		
		
		Goods computer = new Goods("LG그램", 900000);
		goodsArray[2] = computer;
		
		
		/*
		System.out.println(camera.toString());
		System.out.println(goodsArray[0].toString());
		*/
		/*
		System.out.println(camera.toString());
		System.out.println(cup.toString());
		System.out.println(computer.toString());
		*/
		
		/*
		System.out.println(goodsArray[0].toString());
		System.out.println(goodsArray[1].toString());
		System.out.println(goodsArray[2].toString());
		*/
		
		int count = 0;
		for(int i=0; i<goodsArray.length; i++) {
			
			if(goodsArray[i] != null) { //주소가 없지 않다 -->주소가 있다
				System.out.println(goodsArray[i].toString());
				count++;
			}
		}
		
		System.out.println(count);
		
		//이름만 출력하기
		for(int i=0; i<goodsArray.length; i++) {
			goodsArray[i].showInfo();
		}
		
		
		
		
	}

}

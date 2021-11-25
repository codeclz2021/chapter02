package com.javaex.ex08;

public class Goods {

	// 필드
	private String name;
	private int price;
	private static int totalCount;

	
	// 생성자	
	public Goods() {
		//메모리에 올리는일 
		this.totalCount++;
	}

	public Goods(String name, int price) {
		//메모리에 올리는일
		this.name = name;
		this.price = price;
		this.totalCount++;
	}

	
	// 메소드 - g/s
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public int getTotalCount() {
		return totalCount;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}


	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
		System.out.println("");
	}

	

	

}

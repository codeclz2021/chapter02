package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {

		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
		
		Student s01 = new Student("이정재", 46, "강남고등학교");
		s01.showInfo();
		
		
		
		
		Person ps01 = new Student("강호동", 50, "");
		ps01.showInfo();
		
		
		System.out.println(ps01.toString());
	}

}

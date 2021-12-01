package com.javaex.exam;

public class PersonApp {

	public static void main(String[] args) {
		//Person
		Person p01 = new Person();
		p01.setName("정우성");
		p01.setAge(25);

		System.out.println(p01.toString());
		
		Person p02 = new Person("이정재", 40);
		System.out.println(p02.toString());
		
		Person p03 = new Person("강호동", 45);
		System.out.println(p03.toString());
		
		p03.setName("김호동");
		System.out.println(p03.toString());
		
		
		//Student
		Student s01 = new Student("이효리", 30, "제주고등학교");
		System.out.println(s01.toString());
	}

}

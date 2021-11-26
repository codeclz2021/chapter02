package com.javaex.ex11;

public class PersonApp {
	
	//필드
	//생성자
	//메소드   -  getter/setter
	//메소드   -  일반 
	public static void main(String[] args) {
		
		//person테스트
		/*
		Person p01 = new Person("정우성", 45);
		
		Person p02 = new Person("이정재", 57);
		//System.out.println(p01.toString());
		//System.out.println(p02.toString());
		
		p01.showInfo();
		p02.showInfo();
		*/
		
		
		Person p01 = new Person("정우성", 45);
		p01.showInfo();
		
		//Student Person상속 받고 테스트
		Student s01 = new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("아형고등학교");
	    
		System.out.println(s01.getName());
		System.out.println(s01.getAge());
		System.out.println(s01.getSchoolName());
		
		
		Student s02 = new Student("서장훈", 50, "강남고등학교");
		System.out.println(s02.getName());
		s02.showInfo();
		
		
		System.out.println(s02.toString());
		
		
	}

}

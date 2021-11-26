package com.javaex.ex11;

public class Student extends Person{

	// 필드
	private String schoolName;

	// 생성자
	public Student() {
		//super();
		System.out.println("Student()");
	}

	public Student(String schoolName) {
		//super();
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String schoolName) {
		/*
		super.name = name;
		super.age = age;
		*/
		//부모생성자 실행
		//super(name, age);
		
		super();
		super.name = name;
		super.age = age;
		
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	
	// 메소드 - getter/setter
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	// 메소드 - 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	
	public void showInfo2() {
		
		System.out.println("****************************");
		System.out.println("이름: "+ super.name);
		System.out.println("나이: "+ super.age);
		System.out.println("학교: "+ this.schoolName);
		System.out.println("****************************");
		System.out.println("");
		
	}
	
	
	
	
	
}

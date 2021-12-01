package com.javaex.exam;

public class Student {
	
	//필드
	private String name;
	private int age;
	private String schoolName;
	
	//생성자
	public Student() {
	}

	public Student(String name, int age, String schoolName) {
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
	}

	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", schoolName=" + schoolName + "]";
	}
	
}

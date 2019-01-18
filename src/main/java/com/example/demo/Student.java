package com.example.demo;

public class Student {

	int stuId;
	int stuAge;
	String stuName;

	public Student(int stuId, int stuAge, String stuName) {
		super();
		this.stuId = stuId;
		this.stuAge = stuAge;
		this.stuName = stuName;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

}

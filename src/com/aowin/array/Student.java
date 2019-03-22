package com.aowin.array;

public class Student {
	private String no;
	private String name;
	private String sex;
	private int age;
	private int java;
	public Student(String no,String name,String sex,int age,int java){
		this.no=no;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.java=java;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", sex=" + sex + ", age=" + age + ", java=" + java + "]";
	}
	
	

}

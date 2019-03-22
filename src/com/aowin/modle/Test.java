package com.aowin.modle;

import com.aowin.hello.Person;

public class Test {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name="李四";
		stu.sex="男";
		//stu.age=10;//private修饰，无法在其他类中访问；
		
		
		
		
		Person per =new Person();
		per.name="张山";
		//per.age=10;//默认修饰，无法在其他包中访问；
		
	}
}

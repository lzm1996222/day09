package com.aowin.hello;
/*
 * 4种访问修饰符(修饰成员属性和成员方法)：public > protected > 默认 > private
 * public - 权限最大的修饰符，只在同一个工程中直接通过对象调用
 * 默认权限 - 同包权限，只在同一个包中可以通过对象调用，不能跨包访问
 * private - 私有权限，只在同一个类中访问
 * protected - 受保护的权限，在同一个包中可以通过对象调用，不同包的只在其子类中访问
 */
public class Person {
	public String name;
	int age;
	private String sex;
	protected int a;
	
}

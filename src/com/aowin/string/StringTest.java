package com.aowin.string;

public class StringTest {
	public static void main(String[] args) {
		String s1="hello";//地址在常量池中
		String s2=new String("hello");// 地址指向堆中开辟的空间
		String s3=new String("hello");
		String s4="hello";//与s1的值相同，和s1的地址相同
		//经过字符串拼接后，地址指向堆中，二不是原来的常量池中
		String s5="hel";
		String s6=s5+"lo";
		char[] i={'h','e','l','l','o'};
		//equals方法比较值
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s1));
		System.out.println(s4.equals(s6));
		System.out.println(s4.equals(i));
		//==比较地址
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s4==s1);
		System.out.println(s4==s6);
		
		
	/*	//字符串与其他类型进行转换
		int a=10;
		String s5=String.valueOf(a);
		System.out.println(s5);
		
		//检索字符串
		char b=s1.charAt(2);//获取s1字符串中的索引为2的字符
		System.out.println(b);
		int c=s1.indexOf('l');//获取s1字符串中的第一个l的索引
		System.out.println(c);*/
	}
	


}

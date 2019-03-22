package com.aowin.teststr;

public class TestString {
	public static void main(String[] args) {
		String a="helloword";
		String b="abcdefg";
		
		char s=a.charAt(2);//返回 char指定索引处的值。
		//System.out.println(s);
		int s1=a.codePointAt(2);//返回指定索引处的字符（Unicode代码点）。 
		//System.out.println(s1);
		int s2=a.compareTo(b);
		System.out.println(s2);//按字典顺序比较两个字符串。
		String s3=a.concat(b);
		//System.out.println(s3);//将指定的字符串连接到该字符串的末尾。
		boolean s4=a.contains("ell");//当且仅当此字符串包含指定的char值序列时才返回true。
		//System.out.println(s4);
		
	}
}

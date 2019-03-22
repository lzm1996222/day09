package com.aowin.homework.h2;
/*
 * 1. 创建一个类Count
在该类中定义方法 public int counter(String str,String word)，
判断str中word出现的次数（比如：String str="agrhello o340jt45hello rg09hellojawe" String word="hello",返回次数为3）
创建测试类TestCount，测试前面方法的正确性
 * */

public class Count {
	public int counter(String str,String word){
		int n=0;
		String[] s=str.split(word);
		n=s.length-1;
		if(str.startsWith(word)){
			n=n+1;
		}else if(str.endsWith(word)){
			n=n+1;
		}
		return n;
		
	}
	

}

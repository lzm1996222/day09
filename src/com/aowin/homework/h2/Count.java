package com.aowin.homework.h2;
/*
 * 1. ����һ����Count
�ڸ����ж��巽�� public int counter(String str,String word)��
�ж�str��word���ֵĴ��������磺String str="agrhello o340jt45hello rg09hellojawe" String word="hello",���ش���Ϊ3��
����������TestCount������ǰ�淽������ȷ��
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

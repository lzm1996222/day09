package com.aowin.teststr;

public class TestString {
	public static void main(String[] args) {
		String a="helloword";
		String b="abcdefg";
		
		char s=a.charAt(2);//���� charָ����������ֵ��
		//System.out.println(s);
		int s1=a.codePointAt(2);//����ָ�����������ַ���Unicode����㣩�� 
		//System.out.println(s1);
		int s2=a.compareTo(b);
		System.out.println(s2);//���ֵ�˳��Ƚ������ַ�����
		String s3=a.concat(b);
		//System.out.println(s3);//��ָ�����ַ������ӵ����ַ�����ĩβ��
		boolean s4=a.contains("ell");//���ҽ������ַ�������ָ����charֵ����ʱ�ŷ���true��
		//System.out.println(s4);
		
	}
}

package com.aowin.string;

public class StringTest {
	public static void main(String[] args) {
		String s1="hello";//��ַ�ڳ�������
		String s2=new String("hello");// ��ַָ����п��ٵĿռ�
		String s3=new String("hello");
		String s4="hello";//��s1��ֵ��ͬ����s1�ĵ�ַ��ͬ
		//�����ַ���ƴ�Ӻ󣬵�ַָ����У�������ԭ���ĳ�������
		String s5="hel";
		String s6=s5+"lo";
		char[] i={'h','e','l','l','o'};
		//equals�����Ƚ�ֵ
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s1));
		System.out.println(s4.equals(s6));
		System.out.println(s4.equals(i));
		//==�Ƚϵ�ַ
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s4==s1);
		System.out.println(s4==s6);
		
		
	/*	//�ַ������������ͽ���ת��
		int a=10;
		String s5=String.valueOf(a);
		System.out.println(s5);
		
		//�����ַ���
		char b=s1.charAt(2);//��ȡs1�ַ����е�����Ϊ2���ַ�
		System.out.println(b);
		int c=s1.indexOf('l');//��ȡs1�ַ����еĵ�һ��l������
		System.out.println(c);*/
	}
	


}

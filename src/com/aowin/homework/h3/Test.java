package com.aowin.homework.h3;

public class Test {
	public static void main(String[] args) {
		Computer com=new Computer();
		com.setK(new Key("www"));
		com.setS(new Screen("eee"));
		com.setM(new Mouse("rrr"));
		com.setT(new Time("2018/1/2"));
		System.out.println("����Ʒ��Ϊ"+com.getK().getBrand()+"���Ʒ��Ϊ"+com.getM().getBrand()+"��ʾ��Ʒ��Ϊ"+com.getS().getBrand()+"����ʱ��Ϊ"+com.getT().getTime());
	}
}

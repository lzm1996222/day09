package com.aowin.homework.h3;

public class Test {
	public static void main(String[] args) {
		Computer com=new Computer();
		com.setK(new Key("www"));
		com.setS(new Screen("eee"));
		com.setM(new Mouse("rrr"));
		com.setT(new Time("2018/1/2"));
		System.out.println("键盘品牌为"+com.getK().getBrand()+"鼠标品牌为"+com.getM().getBrand()+"显示屏品牌为"+com.getS().getBrand()+"购买时间为"+com.getT().getTime());
	}
}

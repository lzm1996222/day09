package com.aowin.homework.h4;
/*
 * 4. 设计一个钱包Purse，有成员变量int money表示钱包中的余额
另有一个类，包含3个方法
exchange(int i ,int j )：交换int型 i，j的值。
exchange(Purse purse_01 , Purse purse_02)：交换两个对象Purse的值
exchange2(Purse purse_01 , Purse purse_02)：交换两个对象Purse中的属性money的值.

 * */
public class Exch {
	public void exchange(int i ,int j){
		int temp=0;
		temp=i;
		i=j;
		j=temp;
		System.out.println("i为"+i+"j为"+j);
	}
	public void exchange3(Purse purse_01 , Purse purse_02){
		Purse purse_03=null;
		purse_03=purse_01;
		purse_01=purse_02;
		purse_02=purse_03;
		System.out.println(purse_01);
		System.out.println(purse_02);
	}
	public void exchange2(Purse purse_01 , Purse purse_02){
		Purse purse_03=new Purse(0);
		purse_03.setMoney(purse_01.getMoney());
		purse_01.setMoney(purse_02.getMoney());
		purse_02.setMoney(purse_03.getMoney());
		System.out.println("钱包1的钱为："+purse_01.getMoney()+"钱包2的钱为："+purse_02.getMoney());
		
	}
}

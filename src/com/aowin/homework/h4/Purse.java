package com.aowin.homework.h4;
/*
 * 4. 设计一个钱包Purse，有成员变量int money表示钱包中的余额
另有一个类，包含3个方法
exchange(int i ,int j )：交换int型 i，j的值。
exchange(Purse purse_01 , Purse purse_02)：交换两个对象Purse的值
exchange2(Purse purse_01 , Purse purse_02)：交换两个对象Purse中的属性money的值.

 * */
public class Purse {
	private int money;
	

	

	public Purse(int money) {
		super();
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	

}

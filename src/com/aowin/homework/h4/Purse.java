package com.aowin.homework.h4;
/*
 * 4. ���һ��Ǯ��Purse���г�Ա����int money��ʾǮ���е����
����һ���࣬����3������
exchange(int i ,int j )������int�� i��j��ֵ��
exchange(Purse purse_01 , Purse purse_02)��������������Purse��ֵ
exchange2(Purse purse_01 , Purse purse_02)��������������Purse�е�����money��ֵ.

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

package com.aowin.homework.h4;
/*
 * 4. ���һ��Ǯ��Purse���г�Ա����int money��ʾǮ���е����
����һ���࣬����3������
exchange(int i ,int j )������int�� i��j��ֵ��
exchange(Purse purse_01 , Purse purse_02)��������������Purse��ֵ
exchange2(Purse purse_01 , Purse purse_02)��������������Purse�е�����money��ֵ.

 * */
public class Exch {
	public void exchange(int i ,int j){
		int temp=0;
		temp=i;
		i=j;
		j=temp;
		System.out.println("iΪ"+i+"jΪ"+j);
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
		System.out.println("Ǯ��1��ǮΪ��"+purse_01.getMoney()+"Ǯ��2��ǮΪ��"+purse_02.getMoney());
		
	}
}

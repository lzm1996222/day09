package com.aowin.homework.h4;

public class TestPurse {
	public static void main(String[] args) {
		Purse p1=new Purse(100);
		Purse p2=new Purse(90);
		System.out.println("purse01"+p1);
		System.out.println("purse02"+p2);
		int i=1;
		int j=2;
		Exch e=new Exch();
		e.exchange(i, j);
		e.exchange2(p1, p2);
		e.exchange3(p1, p2);
		System.out.println("purse01"+p1);
		System.out.println("purse02"+p2);
		
	}
}

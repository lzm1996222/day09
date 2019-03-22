package com.aowin.homework.h2;

public class TestCount {
	public static void main(String[] args) {
		Count a=new Count();
		int n=a.counter("ghabcdefghghghjjgh", "gh");
		System.out.println(n);
	}

}

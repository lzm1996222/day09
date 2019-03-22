package com.aowin.homework.h1;

public class ObjectArray {
	public static void main(String[] args) {
		Student[] stus=new Student[6];
		stus[0]=new Student("8181", "xiaownag", "nan", 20,90);
		stus[1]=new Student("8182", "zhongwnag", "nv", 22,46);
		stus[2]=new Student("8183", "dawnag", "nan", 23,77);
		stus[3]=new Student("8184", "zhongwnag", "nv", 21,89);
		stus[4]=new Student("8185", "wnagwnag", "nan", 28,66);
		stus[5]=new Student("8185", "wnagwnag", "nan", 28,76);
		int j=0;
		for(int i=0;i<stus.length;i++){
			System.out.println(stus[i].toString());
			j=j+stus[i].getJava();
		}
		int avg=0;
		avg=j/stus.length;
		System.out.println("平均成绩为：");
		System.out.println(avg);
	}

}

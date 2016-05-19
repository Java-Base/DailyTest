package com.momai.generics.csdn.qa;

public class GenDemo2 {
	public static void main(String[] args) {
		// 定义类Gen2的一个Integer版本
		Gen2 intOb = new Gen2(new Integer(88));
		intOb.showType();
		int i = (int) intOb.getOb();
		System.out.println("value= " + i);

		System.out.println("----------------------------");

		// 定义Gen2的一个String版本
		Gen2 strOb = new Gen2("Hello Gen!");
		strOb.showType();
		String s = (String) strOb.getOb();
		System.out.println("value= " + s);
	}
}

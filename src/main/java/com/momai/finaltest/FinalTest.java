package com.momai.finaltest;

/**
 * 浅析Java中的final关键字
 * @url 	浅析Java中的final关键字
 * 
 * @author 	Lian
 * @date	2016年5月11日
 * @since	1.0
 */
public class FinalTest {
	public static void main(String[] args) {
		String a = "hello2";
		final String b = "hello";
		String d = "hello";
		String c = b + 2;
		String e = d + 2;
		System.out.println((a == c));
		System.out.println((a == e));
//		boolean flag = true;
//		System.out.println(flag?"success":"failure");
	}
}

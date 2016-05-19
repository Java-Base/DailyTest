package com.momai.string;

/**
 * @author 	Administrator
 * @date	2015年11月24日 下午3:03:48
 * @desc	example from jdk api
 */
public class StringApi {
	public static void main(String[] args) {
		// Strings are constant, their values cannot be changed after they are
		// created

		String str1 = "abc";
		// str1 is equivalent to str2
		char[] data = { 'a', 'b', 'c' };
		String str2 = new String(data);

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}
}

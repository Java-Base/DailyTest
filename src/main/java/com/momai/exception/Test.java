package com.momai.exception;

/**
 * @author	Lian
 * @time	2016年3月4日 上午2:51:09
 * @desc	
 */
public class Test {
	/**
	 * 系统自动抛出异常
	 * 当程序语句出现一些逻辑错误.主义错误或类型转换错误是, 系统会自动抛出异常
	 */
	public static void testSystemAutoException() {
//		int a = 5, b = 0;
//		System.out.println(5/b);
		
		String s = "abc";
		System.out.println(Double.parseDouble(s));
	}
	
	/**
	 * throw是语句抛出一个异常。
	 * 一般会用于程序出现某种逻辑时程序员主动抛出某种特定类型的异常
	 */
	public static void testThrowException() {
		String s = "abc";
		if(s.equals("abc")) {
			throw new NumberFormatException();
		} else {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
//		testSystemAutoException();
		testThrowException();
	}
}

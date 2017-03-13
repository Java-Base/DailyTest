package com.momai.operator;

/**
 * 移位运算符
 *
 * @author Lian
 * @date 2017/3/13
 * @since 1.0
 */
public class ShiftOperator {

	public static void main(String[] args) {

		leftShiftOperatorTest();

	}

	/**
	 * 左移运算符测试
	 *
	 * 左移运算符用“<<”表示，是将运算符左边的对象，向左移动运算符右边指定的位数，并且在低位补零。
	 * 其实，向左移n 位，就相当于乘上2 的n 次方
	 */
	public static void leftShiftOperatorTest() {

		Integer int1 = 10;


		long num = 10L;

		num = num << 8;

		System.out.println("num: " + num);
	}

	/**
	 * 右移运算符测试
	 */
	public static void rightShiftOperatorTest() {

	}
}

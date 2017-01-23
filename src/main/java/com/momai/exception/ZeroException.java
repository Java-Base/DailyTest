package com.momai.exception;

/**
 * 除数为0时异常
 *
 * @author 	Lian
 * @date 	2017/1/23
 * @since 	1.0
 */
public class ZeroException {

	public static void main(String[] args) {

//		testException1();
//		testException2();
		testException3();
	}

	// 捕捉throw语句抛出的“除数为0”异常
	public static void testException1() {

		try {	// try监控区域

			int a = 6;
			int b = 0;

			if(b == 0) {
				// 通过throw语句抛出异常
				throw new ArithmeticException();
			}

			System.out.println("a/b 的值是：" + a/b);

		} catch (ArithmeticException e) {	// catch捕捉异常

			System.out.println("程序出现异常，变量b不能为0！");
		}

		System.out.println("程序正常结束！");
	}

	// 捕捉运行时系统自动抛出“除数为0”引发的ArithmeticException异常
	public static void testException2() {

		try {

			int a = 6;
			int b = 0;

			System.out.println("a/b 的值是：" + a/b);

		} catch (ArithmeticException e) {

			System.out.println("程序出现异常，变量b不能为0！");
		}

		System.out.println("程序正常结束！");
	}

	// 不捕捉、也不声明抛出运行时异常。
	public static void testException3() {

		int a = 6;
		int b = 0;

		System.out.println("a/b 的值是：" + a/b);
	}
}

package com.momai.exception;

/**
 * $
 *
 * @author Lian
 * @date 2017/1/23
 * @since 1.0
 */
public class ArrayIndexException {

	public static void main(String[] args) {

		testException();
	}

	// 程序可能存在除数为0异常和数组下标越界异常
	public static void testException() {
		int[] intArray = new int[3];
		try {
			for (int i = 0; i <= intArray.length; i++) {
				intArray[i] = i;
				System.out.println("intArray[" + i + "] = " + intArray[i]);
				System.out.println("intArray[" + i + "]模 " + (i - 2) + "的值:  " + intArray[i] % (i - 2));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("intArray数组下标越界异常。");
		} catch (ArithmeticException e) {
			System.out.println("除数为0异常。");
		}
		System.out.println("程序正常结束。");
	}
}

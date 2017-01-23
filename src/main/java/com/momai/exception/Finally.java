package com.momai.exception;

/**
 * $
 *
 * @author Lian
 * @date 2017/1/23
 * @since 1.0
 */
public class Finally {

	public static void main(String[] args) {

		testException();
	}

	public static void testException() {

		int i = 0;
		String greetings[] = {" Hello world !", " Hello World !! ", " HELLO WORLD !!!"};
		while (i < 4) {
			try {
				// 特别注意循环控制变量i的设计，避免造成无限循环
//				System.out.println(greetings[i++]);

				// 如下设计，会陷入死循环。原因是在打印时异常， i++没有执行。
				System.out.println(greetings[i]);
				i++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("数组下标越界异常");
			} finally {
				System.out.println("--------------------------");
			}
		}
	}
}

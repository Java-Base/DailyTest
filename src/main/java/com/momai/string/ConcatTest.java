package com.momai.string;

/**
 * @author 	Lian
 * @date	2016年1月5日 下午8:10:04
 * @desc	Java中字符串拼接的一些细节分析
 * 			Java程序运行起来, 需要经过两个阶段. 编译-->运行
 */
public class ConcatTest {

	/**
	 * 测试同一个String对象的不用引用别名是否相同
	 */
	public static void testReference() {
		String s1 = "www.imooc.com";
		String s2 = s1;
		System.out.println("s1 and s2 has the same reference : " + (s1 == s2));
	}
	
	/**
	 * 测试编译器优化
	 */
	public static void testCompileOptimization() {
		String name = "lian";
		int age = 24;
		String address = "shanghai pudong";
		String info = name + age + address;
		System.out.println(info);
	}
	
	public static void testLoop() {
		String result = "";
		for(int i=1; i<100; i++) {
			result += i;
		}
		System.out.println(result);
	}
	
	public static void testAnotherLoop() {
		StringBuilder buffer = new StringBuilder();
		for(int i=1; i<100; i++) {
			buffer.append(i);
		}
		System.out.println(buffer.toString());
	}

	public static void main(String[] args) {
//		testReference();
//		testCompileOptimization();
//		testLoop();
		testAnotherLoop();
	}
}

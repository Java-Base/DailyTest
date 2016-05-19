package com.momai.string;

/**
 * @author 	Administrator
 * @date	2015年11月24日 下午2:22:24
 * @desc	equals() vs ==
 */
public class EqualTest {
	public static void main(String[] args) {
		Compare();
	}

	/**
	 * import from the below URL:
	 * http://www.cnblogs.com/dolphin0520/p/3592500.html
	 * "关系操作符生成的是一个boolean结果，它们计算的是操作数的值之间的关系" -- Thinking in Java 简单来说, ==
	 * 操作符用来比较值是否相等
	 */
	public static void Compare() {
		// for 8 primitive type, constant save their value
		int m = 3;
		int n = 3;
		System.out.println(m == n);

		// for wrapped type, constant save their reference
		// String类对equals方法进行了重写，用来比较指向的字符串对象所存储的字符串是否相等。具体查看source code
		String str = new String("Hello");
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1 == str2);

		// 两变量指向同一对象
		str1 = str;
		str2 = str;
		System.out.println(str1 == str2);

		/**
		 * 总结来说： 1）对于==，如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；
		 * 如果作用于引用类型的变量，则比较的是所指向的对象的地址 2）对于equals方法，注意：equals方法不能作用于基本数据类型的变量
		 * 如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；
		 * 诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容。
		 */
	}
}

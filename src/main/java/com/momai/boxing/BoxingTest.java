package com.momai.boxing;

import org.junit.Test;

/**
 * Java学习之自动装箱和自动拆箱源码分析
 * 
 * @url		http://blog.csdn.net/u011726984/article/details/48031991
 * @author 	Lian
 * @date	2016年3月21日
 * @since	1.0
 */
public class BoxingTest {
	/**
	 * 首先了解下Java的四类八种基本数据类型
	 * 基本类型	占用空间(Byte)		表示范围					包装器类型
	 * boolean	1/8				true|false				Boolean
	 * char		2				-128~127				Character
	 * bye		1				-128~127				Byte
	 * short	2				-2^15~2^15-1			Short
	 * int		4				-2^31~2^31-1			Integer
	 * long		8				-2^63~2^63-1			Long
	 * float	4				-3.403E38~3.403E38		Float
	 * double	8				-1.798E308~-1.798E308	Double
	 */

	@Test
	/**
	 * Java中所谓的装箱通俗点就是: 八种基本数据类型在某些条件下使用时, 会自动变为对应的包装器类型
	 */
	public void boxingTest() {
		Integer i1 = 17;
		Integer i2 = 17;

		Integer i3 = 137;
		Integer i4 = 137;

		System.out.println(i1 == i2);	// true
		/**
		 * 解释下i3==i4输出true的原因:
		 * 当包装器类型调用'=='进行比较时, i3会调用Integer.valueOf()自动装箱基本数据类型为包装器类型
		 * Integer对象自动缓存int值范围在low~high(-128-127), 如果超出这个范围则会自动装箱为包装类
		 */
		System.out.println(i3 == i4);	// false
	}

	@Test
	/**
	 * Java中所谓的拆箱通俗点就是: 八种包装器类型在某些条件下使用时, 会自动变为对应的基本数据类型
	 */
	public void unboxingTest1() {
		Integer i1 = 17;
		int i2 = 17;

		int i3 = 137;
		Integer i4 = 137;

		System.out.println(i1 == i2);	// true
		/**
		 * 解释下i3==i4输出true的原因:
		 * 当执行到这一行时, i4会调用Integer.intValue方法自动拆箱包装器类型为基本数据类型
		 * 当包装器类型和基本数据类型调用'=='进行比较时, 会调用Integer.intValue方法自动拆箱包装器数据类型为基本数据类型
		 */
		System.out.println(i3 == i4);	// true
	}

	@Test
	public void unboxingTest2() {
		Integer i1 = 17;
		Integer i2 = 17;

		Integer i3 = 137;
		Integer i4 = 137;

		// 包装器类型与基本数据类型, 使用==相比较. Integer.valueOf()
		System.out.println(i1==i2);		// true
		System.out.println(i3==i4);		// false

		// 包装器类型与包装器类型, 使用equals比较. 自动拆箱为基本数据类型. Integer.intValue()
		System.out.println(i1.equals(i2));	// true
		/**
		 * 解释下这行输出true的原因:
		 * 因为在Integer包装类实现的equals方法中, 只要比较的对象是Integer实例, 那么就会自动拆箱为基本数据类型
		 */
		System.out.println(i3.equals(i4));	// true
	}

	/**
	 * 综合测试
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 321;
		Integer f = 321;

		Long g = 3L;
		Long h = 2L;

		// 会自动拆箱(调用intValue方法)
		System.out.println(c == d);
		// 会自动拆箱后再自动装箱
		System.out.println(e == f);
		// 虽然“==”比较的是引用的是否是同一对象，但这里有算术运算，如果该引用为包装器类型则会导致自动拆箱
		System.out.println(c == (a + b));
		// equals 比较的是引用的对象的内容（值）是否相等，但这里有算术运算，如果该引用为包装器类型则会导
		// 致自动拆箱，再自动装箱
		// a+b触发自动拆箱得到值后，再自动装箱与c比较
		System.out.println(c.equals(a + b));
		// 首先a+b触发自动拆箱后值为int型，所以比较的是值是否相等
		System.out.println(g == (a + b));
		// 首先a+b触发自动拆箱后值为int型，自动装箱后为Integer型，然后g为Long型
		System.out.println(g.equals(a + b));
		// 首先a+h触发自动拆箱后值为long型，因为int型的a会自动转型为long型的g然后自动装箱后为Long型，
		// 而g也为Long型
		System.out.println(g.equals(a + h));
	}

	/**
	 * 这里面需要注意的是:
	 * 当"=="运算符的两个操作数都是包装器类型的引用, 则是比较指向的是否是同一个对象, 
	 * 而如果其中有一个操作数是表达式(即包含算数运算)则比较的是数值(即会触发自动拆箱的过程)
	 * 另外, 对于包装器类型, equals方法并不会进行类型转换
	 */
}

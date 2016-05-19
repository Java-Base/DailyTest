package com.momai.boxing;

/**
 * 深入剖析Java中的装箱和拆箱
 * 装箱: 自动将基本数据类型转换为包装器类型, 装箱过程是通过调用包装器的valueOf方法实现的;
 * 拆箱: 自动将包装器类型转换为基本数据类型, 拆箱过程是通过调用包装器的***Value方法实现的(***代表对应的基本数据类型)
 * 
 * 知道反编译命令很重要啊, 对.class文件进行反编译. javap -verbose Test
 * 另外, 如果遇到不支持的字符. 记住使用 javac -encoding UTF-8
 * 
 * @url		http://www.cnblogs.com/dolphin0520/p/3780005.html
 * @author	Lian
 * @time	2016年3月22日
 * @since	1.0
 */
public class DepthAnalysisBoxing {
	public static void main(String[] args) {
		integrateTest();
	}

	/**
	 * Integer类测试, 输出: 
	 * true 
	 * false
	 * 表明i1和i2指向的是同一个对象, 而i3和i4指向的是不同的对象
	 */
	public static void integerTest() {
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = 200;
		Integer i4 = 200;

		System.out.println(i1==i2);
		System.out.println(i3==i4);
	}

	/**
	 * Double类测试, 输出: 
	 * false
	 * false
	 * 因为Double类的valueOf方法使用的是new Double()
	 * 为什么不想Integer类那样使用缓存呢: 是因为在某个范围内的整型数值的个数是有限的, 而浮点数却不是
	 */
	public static void doubleTest() {
		Double d1 = 100.0;
		Double d2 = 100.0;
		Double d3 = 300.0;
		Double d4 = 200.0;

		System.out.println(d1==d2);
		System.out.println(d3==d4);
	}

	/**
	 * Boolean类测试, 输出: 
	 * true
	 * true
	 * 因为Boolean类中定义了两个静态成员属性
	 */
	public static void booleanTest() {
		Boolean b1 = false;
		Boolean b2 = false;
		Boolean b3 = true;
		Boolean b4 = true;

		System.out.println(b1==b2);
		System.out.println(b3==b4);
	}

	/**
	 * 综合测试, 输出:
	 * true
	 * false
	 * true
	 * true
	 * true
	 * false
	 * true
	 * a. 当"=="运算符的两个操作数都是包装器类型的引用时, 则是比较指向的是否是同一个对象;
	 *    而如果其中有一个操作数是表达式(即包含算术运算), 则比较的是数值(即会触发自动拆箱的过程).
	 * b. 对于包装器类型, equals方法并不会进行类型转换
	 */
	public static void integrateTest() {
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 321;
		Integer f = 321;
		Long g = 3L;
		Long h = 2L;

		System.out.println(c==d);
		System.out.println(e==f);
		System.out.println(c==(a+b));
		System.out.println(c.equals(a+b));
		System.out.println(g==(a+b));
		System.out.println(g.equals(a+b));
		System.out.println(g.equals(a+h));
		
	}
}

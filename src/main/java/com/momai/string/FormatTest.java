package com.momai.string;

/**
 * @author 	Lian
 * @date	2016年1月6日 下午8:59:13
 * @desc	JAVA字符串格式化-String.format()的使用
 * 			String类的format()方法用于创建格式化的字符串以及连接多个字符串对象。
 * 			format(String format, Object... args) 新字符串使用本地语言环境，制定字符串格式和参数生成格式化的新字符串。
 * 			format(Locale locale, String format, Object... args) 使用指定的语言环境，制定字符串格式和参数生成格式化的字符串。
 */
public class FormatTest {

	/**
	 * 显示不同转换符实现不同数据类型到字符串的转换
	 * %s	字符串类型
	 * %c 	字符类型
	 * %b 	布尔类型
	 * %d	整数类型(十进制)
	 * %x	整数类型(十六进制)
	 * %o	整数类型(八进制)
	 * %f	浮点类型
	 * %a	十六进制浮点类型
	 * %e	指数类型
	 * %g	通用浮点类型(和e类型中较短的)
	 * %h	散列码
	 * %%	百分比类型
	 * %n	换行符
	 * %tx	日期与时间类型(x代表不同的日期与时间转换符
	 */
	private static void conversionSpecifierTest() {
		String str = null;
		str = String.format("Hi, %s", "廉");
		System.out.println(str);
		str = String.format("Hi, %s %s %s", "廉", "新", "忠");
		System.out.println(str);
		System.out.printf("字母a的大写是: %c %n", 'A');
		System.out.printf("3>7的结果是: %b %n", 3>7);
		System.out.printf("100的一半是: %d %n", 100/2);
		System.out.printf("100的十六进制数是: %x %n", 100);
		System.out.printf("100的八进制数是: %o %n", 100);
		System.out.printf("50元的书打8.5折扣是是: %f %n", 50*0.85);
		System.out.printf("上面价格的十六进制浮点数是: %a %n", 50*0.85);
		System.out.printf("上面价格的指数表示: %e %n", 50*0.85);
		System.out.printf("上面价格的指数和浮点数结果的长度较短的是: %g %n", 50*0.85);
		System.out.printf("字母A的散列码是: %h %n", 'A');
	}

	public static void main(String[] args) {
		conversionSpecifierTest();
	}
}

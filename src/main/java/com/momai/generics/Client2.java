package com.momai.generics;

import java.util.GregorianCalendar;

/**
 * @author 	Lian
 * @date	2015年7月10日 下午5:17:06
 * @desc	型 . super后面跟的类型表示泛型的上限
 */
public class Client2 {
	public static void main(String[] args) {
		Demo1<GregorianCalendar> p = null;
	}
}

class Demo1<T extends Comparable<? super T>> {}
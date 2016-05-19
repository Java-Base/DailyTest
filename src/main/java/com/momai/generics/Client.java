package com.momai.generics;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * @author 	Lian
 * @date	2015年7月10日 下午4:56:00
 * @desc	泛型 . extends后面跟的类型表示泛型的上限
 */
public class Client{
	public static void main(String[] args) {
		/**
		 * 这里是因为ArrayList是AbstractList的子类
		 * 所以编译通过
		 */
		Demo<ArrayList> p = null;		// 编译正确
		/**
		 * 编译通不过, 超出了限制上限
		 */
//		Demo<AbstractCollection> demo = null;
	}
}

class Demo<T extends AbstractList>{}

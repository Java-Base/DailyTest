package com.momai.generics.csdn.qa;

/**
 * 
 * @author Lian
 * @date 2015年10月12日 下午6:03:46
 * @desc http://bbs.csdn.net/topics/340216233 使用了泛型
 */
public class Gen<T> {
	// 定义泛型成员变量
	private T ob;

	public Gen(T ob) {
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public void showType() {
		System.out.println("T的实际类型是: " + ob.getClass().getName());
	}
}

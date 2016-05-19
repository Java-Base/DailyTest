package com.momai.generics.csdn.qa;

/**
 * @author Lian
 * http://bbs.csdn.net/topics/340216233
 * 没有使用泛型
 */
/**
 * 
 * @author Lian
 * @date 2015年10月12日 下午5:50:48
 * @desc http://bbs.csdn.net/topics/340216233 没有哦使用泛型
 */
public class Gen2 {
	// 定义一个通用类型成员
	private Object ob;

	public Gen2(Object ob) {
		this.ob = ob;
	}

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}

	public void showType() {
		System.out.println("T的实际类型是: " + ob.getClass().getName());
	}
}

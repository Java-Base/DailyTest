package com.momai.enumtest.use;

/**
 * @author 	Lian
 * @date	2016年3月5日 下午3:11:02
 * @desc	定义枚举类型
 */
public enum Light {
	// 利用构造函数传参
	GREEN(1), YELLOW(2), RED(3);

	// 定义私有变量
	private int code;

	// 定义构造函数. 枚举类型只能为私有
	private Light(int code) {
		this.code = code;
	}

	// 重写toString方法
	@Override
	public String toString() {
		return String.valueOf(this.code);
	}

}

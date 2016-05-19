package com.momai.date;

import java.sql.Date;

/**
 * @author 	Lian
 * @date	2015年6月29日 上午11:45:33
 * @desc	java.sql.Date只存储日期不存储时间数据
 */
public class SqlDate {
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);
	}
}

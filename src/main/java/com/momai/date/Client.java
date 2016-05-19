package com.momai.date;

import java.sql.Date;

/**
 * @author Lian
 * @date 2015年7月14日 下午5:04:17
 * @desc
 */
public class Client {
	public static void main(String[] args) {
		// Timestamp tt = new Timestamp(1436864155);
		long l1 = 1436864155;
		System.out.println(new Date(l1));
		long l2 = System.currentTimeMillis();

		Date date = new Date(l2 - l1);
		System.out.println(date);
		System.out.println(new Date(l2) + " " + new Date(l1));
	}
}

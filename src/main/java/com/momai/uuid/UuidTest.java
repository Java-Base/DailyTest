package com.momai.uuid;

import java.util.UUID;

/**
 * 
 * 
 * @author 	Lian
 * @date	2016年3月31日
 * @since	1.0	
 */
public class UuidTest {
	public static void main(String[] args) {
		String str = UUID.randomUUID().toString();
		str = str.replace("-", "").toUpperCase();
		System.out.println(str);
		System.out.println(str.length());
	}
}

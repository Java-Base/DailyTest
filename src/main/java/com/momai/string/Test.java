package com.momai.string;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author 	Lian
 * @date	2016年3月3日 下午2:53:58
 * @desc	
 */
public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "\"wishid\":28,\"nickname\":\"%E5%8F%96%E5%90%8D%E5%AD%97%E5%A5%BD%E9%9A%BE%E5%95%8A%F0%9F%98%94%EF%BC%8C%E7%9C%9F%E7%9A%84%E5%A5%BD%E9%9A%BE%E5%95%8A%F0%9F%98%AD\"";
		String str1 = "28&&&去个好命子真难啊难男女去个好命子真难啊难男女";
		System.out.println(str.length());
		System.out.println(str1);
		System.out.println(URLEncoder.encode(str1, "UTF-8").length());
	}
}

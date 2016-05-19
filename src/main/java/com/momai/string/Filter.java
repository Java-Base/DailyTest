package com.momai.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 	Lian
 * @date	2015年7月17日 上午11:12:55
 * @desc	测试过滤
 */
public class Filter {
	public static String stringFilter(String str) {
		// 只允许数字
		String regEx = "[^0-9]";
		Pattern p= Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}
	
	public static void main(String[] args) {
		System.out.println(stringFilter("adfefadf18701880168"));
		System.out.println(stringFilter("+18701880168"));
		System.out.println(stringFilter("+187-0188-0168"));
		System.out.println(stringFilter("187 0188 0168"));
	}
}

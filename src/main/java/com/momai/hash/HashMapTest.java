package com.momai.hash;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put("语文", 80.0);
		map.put("数学", 89.0);
		map.put("数学", 99.0);
		map.put("英语", 78.2);
		
		System.out.println(map.get("数学"));
	}
}

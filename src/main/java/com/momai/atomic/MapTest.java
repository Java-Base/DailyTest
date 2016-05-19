package com.momai.atomic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 	Lian
 * @date	2016年3月2日 下午3:08:31
 * @desc	
 */
public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("hello", "你好");
		map.put("world", "世界");
		System.out.println(map);
	}
}

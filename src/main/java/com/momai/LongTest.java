package com.momai;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Long类型数据
 * LongCache: -128-127
 * 
 * @author 	Lian
 * @date	2016年3月21日
 * @since	1.0
 */
public class LongTest {
	public static void main(String[] args) {
		long argu1 = 80574L;
		long argu2 = 80574L;

		// true
		System.out.println(argu1 == argu2);	

		Long para1 = new Long(80574);
		Long para2 = new Long(80574);
		// false
		System.out.println(para1 == para2);
		// true
		System.out.println(para1.longValue() == para2.longValue());
		// true
		System.out.println(para1.equals(para2));

		System.out.println("******************");
		Long[] arr = { 100L, 101L, 102L };
		Long[] arr2 = { 101L, 100L, 102L };
		Long param1 = arr[0];
		Long param2 = arr2[1];
		// true
		System.out.println(param1 == param2);

		Long long1 = new Long(127L);
		Long long2 = new Long(127L);
		System.out.println("::::" + (long1 == long2));

		System.out.println("***********************");
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("uid", 3709L);
		map.put("concernUid", 3709L);
		Long uid = map.get("uid");
		Long concernUid = map.get("concernUid");
		System.out.println(uid == concernUid || uid.longValue() == concernUid.longValue());
	}
}

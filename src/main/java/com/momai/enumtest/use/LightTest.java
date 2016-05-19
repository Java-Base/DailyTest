package com.momai.enumtest.use;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * @author 	Lian
 * @date	2016年3月5日 下午3:09:13
 * @desc	交通灯
 */
public class LightTest {

	public static void main(String[] args) {
		// 遍历枚举类型
		System.out.println("演示枚举类型的遍历 .... ");
		testTraversalEnum();

		// 演示EnumMap对象的使用
		System.out.println("演示EnumMap对象的使用 .... ");
		testEnumMap();

		// 演示EnmuSet的使用
		System.out.println("演示EnmuSet的使用 .... ");
		testEnumSet();
	}

	/**
	 * 演示枚举类型的遍历
	 */
	private static void testTraversalEnum() {
		Light[] allLight = Light.values();

		for(Light light : allLight) {
			System.out.println("*******************");
			System.out.println("当前灯name: " + light.name());
			System.out.println("当前灯ordinal: " + light.ordinal());
			System.out.println("当前灯: " + light);
		}
	}

	/**
	 * 演示EnumMap的使用，EnumMap跟HashMap的使用差不多，只不过key要是枚举类型
	 */
	private static void testEnumMap() {
		// EnumMap对象的构造函数需要参数传入,默认是key的类的类型
		EnumMap<Light, String> currEnumMap = new EnumMap<Light, String>(Light.class); 
		currEnumMap.put(Light.RED, "红灯");
		currEnumMap.put(Light.GREEN, "绿灯");
		currEnumMap.put(Light.YELLOW, "黄灯");

		// 遍历对象
		for(Light light : Light.values()) {
			System.out.println("[key=" + light.name() + ", value=" + currEnumMap.get(light) + "]");
		}
	}

	/**
	 * 演示EnumSet如何使用，EnumSet是一个抽象类，获取一个类型的枚举类型内容
	 */
	private static void testEnumSet() {

		EnumSet<Light> currEnumSet = EnumSet.allOf(Light.class);

		for (Light aLightSetElement : currEnumSet) {

			System.out.println("当前EnumSet中数据为：" + aLightSetElement);

		}

	}
}


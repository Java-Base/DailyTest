package com.momai.string;

/**
 * @author 	Lian
 * @date	2016年1月6日 下午4:02:45
 * @desc	
 */
public class FormatReplaceTest {
	private static String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	private static String url2 = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
	
	private static void replaceTest() {
		long oldTime = System.currentTimeMillis();
		for(int i=0; i<10000000; i++) {
			url.replace("APPID", "adfaefadfa").replace("APPSECRET", "efrgadfgaerf");
		}
		long newTime = System.currentTimeMillis();
		System.out.println("the time of replace: " + (newTime - oldTime) + "ms");
	}
	
	private static void formatTest() {
		long oldTime = System.currentTimeMillis();
		for(int i=0; i<10000000; i++) {
			String.format(url2, "adfaefadfa", "efrgadfgaerf" + "ms");
		}
		long newTime = System.currentTimeMillis();
		System.out.println("the time of format: " + (newTime - oldTime));
	}
	
	public static void main(String[] args) {
		replaceTest();
		formatTest();
	}
}

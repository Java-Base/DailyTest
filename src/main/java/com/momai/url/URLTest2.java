package com.momai.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * @author Lian
 * @date 2016年1月6日 下午3:16:36
 * @desc
 */
public class URLTest2 {
	public static String SendGET(String url, String param) {
		String result = "";// 访问返回结果
		BufferedReader read = null;// 读取访问结果

		try {
			// 创建url
//			URL realurl = new URL(url + "?" + param);
			URL realurl = new URL(url);
			// 打开连接
			URLConnection connection = realurl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/5.0 (iPad; CPU OS 9_3_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13E238 Safari/601.1");
			connection.setRequestProperty("Host", "qianka.com");
			connection.setRequestProperty("X-QK-TIME", "1460374787");
			connection.setRequestProperty("X-QK-SCHEME", "com.weiwanonline.FamJob");
			connection.setRequestProperty("X-QK-SIGN", "B8C071978D78EEA94A8B96ED252E2B2F");
			connection.setRequestProperty("Access-Control-Allow-Headers"," X-Qk-Auth, *");
			connection.setRequestProperty("X-QK-APPV", "iPad4,4|1280.250000|com.weiwanonline.FamJob|3.0.2016032101");
			connection.setRequestProperty("Origin","http://qianka.com");
			connection.setRequestProperty("X-QK-AUTH", "BB169377-4F92-4811-A32C-80CF553F0002|2ffbdfe8-20fe-46ef-b80f-07c41ed2910c|7370338014128");
			connection.setRequestProperty("Referer", "http://qianka.com/qk/dashboard?from=webclip");

			// 建立连接
			connection.connect();
			// 获取所有响应头字段
			Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段，获取到cookies等
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}
			// 定义 BufferedReader输入流来读取URL的响应
			read = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
			String line;// 循环读取
			while ((line = read.readLine()) != null) {
				result += line;
			}
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (read != null) {// 关闭流
				try {
					read.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
//		SendGET("http://static.itry.com/images", "");
		SendGET("http://qianka.com/services/pages.dashboard", "");
	}
}

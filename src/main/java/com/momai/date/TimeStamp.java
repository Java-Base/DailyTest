package com.momai.date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 	Lian
 * @date	2015年6月29日 上午11:37:08
 * @desc	java获取获得Timestamp类型的当前系统时间
 */
public class TimeStamp {
	public static void main(String[] args) {
		// 方法一
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		
		// 方法二
		Date date = new Date();
		Timestamp nowDate = new Timestamp(date.getTime());
		System.out.println(nowDate);
		
		// 由于显示时不需要显示毫秒, Timestamp转String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		// 定义格式, 不显示毫秒
		Timestamp now = new Timestamp(System.currentTimeMillis());		// 获取当前系统时间
		String str = sdf.format(now);
		System.out.println(str);
		
		// String转Timestamp
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = df.format(new Date());
		Timestamp tsp = Timestamp.valueOf(time);
		System.out.println(tsp);
	}
}

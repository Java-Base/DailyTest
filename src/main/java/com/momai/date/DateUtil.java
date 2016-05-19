package com.momai.date;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author chenjun
 * 
 *         日期工具
 *
 */
public final class DateUtil {
	private static final DateFormat dateFromat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static Timestamp getCurrentTime() {
		return new Timestamp(System.currentTimeMillis());
	}

	public static Timestamp getTimestamp(String time) {
		try {
			return new Timestamp(dateFromat.parse(time).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public static String getFormatDate(Timestamp time) {
		long timeSeconds = time.getTime();
		long currentMseconds = System.currentTimeMillis();
		long timeGap = currentMseconds - timeSeconds;
		System.out.println(time);
		System.out.println("timeSeconds " + timeSeconds);
		System.out.println("currentMseconds " + currentMseconds);
		// 1秒判断
		if (timeGap > 0 && timeGap <1000) {
			return "1秒前";
		}
		// 秒判断
		if (timeGap >= 1000 && timeGap <= 60 * 1000) {
			long second = timeGap / 1000;
			return second + "秒前";
		}
		// 分判断
		if (timeGap >= 1 * 60 * 1000 && timeGap <= 60 * 60 * 1000) {
			long minutes = timeGap / (1000 * 60);
			return minutes + "分前";
		}
		// 时判断
		if (timeGap >= 60 * 60 * 1000 && timeGap <= 24 * 60 * 60 * 1000) {
			long hours = timeGap / (1000 * 60 * 60);
			return hours + "小时前";
		}
		// 6月5日
		return time.getMonth() + "月" + time.getDate() + "日";
	}

	public static String getTextTime(Timestamp timestamp) {
		return dateFromat.format(new Timestamp(System.currentTimeMillis()));
	}

}

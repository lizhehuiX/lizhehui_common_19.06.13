package com.lizhehui.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {



	// 当前月的第一天
	public static String getDateByInitMonth(Date src) {
		// 获取当前系统时间
		Calendar c = Calendar.getInstance();
		// 用传入的日期初始化日历类
		c.setTime(src);
		// 设置格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 设置日期
		c.set(Calendar.DAY_OF_MONTH, 1);
		// 设置时
		c.set(Calendar.HOUR_OF_DAY, 0);
		// 分
		c.set(Calendar.MINUTE, 0);
		// 秒
		c.set(Calendar.SECOND, 0);
		// 获取日期类型的日期并格式化
		Date time = c.getTime();
		return df.format(time);
	}

	// 当前月的最后一天
	public static String getDateByFullMonth(Date src) {

		// 获取当前系统时间
		Calendar c = Calendar.getInstance();
		// 用传入的日期初始化日历类
		c.setTime(src);
		// 设置格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 设置月份加一
		c.add(Calendar.MONTH, 1);
		// 设置日期
		c.set(Calendar.DAY_OF_MONTH, 0);
		// 设置时
		c.set(Calendar.HOUR_OF_DAY, 23);
		// 分
		c.set(Calendar.MINUTE, 59);
		// 秒
		c.set(Calendar.SECOND, 59);
		// 获取日期类型的日期并格式化
		Date time = c.getTime();
		return df.format(time);
	}

	// 获取某个月
	public static void getDateByMonthDiff() {
		
	}
}

package com.lizhehui.common.utils;

import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	// 获取这个月第一天
	@Test
	public void testGetDateByInitMonth() {
		String sdate = DateUtil.getDateByInitMonth(new Date());
		System.out.println(sdate);
	}

	// 获取这个月最后一天
	@Test
	public void testGetDateByFullMonth() {
		String sdate = DateUtil.getDateByFullMonth(new Date());
		System.out.println(sdate);
	}

	/**
	 * 拼接下面根据时间范围查询订单的SQL： String sql = "select * from t_order where
	 * create_time>='{1}' and create_time<='{2}' ";
	 * 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	 * 将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。 最后打印出正确拼接的SQL字符串。
	 * 
	 * @Title: test01
	 * @Description: {@link DateUtilTest}
	 * @return: void
	 */
	@Test
	public void test01() {
		String sql = " select * from t_order where create where create_time >= '{1}'" + "and create_time <= {2}";
		String str = sql.replace("{1}", DateUtil.getDateByInitMonth(new Date())).replace("{2}",
				DateUtil.getDateByFullMonth(new Date()));
		System.out.println(str);
	}

}


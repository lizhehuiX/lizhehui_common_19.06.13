package com.lizhehui.common.utils;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String name = FileUtil.getExtendName("aaa.docx");
		System.out.println("文件后缀为:" + name);
	}

	@Test
	public void testGetTempDirectory() {
		System.out.println("系统临时目录:" + FileUtil.getTempDirectory());
	}

	@Test
	public void testGetUserDirectory() {
		System.out.println("操作系统用户目录:" + FileUtil.getUserDirectory());
	}

}

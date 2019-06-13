package com.lizhehui.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilTest {

	/*
	 * 方法1：批量关闭流，参数能传无限个。(3分) 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	 */
	@Test
	public void testCloseAll() throws FileNotFoundException {
		FileInputStream is1 = new FileInputStream("E:\\aa.txt");
		FileInputStream is2 = new FileInputStream("E:\\aa.txt");
		StreamUtil.closeAll(is1, is2);
	}

	/*
	 * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	 */
	@Test
	public void readTextFile() throws FileNotFoundException, IOException {
		File file = new File("E:\\aa.txt");
		String file2 = StreamUtil.readTextFile(new FileInputStream(file));
		System.out.println(file2);
	
	}
	/*
	 * 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	 */
	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream(new File("E:\\aa.txt"));
		String str = StreamUtil.readTextFile(file);
		System.out.println(str);
	}

}

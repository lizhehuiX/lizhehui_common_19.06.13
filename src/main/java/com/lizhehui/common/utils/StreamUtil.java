package com.lizhehui.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * <br>
 * Title:TODO 类标题 <br>
 * Description:流处理- 类功能描述 <br>
 * Author:李哲辉(1989773396@qq.com) <br>
 * Date:2019年6月13日
 */
public class StreamUtil {
	/*
	 * 方法1：批量关闭流，参数能传无限个。(3分) 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	 */
	public static void closeAll(Closeable...closeables) {
		try {
			for (Closeable closeable : closeables) {
				if (closeable != null) {
					closeable.close();
			}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	 */
	public static String readTextFile(InputStream src) throws IOException {
		// TODO 实现代码
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int c;
		byte[] buffer = new byte[1024];// 创建字符串缓冲区


		while ((c = src.read(buffer)) != -1) {
			bos.write(buffer, 0, c);
		}
		bos.flush();
		String string = bos.toString("utf-8");// 始用utf-8
		closeAll(src);
		return string;

	}

	/**
	 * 
	 * 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。 <br>
	 * 这是典型的方法重载，记住了吗？少年…
	 */
	public static String testReadTextFileFile(File txtFile) throws FileNotFoundException, IOException {
		// TODO 实现代码
		return readTextFile(new FileInputStream(txtFile));
	}

}

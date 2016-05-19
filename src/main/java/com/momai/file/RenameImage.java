package com.momai.file;

import java.io.File;

/**
 * 重命名文件
 * 
 * @author 	Lian
 * @date	2016年4月11日
 * @since	1.0	
 */
public class RenameImage {
	private static String DIR = "E:/git/WishNew/wish/src/main/webapp/resources/images_new";

	/**
	 * 对一个文件夹下的文件进行重命名工作
	 */
	public static void renameDir() {
		File dir = new File(DIR);
		File[] fileList = dir.listFiles();
		for (File file : fileList) {
			String oldName = file.getName();
			String newName = oldName.replace(".", "_new.");
			File dest = new File(DIR + "/" + newName);
			file.renameTo(dest);
		}
	}

	/**
	 * 对单个文件进行重命名工作
	 */
	public static void renameFile() {
		File old = new File("E:/git/WishNew/wish/src/main/webapp/resources/images_new/bj.png");
		String name = old.getName();
		String newName = name.replace(".", "_new.");
		File to = new File(DIR + "/" + newName);
		old.renameTo(to);
	}
}

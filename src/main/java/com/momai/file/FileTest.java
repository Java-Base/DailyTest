package com.momai.file;

import java.io.File;
import java.io.IOException;

/**
 * 
 *
 * @author 	Lian
 * @time	2016年8月9日
 */
public class FileTest {

	private final static String TEMP_PATH = "/Users/xingguliu/Downloads/temp/";

	public static void main(String[] args) throws IOException {
		File file = onlyFile();

		System.out.println("file is exists: " + file.exists() + "\n");
		if (file.exists()) {
			file.delete();
			System.out.println("file delete...");
		} else {
			file.createNewFile();
			System.out.println("file create...");
		}

	}

	public static File onlyFile() throws IOException {
		String path = TEMP_PATH + "file.txt";
		File file = new File(path);
		return file;
	}
}

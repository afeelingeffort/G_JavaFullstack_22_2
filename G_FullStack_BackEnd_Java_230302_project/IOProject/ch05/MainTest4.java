package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest4 {

	// main 함수
	public static void main(String[] args) {

		long milliSecond = 0;

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("chapter01.zip");
			fos = new FileOutputStream("chapter01copy.zip");

			//보조 스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			int i;
			milliSecond = System.currentTimeMillis();
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
			milliSecond = System.currentTimeMillis() - milliSecond;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("파일 복사 시 소요시간 : " + milliSecond);

	} // end of main

} // end of class

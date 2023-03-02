package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest2 {

	// main 함수
	public static void main(String[] args) {

		long milliSecond = 0;

		// 1
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("chapter02.zip");
			fos = new FileOutputStream("chpater02copy.zip");

			int i;
			milliSecond = System.currentTimeMillis(); // 10
			while ((i = fis.read()) != -1) {
				// a.zip 파일을 읽고 있는 중 --> i
				fos.write(i); // 쓰는 중
			}
			// 10 = 20 - 10
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

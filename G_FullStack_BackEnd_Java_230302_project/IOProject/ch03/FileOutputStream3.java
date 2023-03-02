package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;

public class FileOutputStream3 {

	// main 함수
	public static void main(String[] args) {

		String str = "hello world";
		// output3.txt
		// hello world를 찍어주세요
		FileOutputStream fos = null;
		// 파일이 없다면 FileOutputStream은 파일을 먼저 생성해준다.
		try {
			fos = new FileOutputStream("output3.txt");
			
//			byte sbyte[] = "hello world".getBytes();
//			for(int i=0; i<sbyte.length; i++) {
//				fos.write(sbyte[i]);
//			}
			
			byte[] contetns = str.getBytes();
			
			fos.write(contetns);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main

} // end of class

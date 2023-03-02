package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream4 {

	// main 함수
	public static void main(String[] args) {

		FileOutputStream fos = null;
		// 파일이 없다면 FileOutputStream은 파일을 먼저 생성해준다.
		try {
			byte[] bs = new byte[26];
			byte myData = 65;
			// true -> ctrl+f11할 때마다 추가적으로 글을 쓰는 동작
			fos = new FileOutputStream("output2.txt", true);
			// 파일에다가 A - Z 까지 알파벳을 출력하고 싶다면 코드 작성 방법은 ?
			// 반복 횟수 - for
			for (int i = 0; i < bs.length; i++) {
				// fos.write(myData);
				bs[i] = myData;
				myData++;
				// 65 - A, 66 - B
			}
			fos.write(bs);
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

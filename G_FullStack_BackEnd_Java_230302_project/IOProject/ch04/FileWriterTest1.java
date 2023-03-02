package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

	// main 함수
	public static void main(String[] args) {

		FileWriter fw = null;
		char[] buf = { '반', '갑', '습', '니', '다' };

		try {
			fw = new FileWriter("writer1.txt");
			// fw.write('H'); // 문자 하나만 출력 --> File
			// fw.write(buf); // 문자 배열로 파일에다가 출력
			// 대상, 인덱스 시작 값, 길이 값
			fw.write(buf, 1, 3);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main

} // end of class

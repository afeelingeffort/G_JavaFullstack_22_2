package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//FileInputStream, FileOutputStream --> 바이트 기반
// FileReader, FileWriter --> 문자열 기반 
public class FileReaderTest1 {

	// main 함수
	public static void main(String[] args) {

		// 문자 단위로 읽어들이는 스트림
		FileReader fr = null;

		try {
			fr = new FileReader("output2.txt");
			// InputStream 은 한글 깨짐, FileReader는 한글 안 깨짐
			// -1
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class

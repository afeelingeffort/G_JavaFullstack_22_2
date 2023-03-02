package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest5 {

	// main 함수
	public static void main(String[] args) {

		// 기반 스트림 + 보조 스트림 (자료형 : 문자단위)
		FileReader fileReader = null;
		int count = 0;

		try {
			File file = new File("output2.txt");
			fileReader = new FileReader(file);

			// 한 줄씩 글자를 읽어라
			BufferedReader br = new BufferedReader(fileReader);

			// 파일에다가 출력하기
			FileWriter writer = new FileWriter("myText.txt");
			writer.write(br.readLine());
			writer.flush(); // flush()나 close()를 해야 데이터를 완료해서 출력함.

//			int i;

			// 기반 스트림을 사용 (자료 대상 - 문자열)
//			while ((i = fileReader.read()) != -1) {
//				System.out.print((char) i);
//				count++;
//			}

			// 보조 스트림 사용
//			br.read();
//			while ((i = br.read()) != -1) {
//				System.out.println((char) i);
//				count++;
//			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(" 반복 횟수 : " + count);
	} // end of main

} // end of class

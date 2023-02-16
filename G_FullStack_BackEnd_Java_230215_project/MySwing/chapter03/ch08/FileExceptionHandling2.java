package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling2 {

	//main 함수
	public static void main(String[] args) {
		MyFile file = new MyFile();
		
		try {
			file.inputData("하이");	
		} catch (Exception e) {
			System.out.println("파일이 없네요~");
		}
	} //end of main
	
} //end of class

class MyFile {
	
	//throws 던지다
	//누군가가 MyFile 클래스를 사용할 때 
	//inputData 오류가 날 수 있으니 예외 처리 흐름은 사용하는 사람이 
	//알아서 구현해ㅐ
	public void inputData(String str) throws FileNotFoundException {
		FileInputStream fis;
		
		fis= new FileInputStream("test1.txt");
	}
}
package ch01;

public class DataType2_char {

	//코드의 시작점 - main 함수
	public static void main(String[] args) {
		
		char name; //변수 선언 2바이트 공간에 문자를 담을 수 있다.
		char a;
		char initial;
		
		//값을 초기화 하는 방법
		name = 'A'; //홑 따옴표를 사용해야 한다.
		name = 'b';
		//name = 'ab'; 하나의 문자만 담을 수 있다.
		System.out.println(name);
		
		System.out.println('p');
		System.out.println('C');
	} //end of main

} //end of class

package ch07;

public class StringMethod {

	// main 함수
	public static void main(String[] args) {

		String str = "abcdefu";
		// String 문서 확인
		// String 존재하는 메서드 5개 정도
		// 선택해서 사용방법 의미, 샘플 코드

		// 인덱스 5부터 끝까지
		String str1 = str.substring(5);
		// 인덱스 1부터 3까지 마지막 문자는 포함되지 않음.
		String str2 = str.substring(1, 4);

		System.out.println(str1);
		System.out.println(str2);

		System.out.println("-----------------");

		// "cd"에 있는 내용을 "zz"로 바꾼다.
		String str3 = str.replace("cd", "zz");
		System.out.println(str3);

		System.out.println("-----------------");

		// 모든 문자열을 대문자로 변환한다.
		String str4 = str.toUpperCase();
		System.out.println(str4);
		String str5 = str.toLowerCase();
		System.out.println(str5);
		System.out.println("-----------------");

		// 문자열에 포함되어 있는지 확인한다.
		boolean str6 = str.contains("bc");
		boolean str7 = str.contains("asdf");
		System.out.println(str6);
		System.out.println(str7);

		System.out.println("-----------------");

	} // end of main

} // end of class

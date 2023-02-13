package Strings;

public class StringTest3 {

	// 쓰레드 --> main 작업자 1
	public static void main(String[] args) {

		// StringBuilder, StringBuffer 알아보자
		// 문자열을 여러번 연결하거나 변경할 때 유용하다.
		// StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화를 보장한다.
		// 단일 쓰레드 프로그램에서는 StringBuilder를 권장한다.

		String java = new String("java");
		String android = new String("android");
		System.out.println(java + android);

		// java - > "java"
		StringBuilder builder = new StringBuilder(java);

		// 주소값 확인하기
		System.out.println(System.identityHashCode(builder));
		System.out.println("----------------------");
		System.out.println("builder 값 : " + builder);

		// builder에 문자열 더하는 기능은 append이다.
		builder.append(android);
		System.out.println(builder);
		System.out.println("----------------------");
		System.out.println(System.identityHashCode(builder));

		// 응용
		// StringBuilder-> String 형변환 방식은 toString한다
		String result = builder.toString();

		String result2 = builder + "반가워";

		// 정리
		// StringBuilder는 문자열을 다룰 때 한 번 생성한 문자열을 변경하더라도
		// 메모리에 새로생성하지 않는다.

	} // end of main

} // end of class

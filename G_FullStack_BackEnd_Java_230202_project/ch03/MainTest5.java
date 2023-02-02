package ch03;

public class MainTest5 {

	//main함수
	public static void main(String[] args) {
		
		//관계 연산자(비교연산자)
		//관찰의 결과가 참, 거짓으로 판별할 때 사용한다.
		//결과는 오직 true, false 반환된다.
		
		int num1 = 5;
		int num2 = 3;
		
		//5 > 3;
		System.out.println(5 > 3);
		boolean value1 = 5 > 3;
		//주어를 관계 연산자로 바라봐야 좋다.
		System.out.println(value1);
		
		boolean value2 = 5 < 3;
		System.out.println(value2);
		
		boolean value3 = num1==num2;
		System.out.println(value3);
		
		boolean value4 = num1 != num2;
		System.out.println(value4);
	} //end of main

} //end of class

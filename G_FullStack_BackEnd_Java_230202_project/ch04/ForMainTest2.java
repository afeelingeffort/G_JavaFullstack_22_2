package ch04;

public class ForMainTest2 {

	// main함수
	public static void main(String[] args) {

		int num = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		} // end of for

		System.out.println("===============");

		// 이중 for문을 활용하여 2~9단까지 구구단 출력

		for (int a = 2; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				System.out.println(a + "*" + b + "=" + a * b);
			}
			System.out.println("===============");
		}

		
	} // end of main

} // end of class

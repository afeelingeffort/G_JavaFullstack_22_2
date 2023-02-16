package ch08;

import java.util.Scanner;

public class ExceptionHandling {

	// main 함수
	public static void main(String[] args) {

		// try-catch-finally
		// finally ? 언제 사용할까?
		Scanner scn = new Scanner(System.in);

		try {
			int result = scn.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			scn.close(); //자원 해제 용도로도 많이 사용된다.
		}

		scn.close();
	} // end of main

} // end of class

package ch04;

public class ContinueMainTest1 {

	// main 쓰레드
	public static void main(String[] args) {

		// 무시하고 계속 진행하는 continue문
		// 3의 배수면 출력하지 마숑
		for (int i = 1; i < 11; i++) {
			
			if(i%3==0) {
				continue;
			}
			System.out.println("현재 값 : " + i); //3의 배수이면 출력하고 싶지 않음
		}

	} // end of main

} // end of class

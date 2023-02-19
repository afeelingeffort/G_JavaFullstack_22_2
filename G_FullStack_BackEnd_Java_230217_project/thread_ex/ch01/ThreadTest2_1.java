package ch01;

//쓰레드가 3개임 메인쓰레드, 워커1, 워커2
public class ThreadTest2_1 {

	// main 쓰레드
	public static void main(String[] args) {
		// 사용하는 방법 연습
		// 현재 쓰레드가 누구야 알아보는 명령어
		System.out.println("---------- main 쓰레드 시작 ----------");
		System.out.println(Thread.currentThread());
		// 작업자 하나 만들어 내기 (메인 쓰레드가 일함)

		Worker3 w1 = new Worker3("워커1");
		// 너가 위임받은 일을 시작해
		w1.start();

		// 쓰레드 (작업자) 하나 더 생성해보기
		Worker3 w2 = new Worker3("워커2");
		w2.start();

		System.out.println("---------- main 쓰레드 종료 ----------");
	} // end of main

} // end of class


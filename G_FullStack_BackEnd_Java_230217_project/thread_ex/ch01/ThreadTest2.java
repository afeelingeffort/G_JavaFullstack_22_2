package ch01;

//쓰레드가 3개임 메인쓰레드, 워커1, 워커2
public class ThreadTest2 {

	// main 쓰레드
	public static void main(String[] args) {
		// 사용하는 방법 연습
		// 현재 쓰레드가 누구야 알아보는 명령어
		System.out.println("---------- main 쓰레드 시작 ----------");
		System.out.println(Thread.currentThread());
		// 작업자 하나 만들어 내기 (메인 쓰레드가 일함)

		Worker w1 = new Worker("워커1");
		// 너가 위임받은 일을 시작해
		w1.start();

		// 쓰레드 (작업자) 하나 더 생성해보기
		Worker w2 = new Worker("워커2");
		w2.start();

		System.out.println("---------- main 쓰레드 종료 ----------");
	} // end of main

} // end of class

//쓰레드 만들어보기
// - 상속 활용해서 쓰레드 만들어보기 (작업자 만들어보기)
// Thread를 상속한 클래스이다. 즉 Worker는 Thread이기도 하다 - 다형성
class Worker extends Thread {

	private String name;

	public Worker(String name) {
		this.name = name;
	}

	// 약속 부분
	// start 메서드를 통해서 쓰레드한테 일 시작해라고 명령을 줄 수 있다.
	// 그러면 쓰레드는 run 메서드 안에 있는 부분을 수행시킨다.
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker : " + name + " " + i);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	} // end of run

}

package ch01;

import javax.swing.JFrame;

//생성 방법, 사용방법을 이미 학습
//만약 코드가 JFrame을 상속 받았다면 자바는 단일상속을 지원하기 때문에 다중상속을 할수 없다.
//그래서 인터페이스인 Runnable 구현 방법을 알아야 한다.

public class RunnableTest1 {

	// main 쓰레드
	public static void main(String[] args) {

		// 사용하는 방법
		// !!!
		// 생각하는 방법 --> start() 메서드는 thread가 가지고 있다.
		// 쓰레드를 생성할 때 생성자에 runnable 타입을 넣을 수 있다고 확인 -> 문서, 코드 힌트

		Runnable r = new SubWorker();
		Thread t = new Thread(r);
		
		//시작 시점은 이벤트를 받던지 연산 후에 하던지 여러분들이 실행 시킬 수 있다.
		t.start();
		// subWoker.start(); <-- 현재 start 메서드가 없다.
		// subWorker는 기능을 구현했지 Thread 상속 받은 것은 아니다.
		// 그래서 thread 기능인 start 메소드가 없는 상태이다.

	} // end of main

} // end of class

//설계하는 방법
class SubWorker extends JFrame implements Runnable {

	// 나중에 쓰레드가 동작해야 하는 부분을 run 안에서 작성함
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.print("i : " + i + "\n");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
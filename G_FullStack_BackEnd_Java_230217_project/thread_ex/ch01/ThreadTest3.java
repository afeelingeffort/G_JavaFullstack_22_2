package ch01;

public class ThreadTest3 {

	public static void main(String[] args) {

		//메인쓰레드랑 Worker2 클래스의 쓰레드가 섞여서 진행됨
		Worker2 worker = new Worker2();
		worker.start();
		
		int k = 0;
		while (k < 50) {
			System.out.print("|");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			k++;
		}

	}

}

class Worker2 extends Thread {
	public void run() {
		int i = 0;
		while (i < 50) {
			System.out.print("-");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			i++;
		}

		int j = 0;
		while (j < 50) {
			System.out.print("(");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			j++;
		}
	}

}
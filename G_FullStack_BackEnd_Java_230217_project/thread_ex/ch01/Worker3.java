package ch01;

public class Worker3 extends Thread {

	private String name;

	public Worker3(String name) {
		this.name = name;
	}

	// 약속 부분
	// start 메서드를 통해서 쓰레드한테 일 시작해라고 명령을 줄 수 있다.
	// 그러면 쓰레드는 run 메서드 안에 있는 부분을 수행시킨다.
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker : " + name + "\t" + i);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	} // end of run
}

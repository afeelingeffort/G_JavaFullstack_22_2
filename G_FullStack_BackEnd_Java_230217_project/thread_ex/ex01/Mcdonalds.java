package ex01;
//블로그 보고 만든 예제

public class Mcdonalds {

	// main 함수
	public static void main(String[] args) {
		try {
			HamburgerCook hamburger = new HamburgerCook(10);
			new Thread(hamburger, "BigMac").start();
			new Thread(hamburger, "MacChicken").start();
			new Thread(hamburger, "MacSpicy").start();
			new Thread(hamburger, "EggBulgogi").start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of main

} // end of class

class HamburgerCook implements Runnable {

	private int hamburgerCount;
	private String[] grill = { "_", "_", "_", "_" };

	public HamburgerCook(int count) {
		hamburgerCount = count;
	}

	@Override
	public void run() {
		while (hamburgerCount > 0) {
			synchronized (this) {
				hamburgerCount--;
				System.out.println("현재 만들어야 하는 버거의 갯수 : " + hamburgerCount);
			}

			for (int i = 0; i < grill.length; i++) {
				if (!grill[i].equals("_")) {
					continue;
				}

				synchronized (this) {
					grill[i] = Thread.currentThread().getName();
					System.out.println(grill[i] + "버거를 만드는 중입니다.");
				}

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				synchronized (this) {
					System.out.println(Thread.currentThread().getName() + "버거가 다 만들어졌습니다.");
					System.out.println("-----------------------------");
					grill[i] = "_";
				}
				break;
			}

			try {
				Thread.sleep(Math.round(1000 * Math.random()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
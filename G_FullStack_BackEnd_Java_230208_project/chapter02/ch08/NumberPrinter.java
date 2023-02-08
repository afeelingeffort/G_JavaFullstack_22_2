package ch08;

public class NumberPrinter {

	//private static int waitNumber;
	public static int waitNumber;
	private int id;

	//생성자는 맨 먼저 실행되고 한번만 수행이 된다.
	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}
	
	//번호표를 출력합니다.
	public void printWaitNumber() {
		System.out.println("대기 순번 "+waitNumber);
		waitNumber++;
	}
	
}

package ch02;

public class MainTest2 {

	public static void main(String[] args) {
		BankAccount2 b2 = new BankAccount2();

		Father2 f2 = new Father2(b2);
		Mother2 m2 = new Mother2(b2);
		
		f2.start();
		m2.start();
	}

}

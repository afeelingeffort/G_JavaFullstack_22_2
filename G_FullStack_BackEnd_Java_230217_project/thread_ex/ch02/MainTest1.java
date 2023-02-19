package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		// 현재 잔액 100_000원
		BankAccount b = new BankAccount();

		Father f = new Father(b);
		Mother m = new Mother(b);
		
		//아버지 입금하기
		f.start(); //3초 걸림
		
		//어머니 출금하기
		m.start(); 
		
		//정상 처리 : 10 + 1만원 - 5천원 == 10만 5천원
		
		
//		System.out.println("---------------");
//		
//		BankAccount2 b2=new BankAccount2();
//		
//		Father2 f2=new Father2(b2);
	}

}

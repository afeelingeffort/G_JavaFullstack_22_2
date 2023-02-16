package ch08;

public class MainTest2 {

	public static void main(String[] args) {

		// 예외처리 구문 작성
		// 10 / 0 연산시키고 예외 처리까지 작성해주세요.

		// try-catch문
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

		// 클래스 설계 throws
		// Exception e는 모든 예외를 걸러준다.
		Calc c = new Calc();
		try {
			c.cal(100, 0);
			System.out.println(c.result);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
	}

}

class Calc {
	int result;

	public void cal(int a, int b) throws Exception {
		this.result = a / b;
	}
}

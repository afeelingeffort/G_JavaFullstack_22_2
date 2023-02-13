package ch03;

public class CompleteCalc extends Calculator {

	public void showInfo() {
		System.out.println("계산 완료");
	}

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int substract(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}
	
	//코드 테스트
	public static void main(String[] args) {
	
		Calc calc=new CompleteCalc();
		
		if(calc instanceof CompleteCalc) {
			((CompleteCalc) calc).showInfo();
		}
		
	} //end of main
	
} //end of class

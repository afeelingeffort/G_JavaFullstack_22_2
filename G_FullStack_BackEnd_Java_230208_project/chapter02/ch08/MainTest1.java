package ch08;

public class MainTest1 {

	// main 함수 - 코드의 시작점 1
	public static void main(String[] args) {

		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		
		numberPrinter1.printWaitNumber(); // <--누군가가
		numberPrinter1.printWaitNumber(); // <--다른 누군가가
		numberPrinter1.printWaitNumber(); // <--또다른 누군가가
		System.out.println("===========================");
		numberPrinter2.printWaitNumber(); // <--누군가가
		numberPrinter2.printWaitNumber(); // <--다른 누군가가
		numberPrinter2.printWaitNumber(); // <--또다른 누군가가

	} // end of main

} // end of class

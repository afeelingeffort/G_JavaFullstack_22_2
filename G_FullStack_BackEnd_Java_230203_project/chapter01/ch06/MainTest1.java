package ch06;

public class MainTest1 {

	// 1. 리턴값이 int 매개변수 n1, n2, n3 이름은 intAdd
	static int intAdd(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;
		
//		return n1+n2+n3; //매개변수를 활용 연산 후 바로 리턴
	}

	// 2. 리턴값이 double 매개변수 n1, n2 이름은 doubleAdd
	static double doubleAdd(double n1, double n2) {
		double result = n1 + n2;
		return result;
	}
	
	// 3. 리턴값이 void, 매개변수는 String article, 함수 이름은 printArticle 출력
	static void printArticle(String article) {
		System.out.println(article);
	}
	
	// 테스트 - 실행코드 main
	public static void main(String[] args) {
		// 호출해서 수행
		int result = intAdd(1, 2, 3);
		System.out.println(result);
		
		double result2 = doubleAdd(10, 10);
		System.out.println(result2);
		
//		System.out.println(printArticle("반가워")); //이건 오류남
		printArticle("printArticle");
	} // end of main

} // end of class

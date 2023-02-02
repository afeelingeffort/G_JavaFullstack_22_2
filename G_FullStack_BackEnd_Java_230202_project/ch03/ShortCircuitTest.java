package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {

		// 관계 논리곱 --> F --> F, 논리합 -- T -- T

		int num1 = 5;
		int i = 0;

		//                    F             &&        T
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println("=============");
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println("=============");
		
		//               F          ||         T
		value = ((num1 += 10) < 10) || ((i +=2) < 10);
		System.out.println(value);
		System.out.println(i);
		
		System.out.println("==================");
		//문제
		
		//문제 shortCircuit 평가 문제를 직접 2문제 만들어 주세요.
		//그리고 카페 도전과제 -> 실습 및 리뷰에 문제&답를 올려주세요.
		
		
	}

}

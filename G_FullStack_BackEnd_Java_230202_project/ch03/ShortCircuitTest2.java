package ch03;

public class ShortCircuitTest2 {

	public static void main(String[] args) {
		int sc=7;
		int a=0;

		// F && T
		boolean result = ((sc -= 5) > 10) && ((a += 3) < 10);

		System.out.println(result); // F && T --> F
		System.out.println(sc); // 2--> ShortCircuit에 의해 F&&이므로 뒤에 항은 평가 적용 안됨. 
		System.out.println(a); // 0
		
		// T || T
		result = ((sc += 5) > 10) || ((a += 5) < 10);
		System.out.println(result); // T || T --> T
		System.out.println(sc); // 7 --> ShortCircuit에 의해 T||로 인해
		System.out.println(a); // 5
	}

}
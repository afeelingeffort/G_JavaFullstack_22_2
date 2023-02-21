package ch06;

public class MainTest {

	public static void main(String[] args) {
		
		A a = new A();
		//문제 
		//d object에 있는 value 값을 화면에 출력해주세요.
		
		System.out.println(a.b.c.d.value);
		
		for(String str : a.b.c.d.arrayList) {
			System.out.println(str);
		}
		
		System.out.println(a.b.c.d.arrayList);
		
		
		D d = new D();
		
		for(String str : d.arrayList) {
			System.out.println(str);
		}
		
		System.out.println(d.arrayList);

	}

}

package ch05;

public class MainTest1 {

	// 코드의 시작점 (메인함수)
	public static void main(String[] args) {
		//여기 안에 사용하는 변수를 지역 변수
		
		Warrior w1; // 데이터 타입 선언 --> 참조 타입 선언 --> 변수 선언
		w1 = new Warrior(); // new 키워드를 만나면 --> 메모리 상에 존재하게 한다.
		// 메모리에 올라가면 프로그램 세상에 존재하게 된다.

		w1.name = "작은오크";
		w1.color = "초록색";
		w1.height = 100;
		w1.power = 10;

		//앞으로는 프로그래밍 세상에서
		//메모리에 올라갔을 때 객체라고 부른다.
		
		Warrior w2 = new Warrior();
		w2.name = "큰오크";
		w2.color = "빨간색";
		w2.height = 500;
		w2.power = 300;
		
	} // end of main

} // end of class

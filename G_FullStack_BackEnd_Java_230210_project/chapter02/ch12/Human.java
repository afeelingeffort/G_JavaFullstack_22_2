package ch12;

//public abstract class Human extends Animal { --> 1
public class Human extends Animal {
	//1. 추상 메서드를 포함하게 되면 추상 클래스로 만들어 주면 된다.
	
	//2. 부모 클래스에 있는 추상 메서드를 자식 클래스에서 
	//일반 메서드로 재정의 하였다.
	@Override
	public void hunt() {
		// 1000줄
		System.out.println("휴먼이 사냥을 합니다.");
	}
	
	
} //end of class

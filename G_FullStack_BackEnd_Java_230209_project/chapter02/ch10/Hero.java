package ch10;

public class Hero {

	String name;
	int hp;

	Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void attack() {
		System.out.println("기본 공격합니다.");
	}

	// main 함수
	public static void main(String[] args) {

		Warrior2 w2 = new Warrior2("w2", 20);
		Archer a = new Archer("a", 20);
		Wizard w = new Wizard("w", 20);
		
		w2.comboAttack();

	} // end of main

} // end of class

class Warrior2 extends Hero {
	
	Warrior2(String name, int hp) {
		super(name, hp);
	}
	
	Warrior2() {
		super("전사", 10);
	}

	public void comboAttack() {
		System.out.println("콤보로 공격합니다.");
	}
}

class Archer extends Hero {
	Archer(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {
		System.out.println("불화살을 쏩니다.");
	}
}

class Wizard extends Hero {
	Wizard(String name, int hp) {
		super(name, hp);
	}

	public void freezing() {
		System.out.println("얼음 공격을 합니다.");
	}
}
package ch04;

//레벨업 부분 다시 설계하기

//전사 클래스 설계하기
public class Warrior {

	// 상태
	String name;
	int experienceValue;
	int level;
	int hp;
	int mp;
	int attack;
	int defend;

	public Warrior(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 1000;
		this.level = 0;
		this.experienceValue=0;
	}

	public Warrior() {
	}

	// 기능

	public void levelUp(int count) {
		if (experienceValue <= 1000) {
			System.out.println("축하합니다. 레벨업 하셨습니다.");
		}
	}
	
	public void hpRecovery(int recover) {
		this.hp += recover;
		System.out.println("hp " + this.hp + "만큼 회복하셨습니다.");
	}

	public void mpRecovery(int recover) {
		this.mp += recover;
		System.out.println("mp " + this.mp + "만큼 회복하셨습니다.");
	}

	public void attack(int reduceMp) {
		this.mp -= reduceMp;
		this.experienceValue+=20;
		System.out.println("공격합니다.");
		System.out.println("mp가 " + reduceMp + "만큼 줄어들고 현재 mp는 " + this.mp + " 남았습니다.");
	}

	public void defend(int defend) {
		this.hp -= defend;
		if (this.hp <= 0) {
			System.out.println("죽었습니다.");
		}
		System.out.println("공격을 당해, 현재 hp " + this.hp + " 되었습니다.");
	}

	public void showInfo() {
		System.out.println("상태창");
		System.out.println("직업명 : " + this.name);
		System.out.println("hp : " + this.hp);
		System.out.println("mp : " + this.mp);
	}

} // end of class

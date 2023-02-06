package ch04;

public class Wizard {

	// 상태
	String name;
	int hp;
	int mp;
	int attack;
	int defend;
	int level;

	public Wizard(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 1000;
	}

	// 기능
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
		System.out.println("공격합니다.");
		System.out.println("mp가 " + reduceMp + "만큼 줄어들고 현재 mp는 " + this.mp + " 남았습니다.");
	}

	public void defend(int defend) {
		this.hp -= defend;
		if(this.hp<=0) {
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
	
	

}

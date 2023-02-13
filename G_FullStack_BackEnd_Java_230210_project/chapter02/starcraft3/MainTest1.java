package starcraft3;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("천하무적질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("귀신잡는해병1");
		Marine marine2 = new Marine("마린2");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		
		// 질럿이 마린을 공격 - 대상 1, 2 
		for (int i = 0; i < 16; i++) {
			zealot1.attack(marine2);
		}
		
		System.out.println(marine1.getHp());
		zealot1.showInfo();
		marine1.showInfo();
		marine2.showInfo();
		
		System.out.println("==================");
		Unit u1=new Zealot("ㅎㅏ이");
		u1.attack(zergling2);
		
		Unit u2=new Zergling("저글링");
		u2.attack(zealot2);
	}
}
package ch04;

public class GameTest {

	// main 함수
	public static void main(String[] args) {

		Warrior warrior = new Warrior("카이저");

		warrior.attack(10);
		warrior.attack(10);
		warrior.mpRecovery(10);
		warrior.hpRecovery(10);
		warrior.defend(150);

		System.out.println("--------------");
		warrior.showInfo();

		System.out.println("====================");
		
		Wizard wizard = new Wizard("비숍");
		wizard.attack(10);
		wizard.attack(15);
		wizard.mpRecovery(20);
		wizard.hpRecovery(20);
		wizard.defend(1500);
		
		System.out.println("--------------");
		wizard.showInfo();
		
	} // end of main

} // end of class

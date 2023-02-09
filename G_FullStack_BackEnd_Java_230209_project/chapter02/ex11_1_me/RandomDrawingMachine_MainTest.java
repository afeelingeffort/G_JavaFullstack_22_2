package ex11_1_me;

import java.util.Random;
import java.util.Scanner;

public class RandomDrawingMachine_MainTest {

	public static void main(String[] args) {
		// 실행 흐름

		// 스캐너 <---3 -----> 3
		// rnumber <1~3 ---> 3
		// 상품 추출

		// 기능 만들기
		// 랜덤 번호 1~3 중 하나 추출
		// 사용자 1~3 입력 받기
		// 맞으면 상품 전달
		// 틀리면 다시시도, 돈을 넣어요~

		Toy toy = new Toy();
		RandomDrawingMachine_MainTest rdm = new RandomDrawingMachine_MainTest(1700);

		Scanner scn = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			int userInput;

			System.out.println("1~3중 번호를 랜덤으로 입력해주세요.>");
			userInput = scn.nextInt();

//			int bound = 3;
//			Random rnumber = new Random();
//			System.out.println(rnumber.nextInt(bound));
			int rnumber = (int) (Math.floor(Math.random() * 3)) + 1;

			if (userInput == rnumber) {
				System.out.println("축하합니다! 상품을 받아가세요~");
			} else {
				System.out.println("아쉽네요! 다음 기회를 노려주세요 ~");
			}

			System.out.println(rnumber);

			if (rdm.userMoney >= 500) {
				rdm.userMoney -= 500;
				rdm.machineMoney += 500;
			}

			if (rdm.userMoney < 500) {
				System.out.println("돈이 부족합니다. 돈을 넣어주세요~");
				break;
			}

			rdm.showInfo();
		}

	} // end of main

	private int userMoney;
	private int machineMoney;
	Toy doll;
	Toy money;
	Toy figure;

	RandomDrawingMachine_MainTest(int userMoney) {
		this.userMoney = userMoney;
		this.machineMoney = 0;
	}

	public int getUserMoney() {
		return userMoney;
	}

	public void setUserMoney(int userMoney) {
//		this.userMoney -= 500 * count;
		this.userMoney = userMoney;
	}

	public int getMachineMoney() {
		return machineMoney;
	}

	public void setMachineMoney(int machineMoney) {
//		this.machineMoney += 500 * count;
		this.machineMoney = machineMoney;
	}

	public void showInfo() {
		System.out.println("사용자의 소지금 : " + this.userMoney);
		System.out.println("기계의 수익금 : " + this.machineMoney);
	}
	// 상품 ---> 상속 ---> 클래스 설계
}

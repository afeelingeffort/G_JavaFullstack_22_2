package ch02;

public class BankAccount2 {

	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	public synchronized int withdraw(int money) {
		int currentMoney = getMoney();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("출금 후 계좌 잔액 : " + getMoney());
			return money;
		} else {
			System.out.println("잘못된 입력값입니다.");
			return 0;
		}
	}
}


class Father2 extends Thread {
	BankAccount2 account;

	public Father2(BankAccount2 account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 입금 시키기
		account.saveMoney(10_000);
	}

}

class Mother2 extends Thread {
	BankAccount2 account;

	public Mother2(BankAccount2 account) {
		this.account = account;
	}

	public void run() {
		// 출금 시키기
		account.withdraw(5_000);
	}
}

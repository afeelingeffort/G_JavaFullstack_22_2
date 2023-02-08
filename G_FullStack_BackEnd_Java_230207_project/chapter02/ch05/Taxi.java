package ch05;

public class Taxi {
	String taxiCompany;
	int taxiMoney;
	
	public Taxi(String taxiCompany) {
		this.taxiCompany=taxiCompany;
	}
	
	public void take(int money) {
		taxiMoney+=money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompany+"의 수익금은 "+taxiMoney+"원 입니다.");
	}
}

package ch04;

public class Powder extends Material {

	@Override
	public String toString() {
		return "재료는 파우더입니다.";
	}
	
	public void doPrinting() {
		System.out.println("파우더로 출력합니다.");
	}
}

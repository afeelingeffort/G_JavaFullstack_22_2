package ex12;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop 화면");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop 타자를 칩니다.");
	}
	
}

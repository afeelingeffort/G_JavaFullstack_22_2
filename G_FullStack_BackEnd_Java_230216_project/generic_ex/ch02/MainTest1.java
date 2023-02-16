package ch02;

import ch04.Plastic;
import ch04.Powder;

public class MainTest1 {

	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		ThreeDPrinter3 t3 = new ThreeDPrinter3();
		// 재료 넣기
		t3.setMaterial(powder);

		// 재료 꺼내보기
		Plastic usePlastic = (Plastic) t3.getMaterial();

		// Object <--불편한점들 존재한다.
		// 다운캐스팅 처리를 해야하고
		// 런타임 시점에 잘못된 처리를 하게 되면 예외를 발생시킬 수 있다.

	} // end of main

} // end of class

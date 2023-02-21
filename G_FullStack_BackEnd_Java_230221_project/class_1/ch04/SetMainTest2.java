package ch04;

import java.util.HashSet;
import java.util.Random;

public class SetMainTest2 {

	// main 함수
	public static void main(String[] args) {

		HashSet<Integer> numberSet = new HashSet<Integer>();

//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		numberSet.add(getRandomNumber());
//		System.out.println(numberSet.size());
//		System.out.println(numberSet.toString());

		// 무조건 6개 사이즈 가지는 numberSet 구성하기
		// hint --> 반복문 사용
		int cnt = 0;
		while (numberSet.size() != 6) {
			cnt++;
			numberSet.add(getRandomNumber());
		}
		
		System.out.println(numberSet);
		System.out.println("반복 횟수 : " + cnt);

	} // end of main

	public static int getRandomNumber() {
		Random r = new Random();
		return r.nextInt(45) + 1;
	}

} // end of class

package ch09;

import java.util.Arrays;
import java.util.Random;

//기능
//랜덤 번호 발생하는 클래스 1~ 45
//get, set 
//6개 번호를 리턴하는 기능
public class LottoRandomNumber {

	// 6개 난수 발생해서 배열 리턴하는 기능

	private int[] lotto;

	public void setLottoNumber(int[] lotto) {
		lotto = new int[6];
		Random r = new Random();

		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;

			for (int e = 0; e < i; e++) {
				if (lotto[i] == lotto[e]) {
					i = i - 1;
					break;
				}
			}
		} // end of for

		Arrays.sort(lotto);
	}

	public int[] getLottoNumber() {
		return lotto;
	}
}

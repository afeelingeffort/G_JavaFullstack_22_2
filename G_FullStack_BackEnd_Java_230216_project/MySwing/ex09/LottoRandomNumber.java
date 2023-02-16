package ex09;

import java.util.Arrays;
import java.util.Random;

public class LottoRandomNumber {
	final int LOTTO_NUMBER_SIZE = 6;

	public int[] createNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIZE];
		Random r = new Random();
		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = r.nextInt(45) + 1;
			// 중복 검증
			// i=0 --> inner for X
			// 두번째 for문 수행시 10, 10
			// j==0, i==1 --> 1번 for실행
			// lottoWinNum[0]->10
			// lottoWinNum[1]->10
			for (int j = 0; j < i; j++) {
				// 현재 i=1, 현재 j=0
				// lottoWinNum[1] == 10
				// lottoWinNum[0] == 10
				if (lottoWinNum[i] == lottoWinNum[j]) {
					// i--> 1 -1 --> 0
					i--;
					break;
				}
			}
		}

		Arrays.sort(lottoWinNum); // 오름차순
		return lottoWinNum;
	}
}

package com.biz.lotto;

import java.util.Random;

public class Lotto_03 {

	public static void main(String[] args) {

		int[] lottoNum = new int[6];

		Random rnd = new Random();
		for (int ������ġ = 0; ������ġ < lottoNum.length; ������ġ++) {
			int intR = rnd.nextInt(45) + 1;

			// lottoNum �迭�� intR�� �������� �ִ��� �˻�
			int ã����ġ = 0;
			for (ã����ġ = 0; ã����ġ < lottoNum.length; ã����ġ++) {
				if (lottoNum[ã����ġ] == intR) {
					break;
				}
			}
			// ������ã�Ҵ�.
			if(ã����ġ >= lottoNum.length) {
				lottoNum[������ġ]=intR;
			//ã�Ҵ�
			}else {
				// ��ȣ(intR)�� �ٽû����ؼ�
				// lottoNum[������ġ]�� ������ �ؾ��Ѵ�.
				������ġ --;
			}
			
			// lottoNum[������ġ] = intR; 
		}
	}

}

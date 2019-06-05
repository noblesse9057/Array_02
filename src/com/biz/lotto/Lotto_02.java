package com.biz.lotto;

import java.util.Random;

public class Lotto_02 {

	public static void main(String[] args) {

		// 6개의 정수형 배열을 생성하고
		// 정수배열 개수만큼 반복을 하면서
		// 1. 임의 정수 1부터 45까지 중 한개를 생성
		// 2. 생성한 수가 배열에 이미 담겨 있는지검사
		// 3. 그렇지 않으면 배열에 임의 정수를 담기

		int[] num = new int[6];

		Random rnd = new Random();
//		for(int i=0; i<num.length; i++) {
//		num[i] = rnd.nextInt(45);
//		}	
		for (int i = 0; i < num.length; i++) {
			int intR = rnd.nextInt(45) + 1;
			int index;
			for (index = 0; index < num.length; index++) {
				if (num[index] == intR) {
					break;
				}
			}
			if (index >= num.length) {
				num[i] = intR;
			} else {
				i--;
			}

		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}
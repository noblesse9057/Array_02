package com.biz.lotto;

import java.util.Random;

public class Lotto_02 {

	public static void main(String[] args) {

		// 6���� ������ �迭�� �����ϰ�
		// �����迭 ������ŭ �ݺ��� �ϸ鼭
		// 1. ���� ���� 1���� 45���� �� �Ѱ��� ����
		// 2. ������ ���� �迭�� �̹� ��� �ִ����˻�
		// 3. �׷��� ������ �迭�� ���� ������ ���

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
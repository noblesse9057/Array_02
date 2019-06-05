package com.biz.lotto;

import java.util.Random;

public class Lotto_04 {
	public static void main(String[] args) {

		/*
		 * 1. �������迭�� 45���� ���� 2. ������� 1����45������ ���ڸ� ���� ���� �迭��ҿ��� �ߺ��� ���� ����. 3. 45�� �迭�� ������
		 * ����(suffle) 4. ���� �迭���� 0������ 5������ �����ؼ� 5. �ֿܼ� �����ֱ�
		 */

		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		// Ƚ���� ������ �ʴ� �ݺ���
		// ���ѹݺ���
		// for(;;) {}
		// ������ for���� �̿��ؼ� ���ѹݺ��� ������� �ʴ´�

		// ���ѹݺ�
		boolean a = 1 == 1;
		int index = 100;
		while (index > 0) { // while(true)
			index--;

		}
		/*
		 * while(true) { if(!a) break;
		 */
		Random rnd = new Random();
		int loop = nums.length * 3;
		while (loop > 0) {

			// ���Ƿ� 0���� 44������ ���� 2���� �����ؼ�
			// ���������� ����
			int index1 = rnd.nextInt(nums.length);
			int index2 = rnd.nextInt(nums.length);

			// �ΰ��� ������ ����� ���� �ٸ���(!=)
			if (index1 != index2) {
				int _temp = nums[index1];
				nums[index1] = nums[index2];
				nums[index2] = _temp;
				loop--;
			}

		}
// ���� ���� �����ؼ� �������
		for (int i = 0; i < 6; i++) {
			System.out.print(nums[i] + "\t");
		}
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (nums[i] > nums[j]) {
					int _temp = nums[i];
					nums[i] = nums[j];
					nums[j] = _temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.print(nums[i] + "\t");
		}
	}
}
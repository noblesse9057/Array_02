package com.biz.lotto;

import java.util.Random;

public class Lotto_01 {

	public static void main(String[] args) {

		// 6���� ������ �迭�� ������ʱ�ȭ(����)�ϰ�
		// 1���� 45������ ������ ������ 1���� �迭�� ä��ÿ�
		
		int[] num = new int[6];
		
		Random rnd = new Random();
		for(int i=0; i<num.length; i++) {
			num[i] = rnd.nextInt(45);
			
		}	
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		// �Ǵٸ� ���Ǽ���(1-45)�� �ϳ� �����ؼ�
		// num �迭�� ����ִ��� �˻�
		// ������ �ִ�
		// ������ ����
		int intR = rnd.nextInt(45)+1;
		int index;
		for(index=0; index<num.length; index++) {
			if(num[index] == intR) {
				break;
			}
		}
		if(index >= num.length) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}

}

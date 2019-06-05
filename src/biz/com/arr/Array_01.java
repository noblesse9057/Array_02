package biz.com.arr;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {
		
		int[] intKor = new int[5];
		
		Random rnd = new Random();
		for(int i = 0; i< intKor.length; i++) {
			
			// 51���� 100���� ���� ���� ����
			int intRnd = rnd.nextInt(50)+51;
			intKor[i] = intRnd;
				
		}
		
		for(int i =0; i<intKor.length;i++) {
			System.out.print(intKor[i]);
			
			if((i+1)% 5 == 0)
				System.out.println();
				else System.out.print(",");
			
		}
		// ���� �迭�� ��� ���� ����Ʈ��
		// ������������(���������� ū�� ����) ����(sort)�ؼ� ����
		
		// 70, 60, 51, 90, 77 �̶�� ����
		// leftI rightI intKor[leftI] 	  intKor[rightI]
		// 0	 1		intKor[0]:70	  intKor[1]:60
		//      					70 > 60
		//60 ,70, 51, 90, 77 �̶�� ����
		// 0      2       intKor[0] =60   intKor[2]:51
		//						    60 > 51
		// 51 ,70, 60 , 90 , 77 �̶�� ����
		// �ݺ������� ������ �迭�� ��� ���� ���Ͽ� 
		// �ڸ��ٲ��� �����ϸ鼭 ���������� ū�������� �����ϴ� �ڵ�
		for(int leftI = 0; leftI< intKor.length;leftI++) {
			for(int rightI=leftI+1; rightI < intKor.length; rightI++) {
				if(intKor[leftI]>intKor[rightI]) {
					
					int _temp = intKor[leftI];
					intKor[leftI] = intKor[rightI];
					intKor[rightI] = _temp;
					
				}
				
			}
		}
		for(int i =0; i<intKor.length;i++) {
			System.out.print(intKor[i]);
			
			if((i+1)% 5 == 0)
				System.out.println();
				else System.out.print(",");
	}

	}
}

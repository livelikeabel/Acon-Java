package ch4.test;

import java.util.ArrayList;

public class Array3TenTen {

	public static void main(String[] args) {
		// 1. 2���� �迭�� 10 * 10 ��ŭ ���弼��
		// 2. ������ �濡
		int[][] ar = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				System.out.println(ar[i][j] = i * j);
		}
	}
}

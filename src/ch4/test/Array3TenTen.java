package ch4.test;

import java.util.ArrayList;

public class Array3TenTen {

	public static void main(String[] args) {
		// 1. 2차원 배열을 10 * 10 만큼 만드세요
		// 2. 가각의 방에
		int[][] ar = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				System.out.println(ar[i][j] = i * j);
		}
	}
}

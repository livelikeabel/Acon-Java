package ch4.test;

import java.util.ArrayList;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] number = new int[6];

		for (int i = 0; i < 6; i++) {
			number[i] = (int) (Math.random() * 100);
			int n = number[i];
			System.out.println(n);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < 6; i++)
			al.add((int) (Math.random()*100));
		System.out.println(al);
	}
}

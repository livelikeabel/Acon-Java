package ch4.test;

public class Ex04_22Array {

	public static void main(String[] args) {

		int[][] num = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num[" + i + "][" + j + "]=" + num[i][j]);
			}
		}

		String[][] name = { { "홍길동", "이순신" }, { "유관순" } };
		
		for( int i = 0; i < name.length; i++) {
			for( int j = 0; j < name[i].length; j++)
				System.out.println("num[" + i + "][" + j + "]=" + name[i][j]);
		}
	}
}

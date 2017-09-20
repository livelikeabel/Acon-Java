package ch4.test;

public class While4Star {

	public static void main(String[] args) {

		int i = 0;
		while (i < 10) {

			int j = 0;
			while (j < i) {
				System.out.print("¡Ù");
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("\n===================\n");
		
		
		
		
	}
}

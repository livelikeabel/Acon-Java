package ch4.test;

public class Array5Lotto1 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int j = 0;
		
		for(int i = 0; j < lotto.length; i++) {
			int tmp = (int) (Math.random() * 100);
			boolean sameFlag = false;
			for(int z=0; z<j; z++) {
				if(tmp == lotto[z]) {
					sameFlag = true;
				}
			}
			if (tmp > 0 && tmp < 46 && !sameFlag) {
					lotto[j] = tmp;
					j++;
			}
		}
		
		for(int i = 0; i < lotto.length - 1; i++) {
			for(int k = i + 1; k < lotto.length; k++) {
				if(lotto[i] > lotto[k]) {
				int p = lotto[i];
				lotto[i] = lotto[k];
				lotto[k] = p;
				}
			}
		}
		for(int x : lotto)
			System.out.println(x);
	}//main
}

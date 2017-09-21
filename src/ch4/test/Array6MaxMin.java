package ch4.test;

public class Array6MaxMin {
	public static void main(String[] args) {
		int[] intArr = {421342134, 341234123, 224234331,22343426, 2453514 ,66545611};
		for(int i = 0; i < intArr.length - 1; i++) {
			for(int k = i + 1; k < intArr.length; k++) {
				if(intArr[i] > intArr[k]) {
					int tmp = intArr[i];
					intArr[i] = intArr[k];
					intArr[k] = tmp;
				}
			}
		}
		
		for(int i = 0; i < intArr.length; i++)
			System.out.println(intArr[i]);
		
	}
}

package ch5.test;

import java.util.Scanner;

class PIAgree{
	String name;
	String tel;
	String agree;
}

public class Array8ToOOP2 {
	 public static void main(String[] args) {
		PIAgree[] pArr = new PIAgree[10];
		Scanner scan = new Scanner(System.in);
		int menuNo = 0;
		int roomNumber = 0;
		while(true) {
			System.out.println("�޴� �Է� (0����,1�Է�,2���) : ");
			menuNo = scan.nextInt();
			if(menuNo == 0) {
				System.exit(0);
			}else if(menuNo == 1) {
				System.out.println("�̸� : ");
				String tmpNm = scan.next();
				System.out.println("��ȭ��ȣ : ");
				String tmpTel = scan.next();
				System.out.println("�����������ǿ���(Y/N) : ");
				String tmpYn = scan.next();
				if(tmpYn.equalsIgnoreCase("Y")) {
					pArr[roomNumber] = new PIAgree();
					pArr[roomNumber].name = tmpNm;
					pArr[roomNumber].tel = tmpTel;
					pArr[roomNumber].agree = tmpYn;
					roomNumber++;
				}
			}else if(menuNo == 2) {
				for(int i = 0; i < roomNumber; i++) {
					System.out.print(pArr[i].name+"\t");
					System.out.print(pArr[i].tel+"\t");
					System.out.println(pArr[i].agree);
					
				}
			}
		}//while
	}//main
}
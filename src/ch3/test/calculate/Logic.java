package ch3.test.calculate;

import java.util.ArrayList;

public class Logic {

	void logic(ArrayList al) {
		String s = (String) al.get(0);
		int a = (int) al.get(1);
		int b = (int) al.get(2);
		
		switch(s) {case "+" : System.out.println(a + " + " + b + " = " + (a + b));break;
				   case "-" : System.out.println(a + " - " + b + " = " + (a - b));break; 
				   case "*" : System.out.println(a + " * " + b + " = " + (a * b));break; 
				   case "/" : System.out.println(a + " / " + b + " = " + (a / b));break;}
	}
}

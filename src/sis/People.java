package sis;

public class People {
	String name;
	String ssn;
	String tel;

	class Student extends People {
		String major;
		String grade;
	}

	class Professior extends People {
		String major;
		String position;
	}
	
	class Employee extends People {
		String department;
		String position;
	}

}

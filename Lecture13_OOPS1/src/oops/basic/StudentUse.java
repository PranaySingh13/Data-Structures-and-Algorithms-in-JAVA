package oops.basic;

public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println(s1);
		System.out.println(s2);

		s1.name = "Pranay";
		s1.rollNumber = 1;

		s2.name = "Rahul";
		s2.rollNumber = 2;

		System.out.println(s1.name + " " + s1.rollNumber);
		System.out.println(s2.name + " " + s2.rollNumber);

	}

}

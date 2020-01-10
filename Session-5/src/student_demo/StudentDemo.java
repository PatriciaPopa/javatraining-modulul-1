package student_demo;

public class StudentDemo {
	public static void main(String[] args) {
		Student student1 = new Student(1,"cnp1","Ion Popescu", "Economie");

		student1.daExamen("microeconomie");
		student1.setNume("Vasile Popescu");
		System.out.println(student1.getCnp());
	}
}

package flow_control_demo;

public class IfElseDemo {
	public static void main(String[] args) {
		int a = 1;

		if(a > 3) {
			System.out.println("a > 3");
		}
		else {
			System.out.println("a < 3");
		}

		String s = "Hello";

		if(s == null) {
			System.out.println("E null, deci nu prea ai ce sa faci cu el");
		}
		else {
			if(s.length() > 6) {
				System.out.println("Are cel putin 6 caractere");
			}
			else{
				System.out.println("Are mai putin de 6 caractere");
			}
		}

	}
}

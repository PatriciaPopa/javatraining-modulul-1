package flow_control_demo;

public class DoWhileDemo {
	public static void main(String[] args) {
		int i = -4;

		do {
			System.out.println(i);
		} while(i > 0);

		int j = 0;

		do {
			System.out.println(j);
			j++;
		} while(j < 10);
	}
}

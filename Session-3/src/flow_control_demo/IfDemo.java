package flow_control_demo;

public class IfDemo {

	public static void main(String[] args) {
		if(true) {
			System.out.println("Adevarat!");
		}

		if(true)
			System.out.println("Adevarat!"); // e corect sa scriem fara acolade doar pt o singura instructiune din if!

		boolean t = true;
		boolean f = false;

		if(t || f) {
			System.out.println("True");
		}

		if(f) {
			System.out.println("False");
		}

		/* ------------------------------------------------------- */
		if(false)
			System.out.println("Prima linie");
		System.out.println("A doua linie");

		if(false)
			System.out.println("Prima linie");
		System.out.println("A doua linie");

		/* ------------------------------------------------------- */
		if(true) {
			if(t) {
				System.out.println("false");
			}
		}
	}

}

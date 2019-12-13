package flow_control_demo;

public class ForDemo {
	public static void main(String[] args) {

		// bucla infinita
		//		for(;;) {
		//			System.out.println("Mesaj");
		//		}

		for(int i = 0; i < 10; i++) {
			//System.out.println(i);
		}

		String[] sir = {"Ana", "are", "mere", "multe"};

		for(int i = 0; i < sir.length; i++) {
			//System.out.println(sir[i]);
		}

		for(String el : sir) {
			//System.out.println(el);
		}

		/* acest for mai explicit e util cand avem nevoie si de valoarea indexului */
		for(int i = 0; i < sir.length; i++) {
			if(i%2 == 0) {
				System.out.println(sir[i]);
			}
			else {
				System.out.println("_");
			}
		}
	}
}

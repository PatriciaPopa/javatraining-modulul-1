package flow_control_demo;

public class BreakDemo {
	public static void main(String[] args) {
		int i = 0;

		//		while(i < 10) {
		//			System.out.println(i);
		//
		//			if(i == 5) {
		//				break;
		//			}
		//
		//			i++;
		//		}

		/* ------------------------------------------ */
		int j = 0;

		breakThisLoop : while(i < 10) { // breakThisLoop este labelul

			System.out.println("Valoarea curenta a lui i: " + i);

			j = 0;

			while(j < 10) {
				System.out.println("    Valoarea curenta a lui j: " + j);

				if(j == 5 && i == 3) {
					break breakThisLoop;
				}

				j++;
			}

			System.out.println();

			i++;
		}

	}
}

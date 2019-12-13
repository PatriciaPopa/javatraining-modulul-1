package flow_control_demo;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Introduceti numarul corespunzator unei zile a saptamanii:");

		int day = in.nextInt();

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break; // observati ce se intampla cand comentam aceasta linie
			/* observati ca daca decomentam linia de mai jos, vom avea o eroare de compilare, pt ca break intrerupe flow-ul switchului si
			 * sare direct la prima instructiune de dupa el
			 */
			// System.out.println("Nu se va mai afisa");
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please pick a value between 1 and 7");
		}


	}
}

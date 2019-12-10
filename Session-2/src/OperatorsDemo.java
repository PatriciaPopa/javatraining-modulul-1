
public class OperatorsDemo {
	public static void main(String[] args) {
		/* ------------------------ operatori unari ------------------------------ */

		int a = 1;
		a++; // echivalent cu a = a + 1 sau a += 1;
		// a--; // echivalent cu a = a - 1 sau a -= 1;

		System.out.println(a);

		int b = 1;
		++b;
		System.out.println(b);

		System.out.println(a++);
		System.out.println(a);
		System.out.println(++b);

		System.out.println(+b); // e tot acelasi lucru cu b simplu
		System.out.println(-b); // va afisa opusul lui b (cu minus)

		System.out.println(~11);

		System.out.println(!true);

		boolean boolVar = false;

		System.out.println(!boolVar);

		/* ------------------------ operatori binary ------------------------------ */
		System.out.println(1+2);
		int c = 1;
		int d = 2;
		System.out.println(c+d);

		System.out.println(1-2);

		System.out.println(c*d);

		System.out.println(c/d);

		System.out.println((float)c/d);

		double e = 1;
		double f = 2;
		System.out.println(e/f);

		System.out.println(4%2); // restul impartirii lui 4 la 2 <=> 4 / 2 = 2, rest = 0
		System.out.println(3%2); // restul impartirii lui 3 la 2 <=> 3 / 2 = 1, rest = 1

		/* ----------------------- operatori de shiftare de biti ---------------------- */
		System.out.println(1<<1); // shiftam bitii lui 1 spre stanga, cu o pozitie
		System.out.println(1<<2); // shiftam bitii lui 1 spre stanga, cu doua pozitii

		System.out.println(2>>2);
		System.out.println((0b00000010>>2)); // asta e tot 2

		System.out.println(2>>>2);

		/* ----------------------- operatori relationali ---------------------- */
		System.out.println("un string" instanceof String);

		System.out.println((1+3*(2-2)+12-3/2) < 7);

		System.out.println(8 > 0);

		System.out.println(1 <= 1);

		System.out.println(3 >= 4);

		System.out.println(6 == 6);

		System.out.println(6 != 6);

		// Aici am ramas. TODO
	}
}

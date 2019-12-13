
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
		double doub = 2;
		System.out.println(e/doub);

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

		/* ------------------------ operatori logici ------------------------------ */
		boolean t = true;
		boolean f = false;

		System.out.println(false && false);
		/* observati Warningul: "dead code"; apare pt ca acea portiune de cod subliniata cu galben nu se mai executa,
		 * deoarece false && orice ne va da instant false, fara a mai fi nevoie sa evaluam a doua portiune*/
		System.out.println(false && t);
		System.out.println(true && f);
		System.out.println(t && true);

		System.out.println(false || false);
		System.out.println(false || t);
		/* observati Warningul: "dead code"; apare pt ca acea portiune de cod subliniata cu galben nu se mai executa,
		 * deoarece true || orice ne va da instant true, fara a mai fi nevoie sa evaluam a doua portiune*/
		System.out.println(true || f);
		System.out.println(t || true);

		/* && si || se numesc short-circuiting operators, pt ca "scurtcircuiteaza" evaluarea intregii expresii in conditiile prezentate
		 *  mai sus */

		/* Demonstratie short-circuiting operators */

		boolean shouldBeTrueInTheEnd = false;

		System.out.println("shouldBeTrueInTheEnd initial value: " + shouldBeTrueInTheEnd);

		System.out.println(false && (shouldBeTrueInTheEnd = true)); // incercati cu true in loc de false aici; comparati rezultatele

		System.out.println("shouldBeTrueInTheEnd final value: " + shouldBeTrueInTheEnd);

		/* ------------------------ operatori pe biti (bitwise) ------------------------------ */

		System.out.println(1 & 2);
		System.out.println(1 & 3);

		System.out.println(1 | 2);

		System.out.println(1 ^ 2);

		/* ------------------------ operatorul ternar (are 3 operanzi) ------------------------------ */
		System.out.println((3 < 2) ? 11 : 22 ); // observati Warningul "dead code"

		boolean trueBool = true;

		System.out.println(trueBool ? 11 : 22);

		/* nu va merge, pt ca syso are return type void, deci nu returneaza nicio valoare, ceea ce ar fi problematic
		 *  cand trueBool e evaluat la true*/
		// int rezultat = trueBool ? (System.out.println("ddd")) : 22;

		// un use case mai realist
		double rezultat = trueBool ? 11.0 : 22.23;

		/* ------------------------ operatori de asignare ------------------------------ */
		int var = 0;
		System.out.println(var+=4); // echivalent cu var = var + 4;

		System.out.println(var-=2); // echivalent cu var = var - 2;

		System.out.println(var%=3); // echivalent cu var = var % 3; (pt ca 2 / 3 = 0, rest 2, deci 2 % 3 = 2 )
	}
}

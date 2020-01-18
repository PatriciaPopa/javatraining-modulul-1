package string_demo;

public class StringAndSbDemo {
	public static void main(String[] args) {

		// In acest bloc de instructiuni, se vor crea 3 referinta (s1, s2, s3), dar numai 2 obiecte/
		// Asta pt ca la literalii de tip String, daca il folosim pe acelasi de mai multe ori
		// toate referintele vor pointa la acelasi obiect (s1 si s3 pointeaza la acelasi obiect)
		// s2 pointeaza la un obiect nou, fiindca am folosit operatorul new
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";

		// Deoarece clasa String e imutabila, pentru fiecare noua concatenare, se va crea un nou obiect (a, ab, abc)
		String s4 = "a";
		s4 += "b";
		s4 += "c";

		StringBuilder sb1 = new StringBuilder("a");
		sb1.append(1);
		sb1.append(2);
		sb1.append(3);

		// System.out.println((1 + 2) + "abc");

		System.out.println(sb1);
	}
}

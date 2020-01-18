package string_demo;

public class StringEqualsDemo {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";
		String s3 = new String("a");
		String s4 = s1;

		Object o1 = new Object();
		Object o2 = new String("a");

		/* Exercitiu: incercati sa scrieti pe hartie outputul la care va asteptati inainte sa rulati codul.
		 * Justificati fiecare raspuns */
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == o1);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(o1));
	}
}

package string_demo;

public class StringAPIMethodsDemo {
	public static void main(String[] args) {
		String s1 = "Hello, World!";

		System.out.println(s1.charAt(0));
		//System.out.println(s1.charAt(-5));
		//System.out.println(s1.charAt(45));

		/* --------------------------------------------------------------------------- */

		String s2 = "Abc";

		System.out.println(s1.compareTo(s2));

		/* ---------------------------------------------------------------------------- */

		String s3 = "He";
		System.out.println(s3.concat("llo!"));
		System.out.println(s3.concat(s2));

		/* ---------------------------------------------------------------------------- */

		System.out.println(s2.contains("b"));
		System.out.println(s2.contains("B"));
		System.out.println(s2.contains("bbb"));
		System.out.println(s2.contains(new StringBuilder("bc")));
		System.out.println(s2.contains(new StringBuilder("cba")));
		System.out.println(s2.contains(new StringBuilder("Abc")));

		/* ---------------------------------------------------------------------------- */

		System.out.println(s3.isEmpty());
		System.out.println("".isEmpty());

		/* ---------------------------------------------------------------------------- */

		System.out.println(s2.length());

		/* ---------------------------------------------------------------------------- */

		String[] listaCumparaturi = {"ceapa", "ulei", "apa", "sare", "sampon"};
		System.out.println(String.join("---", listaCumparaturi));

		/* ---------------------------------------------------------------------------- */

		double sumaInRon = 14.5;
		String sumaCaString = "" + sumaInRon;
		String sumaCaString1 = String.valueOf(sumaInRon); // alta varianta de conversie double in String
		System.out.println("Suma in Ron: " + sumaCaString1);
		System.out.println("Suma formatata: " + sumaCaString1.replace('.', ','));

		String ceva = "**abc*d*e*f**";
		System.out.println(ceva.replace("*", ""));
		System.out.println(ceva.replace("**", ""));

		/* ---------------------------------------------------------------------------- */

		System.out.println("eXemPLu".toLowerCase());
		System.out.println("eXemPLu".toUpperCase());

		/* ---------------------------------------------------------------------------- */

		String s4 = "      88a   ";
		System.out.println(s4.trim());
	}
}

package pasarea_parametrilor_demo;

public class PasareTipReferintaDemo {
	public static void main(String[] args) {
		String s = "abc";
		changeVal(s);

		// valoarea lui n ramane neschimbata, pentru ca la metoda changeVal() am pasat o copie a variabile originale
		System.out.println("Din main, s = " + s);
	}

	private static void changeVal(String s) {
		s = "blabla";
		System.out.println("Din changeVal, s = " + s);
	}
}

package pasarea_parametrilor_demo;

public class ModificareTipReferintaDemo {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abc");
		changeVal(s);

		// valoarea lui n ramane neschimbata, pentru ca la metoda changeVal() am pasat o copie a variabile originale
		System.out.println("Din main, s = " + s);
	}

	private static void changeVal(StringBuilder s) {
		s.append("1");
		System.out.println("Din changeVal, s = " + s);
	}
}


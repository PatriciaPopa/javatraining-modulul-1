package pasarea_parametrilor_demo;

public class PasareTipPrimitivDemo {
	public static void main(String[] args) {
		int n = 5;
		changeVal(n);

		// valoarea lui n ramane neschimbata, pentru ca la metoda changeVal() am pasat o copie a variabile originale
		System.out.println("Din main, n = " + n);
	}

	private static void changeVal(int n) {
		n = 0;
		System.out.println("Din changeVal, n = " + n);
	}
}

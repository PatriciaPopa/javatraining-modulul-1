package static_modifier_demo;

public class PersonajInamic {
	private double scorViata;
	private String nume;

	// nu e obligatoriu sa o initializam, fiindca, la fel ca orice
	// alt membru, va primi valoare default specifica tipului ei de date
	static int instanceCounter = 0;

	// exemple de constante
	private static final double PI = 3.14;
	private static final String MESAJ_STANDARD = "Hello, World!";

	public PersonajInamic(double scorViata, String nume) {
		this.scorViata = scorViata;
		this.nume = nume;
		instanceCounter++;
	}

	@Override
	public String toString() {
		return "PersonajInamic [scorViata=" + scorViata + ", nume=" + nume + ", instanceCounter=" + instanceCounter + "]";
	}

	public static void doSomething() {
		System.out.println("Sunt o metoda statica. Woo! :)");
		System.out.println(instanceCounter);
		// Nu putem accesa un membru (camp sau metoda) ne-static dintr-o metoda
		// statica, fiindca acest camp nu exista daca clasa
		// nu a fost instantiata
		// System.out.println(nume);
		// doNothing();
	}

	public void doNothing() {

		// nerecomandat sa folosim "valori magice", fiindca altii nu vor stii la ce folosesc
		System.out.println("Hello, World!");
		System.out.println(3.14);

		// e recomandat sa le extragem in constante, ca sa le dam un nume expresiv si mai ales ca sa nu trebuiasca
		// sa modificam aceeasi valoare de mai multe ori, daca ne hotaram sa o schimbam
		System.out.println(MESAJ_STANDARD);
		System.out.println(PI);
	}
}

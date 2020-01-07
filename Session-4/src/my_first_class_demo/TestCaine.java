package my_first_class_demo;

public class TestCaine {
	public static void main(String[] args) {
		int[] sir = new int[4];

		Caine caine1 = new Caine();

		Caine caine2 = new Caine("Bichon", "Piki", 1.5, "cafeniu");

		// cum apelam o metoda obisnuita a unei clase (adica NU un constructor sau metoda toString())
		caine1.latra();

		//System.out.println(caine1.toString()); //se poate si asa, dar e nerecomandat
		System.out.println(caine1);

		System.out.println(caine2);

		System.out.println(caine2.rasa);
		// System.out.println(caine2.varsta); //citeste mesajul de eroare

		System.out.println(caine2.getCuloare());

		caine1.setNume("Rex");

		System.out.println(caine1);
	}
}

package static_modifier_demo;

public class StaticDemo {
	public static void main(String[] args) {
		// observati ca variabilele statice sunt initializate chiar
		// inainte de a instantia clasa care le contine
		System.out.println(PersonajInamic.instanceCounter);

		PersonajInamic pi1 = new PersonajInamic(100, "pi1");

		System.out.println(pi1);

		PersonajInamic pi2 = new PersonajInamic(50, "pi2");

		System.out.println(pi1);
		System.out.println(pi2);

		pi1.doSomething(); // observati warningul

		PersonajInamic.doSomething();

		// exemplu cu clasa cu static = null
		pi1 = null;
		pi2 = null;

		// setand cele doua variable pe null, am pierdut referinta catre
		// obiectele de tip PersonajInamic la care pointau

		System.out.println(PersonajInamic.instanceCounter);
	}
}

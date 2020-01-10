package overload_demo;

public class OverloadDemo {
	public static void main(String[] args) {
		add(1, 2); //apeleaza metoda 1, pentru ca by default, literalii intregi sunt considerati de tip int
		add(1.5f, 2.5f);
		add("Hello, ", "World!");
		add(5L, 1L);
		add(4.1, 1.5); //apeleaza metoda 4, pentru ca by default, literalii reali sunt considerati de tip double
		add(1.5, 5.6f);

	}

	// 1 - observati ce se intampla cu apelul add(1, 2) cand comentam aceasta metoda (tineti cursorul pe el si vedeti
	// tipul parametrilor inainte si dupa comentarea metodei
	public static void add(int a, int b) {
		//System.out.println(a+b);
		System.out.println("int called");
	}

	// 2
	public static void add(long a, long b) {
		//System.out.println(a+b);
		System.out.println("long called");
	}

	// 3
	public static void add(float a, float b) {
		//System.out.println(a+b);
		System.out.println("float called");
	}

	// 4
	public static void add(double a, double b) {
		//System.out.println(a+b);
		System.out.println("double called");
	}

	// 5
	public static void add(String a, String b) {
		//System.out.println(a+b);
		System.out.println("String called");
	}
}

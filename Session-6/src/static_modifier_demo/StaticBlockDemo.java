package static_modifier_demo;

public class StaticBlockDemo {
	private static int counter = 9;
	private static final int x;

	static {
		// calcule complexe
		counter = 1;
		x = 6; // un alt mod de a initializa o constanta
	}

	static {
		// calcule complexe
		counter = 5;

		// nu se poate sa ii schimbam valoarea lui x, fiindca e o constanta care a fost deja initializata mai sus
		// x = 6
	}

	public static void main(String[] args) {
		System.out.println(StaticBlockDemo.counter);
	}
}

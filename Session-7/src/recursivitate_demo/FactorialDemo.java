package recursivitate_demo;

public class FactorialDemo {
	public static void main(String[] args) {
		System.out.println(doFactorial(3));
		System.out.println(doFactorial(0));
		System.out.println(doFactorial(5));
	}

	private static int doFactorial(int n) {
		if(n == 0) {
			return 1;
		}

		return n * doFactorial(n-1);
	}
}

package recursivitate_demo;

public class FibonacciDemo {
	public static void main(String[] args) {
		System.out.println(doFibonacci(0));
		System.out.println(doFibonacci(1));
		System.out.println(doFibonacci(4));
		System.out.println(doFibonacci(5));
		System.out.println(doFibonacci(-4));
	}

	private static int doFibonacci(int n) {
		//		if(n < 0) {
		//			System.out.println("Te rog insereaza un numar pozitiv sau zero");
		//			return n;
		//		}
		//
		//		if(n <= 1 ) {
		//			return n;
		//		}

		if(n == 0) {
			return 0;
		}

		if(n == 1) {
			return 1;
		}

		return doFibonacci(n-2) + doFibonacci(n-1);
	}
}

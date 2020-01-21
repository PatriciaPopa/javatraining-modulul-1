package wrappers_demo;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1); // 1 este un int, dar este promovat automat la Integer = Autoboxing
		list.add(2);
		System.out.println(list);

		// argumentul este un Integer, dar metoda asteapta un int. Conversia se face automat = Unboxing
		displayValue(new Integer(5));
	}

	public static void displayValue(int numar) {
		System.out.println(numar);
	}
}

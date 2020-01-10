package overload_demo;

public class PlusWithStringDemo {
	public static void main(String[] args) {
		// il afiseaza pe 1 ca string, pentru ca asa functioneaza operatorul + cand avem un string si un alt tip de date
		System.out.println(1 + "abc");

		// e ca si cum as scrie (1+2) + "abc" - se datoreaza precedentei de stanga a operatorului +
		System.out.println(1 + 2 + "abc");
	}
}

package flow_control_demo;

import java.util.Scanner;

public class ConvertIfElseToSwitchExercise {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Introduceti numarul de bytes, iar eu va voi spune ce tip de date are aceasta marime");

		int numberOfBytes = in.nextInt();

		switch (numberOfBytes) {
		case 1:
			System.out.println("The type is byte");
			break;
		case 2:
			System.out.println("The type is short");
			break;
		case 8:
			System.out.println("The type is long");
			break;
		default:
			System.out.println("Wrong value");
		}
	}
}

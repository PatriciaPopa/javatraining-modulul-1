package flow_control_demo;

import java.util.Scanner;

public class IfElseIfDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Introduceti numarul de bytes, iar eu va voi spune ce tip de date are aceasta marime");

		int numberOfBytes = in.nextInt();

		if(numberOfBytes == 1) {
			System.out.println("The type is byte");
		}
		else if(numberOfBytes == 2){
			System.out.println("The type is short");
		}
		else if(numberOfBytes == 8) {
			System.out.println("The type is long");
		}
		else {
			System.out.println("The type is something else");
		}
	}
}

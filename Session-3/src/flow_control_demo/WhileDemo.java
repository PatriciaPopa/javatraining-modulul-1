package flow_control_demo;

public class WhileDemo {
	public static void main(String[] args) {

		// aceasta este o bucla infinita
		//		while(true) {
		//			System.out.println("Mesaj");
		//		}

		int i = 10;

		while(i > 0) {
			System.out.println(i);
			i--;
			// putem sa crestem/scadem valoarea lui i cu cat vrem noi
		}

		int j = 0;

		while(j < 10) {
			System.out.println(j);
			j++;
		}
	}
}

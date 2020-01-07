package diverse;

import java.util.Arrays;

public class VarargsDemo {
	public static void main(String[] args) {
		// array si varargs sunt echivalente, de aceea putem pasa aici un argument de tip sir
		afiseazaCuvinte(new String[] {"ana","are","mere"});

		// varinta mai simpla si rapida, cu varargs
		afiseazaCuvinte("ana","are","mere","multe");
		//afiseazaCuvinte();

		afiseazaCuvinteSiUnNumar(1, "salut");
	}

	public static void afiseazaCuvinte(String... cuvinte) {
		System.out.println(Arrays.toString(cuvinte));

		System.out.println(cuvinte[0]);
	}

	public static void afiseazaCuvinteSiUnNumar(int numarCuvinte, String... cuvinte) {
		System.out.println(numarCuvinte + " " + Arrays.toString(cuvinte));
	}
}

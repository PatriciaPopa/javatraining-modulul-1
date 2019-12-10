import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr; // declaratie
		arr = new int[5]; // initializare

		// int arr1 []; // merge si asa, dar e mai safe cealalalta varianta

		int[] arr2 = new int[5]; // declaratie + initializare

		int[] arr3 = {1,2,3,4};

		int[] arr4 = null;

		System.out.println(arr4);

		System.out.println(Arrays.toString(arr2));

		System.out.println(Arrays.toString(arr3));

		arr2[0] = 7;

		System.out.println(Arrays.toString(arr2));

		arr2[4] = 11;

		System.out.println(Arrays.toString(arr2));

		// arr2[5] = -33;

		// arr2[-3] = -33;

		String[] arr5 = new String[3];

		String[] arr6 = {"a","b","c"};

		System.out.println(arr6[1]);

		System.out.println(arr6.length);

		int[][] arr7 = {{0,1,0}, {3,0,1,7}, {2}};

		System.out.println(Arrays.deepToString(arr7));

		String[][] listeDeCumparaturi = {{"ciorapi", "sandale"}, {"rosii", "branza", "ceapa"}, {"ceva"}};

		System.out.println("nr liste in lista mare: " + listeDeCumparaturi.length);

		int[][] arr8 = new int[2][];

		System.out.println("inainte " + Arrays.deepToString(arr8));

		arr8[0] = new int[3];
		arr8[1] = new int[1];

		arr8[0][0] = 1;
		arr8[0][1] = 2;
		arr8[0][2] = 3;

		arr8[1][0] = 4;

		System.out.println("dupa" + Arrays.deepToString(arr8));

	}

}

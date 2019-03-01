import java.util.Scanner;

public class Exercise07_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int n = scan.nextInt();

		int data1[] = new int[n];

		for (int i = 0; i < n; i++)
			data1[i] = scan.nextInt();

		System.out.print("Enter list2: ");
		int m = scan.nextInt();
		int data2[] = new int[m];

		for (int j = 0; j < n; j++)
			data2[j] = scan.nextInt();

		boolean check = equals(data1, data2);

		if (check == true)
			System.out.println("Two lists are strictly identical");

		if (check == false)
			System.out.println("Two lists are not strictly identical");
		scan.close();
	}

	public static boolean equals(int[] list1, int[] list2) {
		boolean check = true;

		for (int i = 0; i < list1.length && check; i++) {
			if (list1[i] != list2[i])
				check = false;
		}

		return check;
	}
}

import java.util.Scanner;

public class Exercise07_03 {

	public static void main(String[] args) {
		int[] num = new int[50];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int count = 0;
		int input; // while loop doesn't work because it says input may not have been initialized
		// therefore i use a do-while loop
		do {
			input = scan.nextInt();
			num[count] = input;
			count += 1;
		} while (input != 0);

		countOccurence(num); // display
	}

	public static void countOccurence(int[] array) {
		for (int i = 1; i < 50; i++) {
			int count = 0;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] == i)
					count += 1;
			}
			if (count != 0)
				if (count > 1)
					System.out.println(i + " occurs " + count + " times");
				else
					System.out.println(i + " occurs " + count + " time");
		}
	}
}
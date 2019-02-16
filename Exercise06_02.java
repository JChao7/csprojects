import java.util.Scanner;

public class Exercise06_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long interger: ");

		Long card = new Long(scan.nextLong());
		boolean a = isValid(card);
		System.out.println(card);

		int even = sumOfDoubleEvenPlace(card);
		int odd = sumOfOddPlace(card);
		int digit = getDigit(even, odd);
		System.out.println("The length is: " + getSize(card));

		if (a == true && digit % 10 == 0)
			System.out.println(card + " is valid");
		else
			System.out.println(card + " is not valid");
	}

	public static boolean isValid(long number) {
		boolean result = false;
		String numAsString = Long.toString(number);

		if ((numAsString.length() >= 13) && (numAsString.length() <= 16) && (numAsString.charAt(0) == '4'))
			result = true;

		return result;
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		int i = 0;
		while (number > 0) {
			i++;
			if (i % 2 == 0) {
				sum += number % 10;
			}
			number /= 10;
		}
		System.out.print(sum);
		return sum;
	}

	public static int getDigit(int number, int secondNumber) {
		int total = number + secondNumber;
		System.out.println("The total is: " + total);
		return total;
	}

	public static int sumOfOddPlace(long number) {
		//multiply every nuybmer my 2
		int sum = 0;
		int i = 0;
		while (number > 0) {
			i++;
			if (i % 2 != 0) {
				number *= 2;
				sum += number % 10;
			}
			number /= 10;
		}
		System.out.println(sum);
		return sum;
	}

	public static int getSize(long d) {
		String s = Long.toString(d);
		int length = s.length();
		return length;

	}
}

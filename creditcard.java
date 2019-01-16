import java.util.Scanner;
public class creditcard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter credit card number: ");
		String card = scan.next();
		card.trim();

		//Starting from the rightmost digit, form the sum of every other digit
		int[] sum = new int[card.length()];
		for (int i = 0; i < card.length(); i++) {
			sum[i] = Integer.parseInt(card.substring(i, i + 1));
		}
		
		//Double each of the digits that were not included in the preceding step. 
		//Add all digits of the resulting numbers.
		for (int i = sum.length - 2; i >= 0; i = i - 2) {
			int j = sum[i];
			j = j * 2;
			if (j > 9) {
				j = j % 10 + 1;
			}
			sum[i] = j;
		}
		
		//Add the sums of the two preceding steps. 
		//If the last digit of the result is 0, the number is valid.
		int num = 0;
		for (int i = 0; i < sum.length; i++) {
			num += sum[i];
			}
		
		//valid or not
		if (num % 10 == 0) {
			System.out.println(card + " is a valid credit card number");
			} 
		
		else {
			System.out.println(card + " is an invalid credit card number");
			}	
	}
}

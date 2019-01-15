import java.util.Scanner;
public class Exercise02_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 1000");
		int user_input = scan.nextInt();
		
		if ( (user_input < 0) || (user_input > 1000) ) {		
			System.out.println("Input not valid");
		}
		
		else {
			int sum = 0;
			int number = user_input;
			
			while (number > 0 ) {
				int i = number % 10;
				sum += i;
				number /= 10;
			}
			System.out.println("The sum of all digits in " + user_input + " is "+ sum);
			}
		}
		

	}


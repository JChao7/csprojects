import java.util.Scanner;

public class Exercise04_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two characters(in capital letter): ");
		String user_input = scan.next();
		
		char major = user_input.charAt(0);
		char year = user_input.charAt(1);
		
		//majors
		if (major == 'M') {
			System.out.print("Mathematics ");
		}
		else if (major == 'C') {
			System.out.print("Computer Science ");
		}
		else if (major == 'I') {
			System.out.print("Information Techonology ");
		}
		else {
			System.out.println("Invalid Major ");
		}
		
		//year
		if (year == '1') {
			System.out.println("Freshman");
		}
		else if (year == '2') {
			System.out.println("Sophomore");
		}
		else if (year == '3') {
			System.out.println("Junior");
		}
		else if (year == '4') {
			System.out.println("Senior");
		}
		else {
			System.out.println("Invalid year");
		}
		scan.close();
	}
}

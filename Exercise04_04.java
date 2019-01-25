import java.util.Scanner;

public class Exercise04_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a SSN: ");
		String ssn = scan.nextLine();
		
		if(ssn.length() == 11) {
			if ((ssn.charAt(3) == '-') && (ssn.charAt(6) == '-')) {
				System.out.println(ssn + " is a valid social security number");
				System.exit(0);
			}
		}
		else {
			System.out.println(ssn + " is not a valid social security number");
		}
		scan.close();
	}
}

import java.util.Scanner;

public class Exercise04_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		
		String grade = scan.nextLine();
		int value = 0;
		
		if (grade.equalsIgnoreCase("A"))
			value = 4;
		else if (grade.equalsIgnoreCase("B"))
			value = 3;
		else if (grade.equalsIgnoreCase("C"))
			value = 2;
		else if (grade.equalsIgnoreCase("D"))
			value = 1;
		else if (grade.equalsIgnoreCase("F"))
				value = 0;
		else {
			System.out.println("Invalid grade");
			System.exit(0);
		}
		
		System.out.println("The numeric value for grade " + grade + " is " + value);
		scan.close();
	}
}

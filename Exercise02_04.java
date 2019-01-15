import java.util.Scanner;

public class Exercise02_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		
		double v0 = scan.nextDouble();
		double v1 = scan.nextDouble();
		double t = scan.nextDouble();
		
		//calculation w/ formula
		double avg = (v1 - v0) / t;
		
		System.out.print("The average acceleration is " + avg);
	}

}

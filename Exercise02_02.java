import java.util.Scanner;
public class Exercise02_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");		
		double feet = scan.nextDouble();
		double meters = feet * 0.305;
		
		System.out.println(meters);
	}

}

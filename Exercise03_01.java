import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
		double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
		
		if (discriminant > 0) {
			System.out.println(root1);
			System.out.println(root2);
		}
		
		else if (discriminant == 0) {
			System.out.println(root1);
		}
		
		else {
			System.out.println("The equation has no real roots");
		}
		scan.close();
	}

}

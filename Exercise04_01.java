import java.util.Scanner;

public class Exercise04_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an ASCII code: ");
		int code = scan.nextInt();
		
		if (code > 0 && code < 127) {
			char ascii = (char) code;
			System.out.println("The character for ASCII code " + code + " is " + ascii);
		}
		
		else {
			System.out.println("Invalid number");
		}
		scan.close();
	}
}

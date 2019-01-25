import java.util.Scanner;

public class Exercise04_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string s1: ");
		String s1 = scan.nextLine();
		System.out.println("Enter string s2: ");
		String s2 = scan.nextLine();
		
		if (s1.indexOf(s2) != -1) {
			System.out.println(s2 + " is a substring of " + s1);
		}
		else {
			System.out.println(s2 + " is not a substring of " + s1);
		}
		scan.close();
	}

}

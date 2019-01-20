import java.util.Scanner;

public class Exercise03_04 {

	public static void main(String[] args) {
		System.out.println("Enter your lottery pick (3 digits): ");
		Scanner scan = new Scanner(System.in);
		int user_num = scan.nextInt();
		int lot_num = (int) (Math.random() * 1000 + 100);
		
		//digit from user
		int user_num1 = user_num % 10;
		int user_num2 = user_num / 10 % 10;
		int user_num3 = user_num / 100 % 10;
		
		//digits from lottery
		int lot_num1 = lot_num % 10; 
		int lot_num2 = lot_num / 10 % 10;
		int lot_num3 = lot_num /100 % 10;
		
		if (user_num == lot_num) {
			System.out.println("Lottery is " + lot_num);
			System.out.println("Exact match! You win $10,000");
			}
		else if (user_num1 == lot_num2 && user_num2 == lot_num1 && user_num3 == lot_num3)
		      System.out.println("Match all digits: you win $3,000");
		
		else if (user_num1 == lot_num1 || user_num1 == lot_num2 || user_num1 == lot_num3
		          || user_num2 == lot_num1 || user_num2 == lot_num2 || user_num2 == lot_num3
		          || user_num3 == lot_num1 || user_num3 == lot_num2 || user_num3 == lot_num3)
		      System.out.println("Match one digit: you win $1,000");
		    
		else
		      System.out.println("Sorry, no match"); 
		
		scan.close();
	}

}

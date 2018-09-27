import java.util.Scanner;

public class Divisibleby {

    public static void main(String[] args) {
    // Prompt uswer to enter value
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an interger: ");
	int num = scan.nextInt();

    //is # divisible by 5 AND 6?
    System.out.println("Is " + num + " divisible by 5 AND 6?");
    if ((num % 5==0) && (num % 6==0)){
        System.out.println("True");
    }
    else {
        System.out.println("False");
    }
    
    //is # divisible by 5 OR 6?
    System.out.println("Is " + num + " divisible by 5 OR 6?");
    if ((num % 5==0) || (num % 6==0)){
        System.out.println("True");
    }
    else {
        System.out.println("False");
    } 
    
    //is # deivisible by 5 or 6, but not both?
    System.out.println("Is " + num + " divisible by 5 or 6, but not both?");
    if ((num % 5==0) || (num % 6==0)){
        System.out.println("True");
    }
    else {
        System.out.println("False");
    } 
    scan.close();
    }
}
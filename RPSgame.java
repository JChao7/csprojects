/* Rock, Paper, Scissor game in Java*/

//import scanner for user input and random to generate random value
import java.util.Scanner;
import java.util.Random;

public class Rpsgame {

    public static void main(String[] args) {
    // Prompt uswer to enter value
    Scanner scan = new Scanner(System.in);
    Random rdm = new Random();
    System.out.println("Select rock(1), paper(2), scissor(3): ");
	int userChoice = scan.nextInt();
    int compChoice = rdm.nextInt(3) + 1;

    //if/else statements
    //user input for rock
    if ((userChoice == 1) && (compChoice == 1)) {
        System.out.println("You chose Rock and the computer chose Rock: Tie! Try again.");
    }
    if ((userChoice == 1) && (compChoice == 2)) {
        System.out.println("You chose Rock and the computer chose Paper: Paper covers rock, You lose");
    }
    if ((userChoice == 1) && (compChoice == 3)) {
        System.out.println("You chose Rock and the computer chose Scissor: Rock breaks Scissor, You win");
    }
    
    //user input for Paper
    if ((userChoice == 2) && (compChoice == 1)) {
        System.out.println("You chose Paper and the computer chose Rock: Paper covers rock, You win");
        }   
    if ((userChoice == 2) && (compChoice == 2)) {
        System.out.println("You chose Paper and the computer chose Paper: Tie! Try again.");
    }
    if ((userChoice == 2) && (compChoice == 3)) {
        System.out.println("You chose Paper and the computer chose Scissor: Scissor cut Paper, You lose");
    }
    
    //user input for Scissor
    if ((userChoice == 3) && (compChoice == 1)) {
        System.out.println("You chose Scissor and the computer chose Rock: Rock breaks Scissor, You lose");
        }   
    if ((userChoice == 3) && (compChoice == 2)) {
        System.out.println("You chose Scissor and the computer chose Paper: Scissor cut Paper, You win");
    }
    if ((userChoice == 3) && (compChoice == 3)) {
        System.out.println("You chose Scissor and the computer chose Scissor: Tie! Try again.");
    }
    scan.close();
    }
}
/*** By Jonathan Chao ***/
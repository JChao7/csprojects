import java.util.Scanner;

public class WarGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int ROUND = 10;
		int user, comp, score = 0;
		for (int r = 1; r < ROUND + 1; ++r) {
			comp = genInput();
			user = getInput(scan);
			printRoundInfo(r, user, comp);
			score = printRoundResult(score, user, comp);
		}
		System.out.println("End of Game!");
		scan.close();
	}

	public static int getInput(Scanner num) {
		System.out.println("Enter a number between 1 and 52");
		int input = num.nextInt();
		if ((input >= 1) && (input <= 52)) {
			return input;
		} else {
			System.out.println("Invalid input");
			System.exit(-1);
		}
		return input;
		// TODO: prompt user to enter a number between 1 and 52,
		// then validate and return it
	}

	public static int genInput() {
		int compint = (int) (Math.random() * 52 + 1);
		return compint;
		// TODO : generate and return an integer number between 1 and 52
	}

	public static void printRoundInfo(int r, int user, int comp) {

		System.out.print("R" + r + ": ");
		System.out.print("Computer card is " + getRank(comp) + " of " + getSuit(comp));
		System.out.println("; User card is " + getRank(user) + " of " + getSuit(user));
	}

	public static int printRoundResult(int score, int user, int comp) {
		int winner = findWinner(user, comp);
		switch (winner) {
		case 0:
			score *= 2;
			System.out.println("It’s tie – user score is " + score);
			break;
		case 1:
			score += 1;
			System.out.println("User wins – user score is " + score);
			break;
		default:
			System.out.println("Computer wins – user score is " + score);
			break;
		}
		return score;
	}

	public static int findWinner(int user, int comp) {
		int userScore = user % 13;
		int compScore = comp % 13;
		if (userScore == 0)
			userScore += 13;
		if (compScore == 0)
			compScore += 13;

		if (userScore > compScore)
			return 1;
		if (compScore > userScore)
			return -1;
		else
			return 0;

		// TODO: find the winner and return 0, 1 or -1 if it is tie,
		// user wins or computer wins
		// return 1 return is changeable;
	}

	// add more methods if needed.
	public static String getRank(int getInput) {
		String rank = "";
		switch (getInput % 13) {
		case 1:
			rank += "Ace";
			break;
		case 2:
			rank += "2";
			break;
		case 3:
			rank += "3";
			break;
		case 4:
			rank += "4";
			break;
		case 5:
			rank += "5";
			break;
		case 6:
			rank += "6";
			break;
		case 7:
			rank += "7";
			break;
		case 8:
			rank += "8";
			break;
		case 9:
			rank += "9";
			break;
		case 10:
			rank += "10";
			break;
		case 11:
			rank += "Jack";
			break;
		case 12:
			rank += "Queen";
			break;
		case 0:
			rank += "King";
			break;
		}
		return rank;
	}

	public static String getSuit(int getInput) {
		String suit = "";
		switch (getInput % 4) {
		case 0:
			suit += "Spades";
			break;
		case 1:
			suit += "Hearts";
			break;
		case 2:
			suit += "Clubs";
			break;
		case 3:
			suit += "Diamonds";
			break;
		}
		return suit;
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;

public class MovieRentApp {
	public static void main(String[] args) throws FileNotFoundException {
		Menu();
	}

	// done
	private static void Menu() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Developers");
			System.out.println("2. Search");
			System.out.println("3. Rent");
			System.out.println("4. Return");
			System.out.println("5. Earnings");
			System.out.println("6. Exit");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Created by: Jonathan Chao");
				break;
			case 2:
				Search(input);
				break;
			case 3:
				Rent();
				break;
			case 4:
				Return();
				break;
			case 5:
				Earnings();
				break;
			}
		} while (choice != 6);
		input.close();
		System.exit(0);
	}

	private static void Rent() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Which movies would you like to rent? \ntype e to exit to menu");
		String userInput = input.nextLine();
		while (userInput != "e") {

			// check if we have movie
			// if we do, list price and record transaction to file
		}
		input.close();
	}

	// This method is done?
	private static void Return() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		String filename = "transaction.csv";
		File file = new File(filename);
		Scanner fileInput = new Scanner(file);
		String contents = "a";
		System.out.println("What is your full name?");
		String userName = input.nextLine();
		System.out.println("Which movie would you like to return? \nType e to exit to menu");
		String userInput = input.nextLine();
		// BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

		// while (userInput != "e") {

		// // if (fileInput.indexOf(userInput)) {

		// System.out.println("You have successfully returned " + userInput);

		// contents = userName + " , " + userInput;

		// // writer.write(contents);

		// // } else

		// System.out.println("Sorry, but the title " + userInput + " could not be
		// found. \nPlease try again.");

		// }

		// input.close();

		// fileInput.close();

		// writer.close();

	}

	private static void Earnings() throws FileNotFoundException {

		/*
		 * 
		 * a. Display an aggregated report i. Title of the movie, how many times it was
		 * 
		 * borrowed, rent, and earnings ii. Grand total
		 * 
		 */

		String filename = "transaction.csv";
		File file = new File(filename);
		Scanner fileInput = new Scanner(file);
	}

	private static void Search(Scanner input) throws FileNotFoundException {
		System.out.println("   a. All available movies");
		System.out.println("   b. By genre (e.g Adventure, Horror etc...)");
		System.out.println("   c. By Title");
		System.out.println("   d. Go back to menu");

		String userInput;

		do {
			userInput = input.next();
			userInput.toLowerCase();
			switch (userInput) {

			case "a":
				System.out.println("All available movies: ");
				availableMovie();
				break;

			case "b":
				System.out.println("What type of genre are you looking for? ");
				input.nextLine(); // to clear the buffer
				MovieGenre(input);
				break;

			case "c":
				System.out.println("What is the title of the movie? ");
				MovieTitle();
				break;
			}

		} while (userInput != "d");
	}

	private static void availableMovie() throws FileNotFoundException {
		String fileName = "Movie_Data.csv";
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String data = input.nextLine();
			String[] name = data.split("\"");
			if (name.length != 3)
				name = data.split(",");
			System.out.println(" " + name[1]);
		}
		input.close();
	}

	private static void MovieGenre(Scanner input) throws FileNotFoundException {
		// use index.Of

		System.out.println(
				"Movie genres: \n(1)Horror, (2)Comedy, (3)Action, (4)Drama, (5)Adventure, (6)Crime, (7)Thriller, (8)Romance, (9)Fantasy, (10)Animation, (11)Children");
		String[] genre = { "Horror", "Comedy", "Action", "Drama", "Adventure", "Crime", "Thriller", "Romance",
				"Fantasy", "Animation", "Children" };
		System.out.print("Select a genre:");
		int userGenre = input.nextInt() - 1;
		String fileName = "Movie_Data.csv";
		File file = new File(fileName);
		Scanner fileInput = new Scanner(file);

		while (fileInput.hasNext()) {

			// String data = input.nextLine(); // this is wrong. input is pointing to your
			// keyboard

			String data = fileInput(userGenre);
			String[] name = data.split("\"");
			if (name.length != 3)
				name = data.split(",");
			if (name[0].indexOf(genre[userGenre]) >= 0)
				System.out.println(name[1]); // title
			// STILL NOT DISPLAYING PROPERLY
		}
		fileInput.close();
	}

	private static void MovieTitle() throws FileNotFoundException {
		// display the information (is it currently available? How much to rent the
		// movie?)

		Scanner input = new Scanner(System.in);
		String fileName = "Movie_Data.csv";
		File file = new File(fileName);
		Scanner read = new Scanner(file);
		System.out.println("Enter a movie title");
		String movieTitle = input.nextLine();
		movieTitle.toLowerCase();
		// check in file
	}

}

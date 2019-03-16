
/*
This program menu from 1 to 5 work except for 3
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Checkers {

	public static String board[][] = new String[8][8];

	public static void main(String[] args) {
		initializeBoard();
		menu();
	}

	private static void menu() {
		Scanner scan = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Developer");
			System.out.println("2. Instructions on how to play");
			System.out.println("3. Play");
			System.out.println("4. Show Winners");
			System.out.println("5. Exit");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Created by: Jonathan Chao & Edward Balase");
				break;
			case 2:
				System.out.println("Try and capture all your enemy pieces by jumping over your opponent pieces");
				System.out.println(
						"Each player can only move one piece forward diagonally at a time. \nYou must jump and capture your opponents piece if there is available");
				System.out.print(
						"If you reach the far side of the board, you can promote your piece to king(Upper case letter) and allows it to move in any direction");
				break;
			case 3:
				display();
				break;
			case 4:
				pastwinners();
			}

		} while (choice != 5);
		System.exit(0);
	}

	public static void initializeBoard() {

		int len = board.length;
		for (int row = 0; row < len; row++) {
			for (int col = 0; col < len; col++) {
				board[row][col] = "-";
			}
		}

		for (int col = 0; col < len; col = col + 2) {
			board[0][col] = "r";
			board[1][col + 1] = "r";
			board[2][col] = "r";
			board[5][col + 1] = "b";
			board[6][col] = "b";
			board[7][col + 1] = "b";
		}
		// turn();
	}

	private static void display() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.printf("%3s", board[i][j]);
			}
			System.out.println();
		}
		initializeBoard();

	}

	public static void turn() {
		while (true == true) { // this must be changed, but for now, it's in an infinite loop
			blackTurn();
			redTurn();
		}
	}

	private static void blackTurn() {
		display();
		selectPiece();
		blackDestination();
		movement();
	}

	private static void redTurn() {
		display();
		selectPiece();
		redDestination(selectPiece(), board);
		movement();
	}

	private static void selectPiece() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter column 1-8: ");
		int column = scan.nextInt();
		column = column - 1;
		System.out.println("Enter row 1-8: ");
		int row = scan.nextInt();
		row = row - 1;
	}

	private static void movement() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Left(l) or right(r): ");
		String userInput = scan.next();
		if (userInput.toLowerCase() == "l") {

		}

		if (userInput.toLowerCase() == "r") {

		}

		else
			System.out.print("Error, please select again");
	}

	/*
	 * private static void kingBlack() {
	 * 
	 * }
	 * 
	 * private static void kingRed() {
	 * 
	 * }
	 */

	private static void pastwinners() {
		String currentDirectory = System.getProperty("user.dir");
		JFileChooser jc = new JFileChooser(currentDirectory);

		int returnVal = jc.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = jc.getSelectedFile();
			System.out.println("Filename with complete path: " + jc.getSelectedFile());

			FileReader fr = null;
			try {
				fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);

				String data;

				while ((data = br.readLine()) != null) {
					System.out.println(data);
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				if (fr != null)
					try {
						fr.close();
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
			}

		}
	}

	private static void winner() { // if player has no more valid moves, the
		// OTHER player wins displays and records the winner
		String filename1 = "pastwinners.txt";
		File f1 = new File(filename1);

		try {
			Date objDate = new Date();
			System.out.println("The default date format: " + objDate.toString());

			String result = formatTheDate(objDate, "MMMM d, y");
			System.out.println("using MMMM d, y format: " + result);

			String msg = String.format("%10s | %-10s", result);

			FileWriter fw = new FileWriter(f1, true);
			fw.write(msg + "\n");
			fw.close();

		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

	}

	private static String formatTheDate(Date theDate, String strDateFormat) {
		String result;

		SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
		result = objSDF.format(theDate);
		return result;
	}
}

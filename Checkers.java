import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Checkers {

	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Developer");
		System.out.println("2. Instructions on how to play");
		System.out.println("3. Play");
		System.out.println("4. Show Winners");
		System.out.println("5. Exit");
		int choice = scan.nextInt();
		if ((choice != 3) || (choice != 5)) {
			switch (choice) {
			case 1:
				System.out.println("Created by: Jonathan Chao");
				break;
			case 2:
				System.out.println("Try and capture all your enemy pieces by jumping over your opponent pieces");
				System.out.print(
						"If you reach the far side of the board, you can promote your piece to king and allows it to move in any direction");
				break;
			case 4:
				pastwinners();
			}
		}
		if (choice == 3) {
			move();
		} else
			System.exit(0);
	}

	private static void move() {
		Scanner scan = new Scanner(System.in);
		char[][] board = initializeBoard();
		int col;

		do {
			clear();
			display(board);
			String printturn = turn();
			System.out.println(printturn);
			System.out.print("Pick a column[1-7] or -1 to quit: ");

			col = scan.nextInt();

			switch (col) {
			case 1:
				dropToken('R', col, board);
				break;
			case 2:
				dropToken('R', col, board);
				break;
			case 3:
				dropToken('R', col, board);
				break;
			case 4:
				dropToken('R', col, board);
				break;
			case 5:
				dropToken('R', col, board);
				break;
			case 6:
				dropToken('R', col, board);
				break;
			case 7:
				dropToken('R', col, board);
				break;
			case -1:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid entry");
				break;
			}

		} while (col != -1);
		scan.close();
	}

	private static String turn() {
		int turn = true;

		if ((turn == true) {
			System.out.println("Player 1 turn");
			turn = false;
		} else {
			System.out.println("Player 2 turn");
			turn = true;
		}
		return turn();
	}

	private static void clear() {
		for (int i = 0; i < 25; i++)
			System.out.println();
	}

	private static void dropToken(char token, int column, char[][] board) {
		int index = 0;
		column = column - 1;

		while ((index < 8) && (board[index][column] != ' '))
			index++;

		if (index < 8)
			board[index][column] = token;
	}

	public static char[][] initializeBoard() {

		char[][] board = new char[8][8];
		for (int r = 0; r < 8; r++) {
			for (int c = 0; c < 8; c++) {
				board[r][c] = ' ';
			}
		}
		// pieces

		// black
		board[0][0] = 'B'; // first row
		board[0][2] = 'B';
		board[0][4] = 'B';
		board[0][6] = 'B';
		board[1][1] = 'B'; // second row
		board[1][3] = 'B';
		board[1][5] = 'B';
		board[1][7] = 'B';
		board[2][0] = 'B'; // third row
		board[2][2] = 'B';
		board[2][4] = 'B';
		board[2][6] = 'B';

		// red
		board[7][1] = 'R'; // first row
		board[7][3] = 'R';
		board[7][5] = 'R';
		board[7][7] = 'R';
		board[6][0] = 'R'; // second row
		board[6][2] = 'R';
		board[6][4] = 'R';
		board[6][6] = 'R';
		board[5][1] = 'R'; // third row
		board[5][3] = 'R';
		board[5][5] = 'R';
		board[5][7] = 'R';
		return board;
	}

	private static void display(char[][] board) {
		// board: 6 rows x 7 columns
		// [0][0] represents the bottom leftmost
		// [5][0] represents the top rightmost
		for (int r = 8 - 1; r >= 0; r--) {
			for (int c = 0; c < 8; c++) {
				System.out.printf("|%c", board[r][c]);
			}
			System.out.println("|");
			displayBorderBelow();
			System.out.println();
		}
	}

	private static void displayBorderBelow() {
		for (int c = 0; c < 8; c++) {
			System.out.print("--");
		}
		System.out.print("-");
	}

	private static void pastwinners() {
		String currentDirectory = System.getProperty("user.dir");
		JFileChooser jc = new JFileChooser(currentDirectory);

		int returnVal = jc.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = jc.getSelectedFile();
			System.out.println("Filename with complete path: " + jc.getSelectedFile());

			FileReader fr = null;
			try {
				fr = new FileReader(file); // reads per character
				BufferedReader br = new BufferedReader(fr); // can read Strings

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

	private static void winner() {
		// if player has no more valid moves, the OTHER player wins
		// displays and records the winner
		String filename1 = "pastwinners.txt";
		File f1 = new File(filename1);

		try {
			Date objDate = new Date();
			System.out.println("The default date format: " + objDate.toString());

			String result = formatTheDate(objDate, "MMMM d, y");
			System.out.println("using MMMM d, y format: " + result);

			// String result2 = formatTheDate(objDate, "hh:mm:ss");
			// System.out.println("using hh:mm:ss: " + result2);

			String msg = String.format("%10s | %-10s", result);
			PrintWriter pw = new PrintWriter(f1);
			pw.println(msg);
			pw.close();

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

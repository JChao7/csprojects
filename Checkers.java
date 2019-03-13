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
				winner();
				break;
			case 2:
				System.out.println("Try and capture all your enemy pieces by jumping over your opponent pieces");
				System.out.print(
						"If you reach the far side of the board, you can promote your piece to king(Upper case letter) and allows it to move in any direction");
				break;
			case 4:
				pastwinners();
			}
		}
		if (choice == 3) {
			blackTurn();
		} else
			System.exit(0);
	}

	private static void clear() {
		for (int i = 0; i < 25; i++)
			System.out.println();
	}

	public static void initializeBoard() {
		board[0][0] = "r"; // first row
		board[0][2] = "r";
		board[0][4] = "r";
		board[0][6] = "r";
		board[1][1] = "r"; // second row
		board[1][3] = "r";
		board[1][5] = "r";
		board[1][7] = "r";
		board[2][0] = "r"; // third row
		board[2][2] = "r";
		board[2][4] = "r";
		board[2][6] = "r";

		board[7][1] = "b"; // first row
		board[7][3] = "b";
		board[7][5] = "b";
		board[7][7] = "b";
		board[6][0] = "b"; // second row
		board[6][2] = "b";
		board[6][4] = "b";
		board[6][6] = "b";
		board[5][1] = "b"; // third row
		board[5][3] = "b";
		board[5][5] = "b";
		board[5][7] = "b";
	}

	private static void display() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.printf("%3s", board[i][j]);
			}
			System.out.println();
		} 
		
	}
	
	public static void turn() {
		
	}
	
	private static void blackTurn() {
		display();
		selectPiece();
		blackCheckLocation();
		blackMovement();
	}
	
	private static void redTurn() {
		
	}
	
	private static void selectPiece() {
		Scanner scan = new Scanner(System.in);
		int column = scan.nextInt();
		int row = scan.nextInt();
		
		
	}
	
	private static void redCheckLocation() {
		
	}
	
	private static void blackCheckLocation() {
		
	}
	
	private static void redMovement() {
		
	}
	
	private static void blackMovement() {
		
	}
	
	private static void kingBlack() {
		
	}
	
	private static void kingRed() {
		
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

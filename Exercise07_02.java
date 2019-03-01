import java.util.Scanner;

public class Exercise07_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// number of students
		System.out.println("Enter amount of students: ");
		int n = scan.nextInt();
		int score[] = new int[n];
		System.out.print("Enter " + n + " scores:");

		// getting student scores
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}

		// getting the highest number
		int max = score[0];
		for (int j = 1; j < score.length; j++) {
			if (max < score[j])
				max = score[j];
		}

		// calculating grade
		char grade;
		for (int m = 0; m < score.length; m++) {
			if (score[m] > max - 10) {
				grade = 'A';
				System.out.println("Student " + m + " score is " + score[m] + " and grade is " + grade);
			} else if (score[m] >= max - 20) {
				grade = 'B';
				System.out.println("Student " + m + " score is " + score[m] + " and grade is " + grade);
			} else if (score[m] >= max - 30) {
				grade = 'C';
				System.out.println("Student " + m + " score is " + score[m] + " and grade is " + grade);
			} else if (score[m] >= max - 40) {
				grade = 'D';
				System.out.println("Student " + m + " score is " + score[m] + " and grade is " + grade);
			} else {
				grade = 'F';
				System.out.println("Student " + m + " score is " + score[m] + " and grade is " + grade);
			}
		}
		scan.close();
	}
}

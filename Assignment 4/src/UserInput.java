import java.util.Scanner;

public class UserInput {

    public void run() {
        Scanner userCommandScanner = new Scanner(System.in);
        System.out.print("> ");
        new CommanParser(userCommandScanner);
    }
}

import java.util.Scanner;

public class CommanParser {
    public CommanParser(Scanner input) {

        try {

            boolean exit = false;

            while (!exit && input.hasNextLine()) {
                String userCommand = input.nextLine();

                System.out.println("You entered \"" + userCommand + "\"");

                Scanner lineScanner = new Scanner(userCommand);

                String command = "";
                String createCommand = "";
                String taskName = "";
                int num = 0;

                while (lineScanner.hasNext()) {
                    command = lineScanner.next();
                    createCommand = lineScanner.next();
                    taskName = lineScanner.next();
                    num = Integer.parseInt(lineScanner.next());
                }
                System.out.println();
            }
        } catch (Exception e) {
            //System.out.println("");
        }
    }
}

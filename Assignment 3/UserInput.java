//logic
import java.util.Scanner;
import java.util.ArrayList;

public class UserInput {
private SimulatedSystem system;
private RandomMemoryManagementStrategy ranMemory;
private SimulatedSystem activeAppList;
private SimulatedSystem strategy;


  public UserInput(SimulatedSystem system) {
    this.system = system;
  }

  //asks for user requests
  public void run() {
    // DO NOT REMOVE - BEGIN
    boolean exit = false;
    Scanner userCommandScanner = new Scanner(System.in);
    SimulatedSystem system = new SimulatedSystem(strategy, activeAppList);
    System.out.print("> ");
    while (!exit && userCommandScanner.hasNextLine()) {
      String userCommand = userCommandScanner.nextLine();
    // DO NOT REMOVE - END

      // Replace this with your code
      System.out.println("You entered \"" + userCommand + "\"");

      Scanner lineScanner = new Scanner(userCommand);
      
      String command = "";
      String name = "";
      long memory = 0;

      while(lineScanner.hasNext()) {
        command = lineScanner.next();
        name = lineScanner.next();
        memory = Integer.parseInt(lineScanner.next());
      }
      System.out.println();

      //if statements
      if (userCommand.equals("runApp")) {
        System.out.print("Enter program name and memory: ");
        String program = userCommandScanner.next();
        long proMemory = userCommandScanner.nextLong();
        system.runApp(program, proMemory);
    }

    if (userCommand.equals("listApps")) {
        system.listApps();
    }

    if (userCommand.equals("stopApp")) {
        system.stopApp(activeAppList.size() - 1);
    }

      if (userCommand.equals("exit")) {
        exit = true;
      }
      System.out.print("> ");
    }
  }
}

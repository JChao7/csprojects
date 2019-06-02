//logic
import java.util.ArrayList;
public class RunSystem {
    public static void main(String[] args) {
      int memorySize = Integer.parseInt(args[0]);
      ArrayList<App> activeAppsList = new ArrayList<App>();
  
      // DO NOT REMOVE
      int seed = args.length == 2 ? Integer.parseInt(args[1]) : 0;
  
      RandomMemoryManagementStrategy strategy = new RandomMemoryManagementStrategy(seed);
      SimulatedSystem system = new SimulatedSystem(strategy, activeAppsList);
      UserInput userInput = new UserInput(system);
  
      userInput.run();
    }
  }
  
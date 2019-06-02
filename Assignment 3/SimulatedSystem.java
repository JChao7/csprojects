//logic
import java.util.ArrayList;

public class SimulatedSystem {
  private ArrayList<App> activeAppList;
  private RandomMemoryManagementStrategy strategy;

  //initilize SimulatedSystem with RandomMemoryManagementStrategy and ArrayList
  public SimulatedSystem(RandomMemoryManagementStrategy strategy,
    ArrayList<App> activeAppList) {
    this.activeAppList = activeAppList;
    this.strategy = strategy;
  }

  //add app inputed by user to list
  public void runApp(String appName, long memoryRequired) {
    activeAppList.add(appName);
    System.out.println("Added" + appName);
  }

  //removes app inputed by user from list 
  public void stopApp(int appId) {
    activeAppList.remove(appId);
    System.out.println("Removed " + appId);
  }

  //prints all active apps in the list
  public void listApps() {
    for (int i = 0 ; i < activeAppList.lenght() ; i++)
      System.out.println(activeAppList.get(i));
  }
}
  
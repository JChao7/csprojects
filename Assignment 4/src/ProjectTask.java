import java.util.ArrayList;
public class ProjectTask {
    public ProjectTask() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
    }

    public void isComplete(double completedTasks) {
        if (completedTasks >= 100) {
            System.out.println("All subtasks have been complete");
        }
        else if ((completedTasks >= 50) && (completedTasks <=99) ) {
            System.out.println("More than halfway complete");
        }
        else
            System.out.println("Less than halfway done. Keep going!");
    }

    public void getList(ArrayList<String> list) {
        System.out.println("List contains: ");
        for (int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}

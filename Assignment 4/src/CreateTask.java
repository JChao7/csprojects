public class CreateTask extends BinaryTask {
     public CreateTask(String createCommand, String taskName) {
        if(createCommand == "binary") {
            new BinaryTask() {
                @Override
                public double getCompletion(int currentTime) {
                    return 0;
                }
            };
        }
        else if (createCommand == "percentage") {
            new PercentageTask();
        }
        else if (createCommand == "due") {
            new DueDateTask();
        }
        else if (createCommand == "project") {
            new ProjectTask();
        }
        else
            System.out.println("Sorry please enter a valid Create command");
    }

    @Override
    public double getCompletion(int currentTime) {
        return 0;
    }
}

public class CommandExecution {
    public void execute(CommanParser command) {
        //if statements
        boolean exit = false;
        //1. Create Task
        if (command.equals("create")) {
            //new CreateTask(createCommand, taskName);
        }

        //2. Update Completion
        else if (command.equals("complete")) {
            new CompleteTask();
        }

        //3. Get completion of task
        else if (command.equals("completed")) {

        }

        // 4. list
        else if (command.equals("list")) {
            ProjectTask task = new ProjectTask();
            //this.getList;
        }

        else if (command.equals("exit")) {
            exit = true;
        }
        System.out.print("> ");
    }
}

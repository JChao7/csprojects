public abstract class Task {
    private String taskID;
    private String taskName;

    public abstract double getCompletion(int currentTime);

}

//data
public class App {
    private String name;
    private long memoryRequired;
    private int processId;

    public App(String name, long memoryRequired, int processId) {
        this.name = name;
        this.memoryRequired = memoryRequired;
        this.processId = processId;
    }
    //returns app name
    public String getName() {
        return this.name;
    }
    //returns memory required
    public long getMemoryRequired() {
        return this.memoryRequired;
    }
    //returns processID
    public int getProcessId() {
        return this.processId;
    }
}

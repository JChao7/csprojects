public abstract class BinaryTask extends Task {
    public String BinaryTask(UserInput input) {
        if (Integer.parseInt(String.valueOf(input)) == 1) {
            return "Complete";
        }
        else
            return  "Not complete";
    }
}

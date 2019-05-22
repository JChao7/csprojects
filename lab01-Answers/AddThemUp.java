public class AddThemUp {
  public static void main(String[] args) {
    int total = 0;
    String currentString = "";
    try {
      for (String arg : args) {
        currentString = arg;
        total += Integer.parseInt(arg);
      }
      System.out.println("The total is: " + total);

    } catch (NumberFormatException e) {
      // who's the culprit?
      System.out.println("\"" + currentString + "\" is not an integer. Abort!");
    }
  }
}

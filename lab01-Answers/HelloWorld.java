public class HelloWorld {
  public static void main(String[] args) {
    String name = args.length == 0 ? "" : (" " + args[0]);
    System.out.println("Hello" + name + ", welcome to CPSC 1181!");
  }
}

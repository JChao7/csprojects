import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    SimpleCalculator calculator = new SimpleCalculator();
    calculator.run();
  }

  private String readOperator(Scanner lineScanner) throws InvalidExpressionException{
    String pattern = "[+\\-*/]";
    if (lineScanner.hasNext(pattern)) {
      return lineScanner.next(pattern);
    }
    IllegalArgumentException exception = new IllegalArgumentException("Not a valid operator");
    throw exception;
  }

  private Integer readInteger(Scanner lineScanner) throws InvalidExpressionException{
    if (lineScanner.hasNextInt()) {
      return lineScanner.nextInt();
    }
      IllegalArgumentException exception = new IllegalArgumentException("Not a valid interger");
      throw exception;
  }

  private int calculate(String op, int a, int b) throws InvalidExpressionException {
    switch (op) {
      case "+":
        return a + b;
      case "-":
        return a - b;
      case "*":
        return a * b;
      case "/":
        return a / b;
    }
      IllegalArgumentException exception = new IllegalArgumentException("Cannot calculate with invalid arguments");
      throw exception;
  }

  private void process(String line) {
    // This code here doesn't handle invalid expressions
    // 1) Add a new InvalidExpressionException class
    // 2) throw InvalidExpressionException when the input is invalid
    // 3) add a try-catch in process() and print out "Invalid expression: " + line if InvalidExpressionException is caught
    // 4) throw IllegalArgumentException in calculate if op is not one of + - * /
    //    - what happens if you don't catch IllegalArgumentException? Does the compiler complain?
//    public class InvalidExpressionEception() {
//
//      }
      try {
          Scanner lineScanner = new Scanner(line);
          String op = this.readOperator(lineScanner);
          Integer a = this.readInteger(lineScanner);
          Integer b = this.readInteger(lineScanner);

          int result = this.calculate(op, a, b);
          System.out.println("Result is " + result);
      } catch (Exception e) {
          System.out.println("Invalid expression: " + e);
      }
  }

  public void run() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            process(line);
        }
  }

  public class InvalidExpressionException extends Exception {
    public InvalidExpressionException(String Exception) {
          IllegalArgumentException exception = new IllegalArgumentException(Exception);
      }
  }
}

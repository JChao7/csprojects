public class Base16 {

  // This method takes a number between 0 - 15 and return the respective base16 character
  // e.g. 0 = 0, 10 = A, 11 = B, 15 = F
  public static String singleDigit(long d) {
    // Hint: `switch`
    // Hint 2: Array

    // your work here
    String hexNumber = ""; 
    int num = (int) d;
    switch (num) {
      case 0:
        hexNumber = "0";
        break;
      case 1:
        hexNumber = "1";
        break;
      case 2:
        hexNumber = "2";
        break;
      case 3:
        hexNumber = "3";
        break;
      case 4:
        hexNumber = "4";
        break;
      case 5:
        hexNumber = "5";
        break;
      case 6:
        hexNumber = "6";
        break;
      case 7:
        hexNumber = "7";
        break;
      case 8:
        hexNumber = "8";
        break;
      case 9:
        hexNumber = "9";
        break;
      case 10:
        hexNumber = "A";
        break;
      case 11:
        hexNumber = "B";
        break;
      case 12:
        hexNumber = "C";
        break;
      case 13:
        hexNumber = "D";
        break;  
      case 15:
        hexNumber = "F";
        break;
    }
    return hexNumber;
  }

  public static String convert(long number) {
    // your work here
    int[] array = new int[10];
    int num = (int) number;
    for(int i = 0 ; i < array.length ; i++) {
      double trueRemainder = num / 16;
      int remainder = (int)trueRemainder;
      array[i] = remainder * 16;
      trueRemainder /= 16;
    }

    for(int i = 0 ; i < array.length ; i++)
      System.out.println(array[i]);
      return array;
  }

  public static void main(String[] args) {
    long s1 = 0;
    check("s1", convert(s1), "0");
    long s2 = 10;
    check("s2", convert(s2), "A");
    long s3 = 123;
    check("s3", convert(s3), "7B");
    long s4 = 2343432205L;
    check("s4", convert(s4), "8BADF00D");
    long s5 = 195936478L;
    check("s5", convert(s5), "BADC0DE");
  }

  public static void check(String name, String actual, String expected) {
    if (actual.equals(expected)) {
      System.out.println("Test " + name + " passed");
    } else {
      System.out.println("Test " + name + " failed, (actual = " + actual + ", expected = " + expected);
    }
  }
}

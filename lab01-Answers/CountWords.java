public class CountWords {

  // Hint: sentence.charAt(i) returns the character at position i
  // Hint 2: sentence.trim() returns the same String with
  //         leading and trailing spaces removed
  public static int count(String sentence) {
    // your work here
    String sentTrim = sentence.trim();
    int count = 0;
    char letter;

    if(sentTrim == "")
      return 0;

    for(int i = 0 ; i < sentTrim.length() -1 ; i++) {
      letter = sentence.charAt(i);
      if (sentTrim.length() >= 0) {
        if (letter == ' ')
          count++;
      }
    }
      count = count + 1; 
    return count;
  }

  public static void main(String[] args) {

    String s1 = "";
    check("s1", count(s1), 0);
    String s2 = "Hello";
    check("s2", count(s2), 1);
    String s3 = "Today is sunny";
    check("s3", count(s3), 3);
    String s4 = "Fair is foul, and foul is fair";
    check("s4", count(s4), 7);

    // See if you can make the following pass as well
     String s5 = "    ";
     check("s5", count(s5), 0);
     String s6 = " Hello  ";
     check("s6", count(s6), 1);
     String s7 = " Today   is      very sunny";
     check("s7", count(s7), 4);
  }

  public static void check(String name, int actual, int expected) {
    if (actual == expected) {
      System.out.println("Test " + name + " passed");
    } else {
      System.out.println("Test " + name + " failed, (actual = " + actual + ", expected = " + expected);
    }
  }
}

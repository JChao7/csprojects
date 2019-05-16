/* Luhn Algorithm
 * Example command
 *
 * java -cp out LuhnA1 4485513999294612 4485513999294613 aaa 0
 *
 * The above command would assign `args` with an array of size 4
 * args = { "4485513999294612", "4485513999294613", "aaa", "0" }
 *
 */
public class LuhnA1 {

  public static void isValidLuhnNumber(String str) {
    int totalNumber = 0;
    int multinumber1, multinumber2;
    int sum = 0;
    boolean condition = false;

    for(int i = str.length() - 1 ; i >= 0 ; i --) {
      int multinumber = Integer.parseInt(str.substring(i,i+1));
      if (condition) {
        multinumber += 2;
        
        if (multinumber >= 10) {
        multinumber1 = str.indexOf(0);
        multinumber2 = str.indexOf(1);
        multinumber = multinumber1 + multinumber2;
        multinumber += sum;
        }
      }
      sum += multinumber;
      condition = !condition;
    }

    calculateCheckDigit(totalNumber, str);
  }

  public static void main(String[] args) {
    String str = "";
    for(String arg : args) {
      try{
        str = arg;
        if(isValidUsingCheckDigit(str)) {
          } 
        } catch (NumberFormatException e) {
          System.out.println(str + " not a positive integer of at least 2 digits");
        }
      }
    }

  public static boolean isValidUsingCheckDigit(String str) {
    boolean value = false;
    int num = Integer.parseInt(str);
      if ((num > 0) && (str.length() > 2)) {
        return value = true;
      }
    return value;
  }

  public static void calculateCheckDigit(int totalNumber, String str) {
    totalNumber %= 10;
    if (totalNumber == 0)
            System.out.println(str + " is a Luhn Number!");
        else
            System.out.println(str + " is not a Luhn Number.");
  }
}

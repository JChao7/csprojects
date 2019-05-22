import java.util.ArrayList;

public class ArrayListExperiment {

  private static void printArrayList(ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }

  private static void printArray(String[] ss) {
    for (int i = 0; i < ss.length; i++) {
      System.out.println(ss[i]);
    }
  }

  /**
   * Search the list to see if it contains the string and return the index
   * @param target the string we are searching
   * @param list an ArrayList of String
   * @return index in the ArrayList if found, -1 otherwise
   */
  private static int findPosition(String target, ArrayList<String> list)  {
    int positionOfTarget = -1;
    for (int i = 0; i < list.size(); i++) {
      String s = list.get(i);

      // Use .equals to compare 2 Strings are the same
      if (s.equals(target)) {
        positionOfTarget = i;
      }
    }
    return positionOfTarget;
  }

  public static void main(String[] args) {
    // Declaring a variable of ArrayList
    ArrayList<String> listOfStrings;

    // Creating an ArrayList of String object and assign to listOfStrings
    listOfStrings = new ArrayList<String>();

    // Adding the string "Hello"
    listOfStrings.add("Hello");

    // Removing the object at index 0
    listOfStrings.remove(0);

    // Adding 5 Strings to the list
    for (int i = 0; i < 5; i++) {
      listOfStrings.add("Number " + i);
    }

    // Printing out the ArrayList
    printArrayList(listOfStrings);

    int positionOfNumber3 = findPosition("Number 3", listOfStrings);

    // Remove "Number 3" if it's found
    if (positionOfNumber3 != -1) {
      listOfStrings.remove(positionOfNumber3);
    }

    System.out.println();

    // Let's convert the ArrayList into Array
    String[] arrayOfStrings = listOfStrings.toArray(new String[0]);

    // Printing out the Array
    printArray(arrayOfStrings);
  }
}

import java.util.ArrayList;

public class ArrayListExperiment2 {

    private static void printArrayList(ArrayList<Item> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }

    private static void printArray(Item[] ss) {
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i].getName());
        }
    }

    /**
     * Search the list to see if it contains the string and return the index
     *
     * @param target the string we are searching
     * @param list   an ArrayList of Item
     * @return index in the ArrayList if found, -1 otherwise
     */
    private static int findPosition(String target, ArrayList<Item> list) {
        int positionOfTarget = -1;
        for (int i = 0; i < list.size(); i++) {
            Item s = list.get(i);

            // Use .equals to compare 2 Items are the same
            if (s.getName().equals(target)) {
                positionOfTarget = i;
            }
        }
        return positionOfTarget;
    }

    public static void main(String[] args) {
        // Declaring a variable of ArrayList
        ArrayList<Item> listOfItems;

        // Creating an ArrayList of Item object and assign to listOfItems
        listOfItems = new ArrayList<Item>();

        // Adding the string "Hello"
        listOfItems.add(new Item("Hello"));

        // Removing the object at index 0
        listOfItems.remove(0);

        // Adding 5 Items to the list
        for (int i = 0; i < 5; i++) {
            Item newItem = new Item("Item " + i);
            listOfItems.add(newItem);
        }

        // Printing out the ArrayList
        printArrayList(listOfItems);

        int positionOfItem3 = findPosition("Item 3", listOfItems);

        // Remove "Item 3" if it's found
        if (positionOfItem3 != -1) {
            listOfItems.remove(positionOfItem3);
        }

        System.out.println();

        // Let's convert the ArrayList into Array
        Item[] arrayOfItems = listOfItems.toArray(new Item[0]);

        // Printing out the Array
        printArray(arrayOfItems);
    }
}

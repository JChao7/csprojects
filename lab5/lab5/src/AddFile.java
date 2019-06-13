import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddFile {
  public static void main(String[] args) {
    // Notice that you need to use File.separator to make it work in Windows, OSX and Linux
    File dataFile = new File("data" + File.separator + "addThis");

    // 1) Use scanner to read the file
    try {
        Scanner scan = new Scanner(dataFile);

        int sum = 0;
        while(scan.hasNextInt()) {
            sum += scan.nextInt();
        }
        System.out.println("The sum of all the numbers are " + sum);
    } catch (Exception e) {
        System.out.println("Cannot open file: " + dataFile.getAbsolutePath());
    }
    // 2) Add all the numbers inside the file and print the result
  }
}

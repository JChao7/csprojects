import java.io.File;

public class ReadDir {

  public static void main(String[] args) {
    File src = new File("data");

    // 1) Print to see if "data" is a folder
    //System.out.println(src.isDirectory());
    // 2) List all the files inside the folder
      for (File f : src.listFiles()) {
          System.out.println("|-" + f.getName());
      }
    // 3) Bonus - print all the files inside the folder like a tree

  }
}

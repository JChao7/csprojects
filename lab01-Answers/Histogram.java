public class Histogram {
  public static int[] collect(int[] scores) {
    // Hint: you will need to change "new int[0]"
    int[] frequency = new int[10];

    // your work here

    for (int i: scores) {
      frequency[i / 10]++;
    }
    return frequency;
  }

  public static void main(String[] args) {
    int[] scores = {
        75, 70, 73, 72, 79, 66,
        58, 81, 76, 56, 59, 69,
        73, 74, 61, 68, 73, 86,
        73, 49, 60, 59, 64, 66,
        72, 44, 88, 85, 62, 67
    };

    printResult(collect(scores));
  }

  private static void printResult(int[] frequencies) {
    for (int i = 0; i < frequencies.length; i++) {
      System.out.println(i * 10 + ": " + frequencies[i]);
    }
  }
}

import java.util.Random;

public class RandomMemoryManagementStrategy {
  // DO NOT REMOVE
  private Random randomGenerator;

  public RandomMemoryManagementStrategy(int seed) {
    // DO NOT REMOVE
    this.randomGenerator = new Random(seed);
  }

  /**
   * This generates an integer between 0 and bound-1
   * You should use this to determine which App to terminate in selectNextTerminateTarget
   */
  private int generateInt(int bound) {
    return this.randomGenerator.nextInt(bound);
  }
}

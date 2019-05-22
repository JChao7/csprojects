public class BirdMain {
  private static void test(String testFor, int expected, int actual) {
    String pre = testFor + ": expected = " + expected + ", actual = " + actual;
    String post = expected == actual ? "v" : "x";
    System.out.println(pre + " " + post);
  }

  public static void main(String[] args) {
    Bird lily = new Bird(10, 0);
    test("Lily should be at x = 10", 10, lily.getLocationX());
    test("Lily should be at y = 0", 0, lily.getLocationY());

    test("Lily should not be tired after create", 0, lily.getTired());
    test("Lily should have full energy after create", 15, lily.getEnergy());

    // Lily flies -5 in x-direction
    //  - should be able to fly
    lily.fly(-5, 0);
    System.out.println("After fly(-5, 0)");
    test("Lily should be at x = 5", 5, lily.getLocationX());
    test("Lily should be at y = 0", 0, lily.getLocationY());

    test("Lily is slightly tired", 1, lily.getTired());
    test("Lily should have energy", 10, lily.getEnergy());

    // Lily flies -1 in x-direction and 1 in y-direction
    //  - should be able to fly
    lily.fly(-1, 1);
    System.out.println("After fly(-1, 1)");
    test("Lily should be at x = 4", 4, lily.getLocationX());
    test("Lily should be at y = 1", 1, lily.getLocationY());

    test("Lily is slightly more tired", 2, lily.getTired());
    test("Lily should still have energy", 8, lily.getEnergy());

    // Lily tries to fly -10 in x-direction and 10 in y-direction
    //  - should NOT be able to fly
    lily.fly(-5, 5);
    System.out.println("After fly(-5, 5)");
    test("Lily should stay at x = 4", 4, lily.getLocationX());
    test("Lily should stay at y = 1", 1, lily.getLocationY());

    test("Lily is as tired as before", 2, lily.getTired());
    test("Lily should still have the same energy", 8, lily.getEnergy());

    // Lily rests up
    //  - should be able to fly
    lily.eat();
    lily.fly(-5, 5);
    System.out.println("After eat(), fly(-5, 5)");
    test("Lily should be at x = -1", -1, lily.getLocationX());
    test("Lily should be at y = 6", 6, lily.getLocationY());

    test("Lily is getting tired", 3, lily.getTired());
    test("Lily should have energy", 5, lily.getEnergy());

    lily.fly(0, 0);
    lily.fly(0, 0);
    test("Lily is too tired", 5, lily.getTired());

    lily.fly(1, 0);
    test("Lily is too tired to fly x = -1", -1, lily.getLocationX());
    test("Lily is too tired to fly y = 6", 6, lily.getLocationY());

    Bird bella = new Bird(0, 0);
    bella.fly(-1, 6);
    System.out.println("After bella.fly(-1, 6)");
    test("Bella should be at the same location as Lily (locationX)", lily.getLocationX(), bella.getLocationX());
    test("Bella should be at the same location as Lily (locationY)", lily.getLocationY(), bella.getLocationY());
  }
}

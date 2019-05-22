public class ElevatorDriver {
  public static void main(String[] args) {
    ElevatorSoln elevator = new ElevatorSoln(5);

    System.out.println("Before moving: " + elevator.getFloor());

    elevator.up();
    System.out.println("Moving up 1: " + elevator.getFloor());

    elevator.up(10);
    System.out.println("Moving up 10 more: " + elevator.getFloor());

    elevator.down(10000);
    System.out.println("Moving down 10000: " + elevator.getFloor());
  }
}

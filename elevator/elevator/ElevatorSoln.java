public class ElevatorSoln {
  private int maxFloors;
  private int currentFloor;

  public ElevatorSoln(int maxFloors, int currentFloor) {
    this.maxFloors = maxFloors;
    this.currentFloor = currentFloor;
  }

  public ElevatorSoln(int maxFloors) {
    this(maxFloors, 0);
  }

  public void up(int numFloors) {
    int im = this.currentFloor + numFloors;
    this.currentFloor = im > maxFloors ? maxFloors : im;
  }

  public void up() {
    this.up(1);
  }

  public void down(int numFloors) {
    int im = this.currentFloor - numFloors;
    this.currentFloor = im < 0 ? 0 : im;
  }

  public int getFloor() {
    return this.currentFloor;
  }
}

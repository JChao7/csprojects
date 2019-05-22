public class Bird {
  private int locationX;
  private int locationY;
  private int energy;
  private int tired;

  public Bird(int x, int y) {
    this.locationX = x;
    this.locationY = y;
    this.energy = 15;
    this.tired = 0;
  }
  public int getLocationX() {
    return this.locationX;
  }

  public int getLocationY() {
    return this.locationY;
  }

  public void fly(int moveX, int moveY) {
    if((this.tired < 5) && (this.energy >= Math.abs(moveX) + Math.abs(moveY))) {
      this.tired += 1;
      this.energy -= Math.abs(moveX) + Math.abs(moveY);
      this.locationX = moveX;
      this.locationY = moveY;
    }
    else {
      this.locationX = locationX;
      this.locationY = locationY;
    }
  }

  public void eat() {
    this.energy = 15;
  }

  public int getEnergy(){
    return this.energy;
  }

  public void rest(){
    this.tired = 0;
  }

  public int getTired(){
    return this.tired;
  }
}

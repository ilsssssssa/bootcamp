public class Bus implements Vehicle {
  private int speed;

   @Override
   public boolean test() {
    return true;
   }

  public int getSpeed() {
    return this.speed;
  }
  // setter?

  public boolean isOn() {
    return this.speed > 0;
  }

  public boolean isStopped() {
    return this.speed <= 0;
  }

  public boolean isOverMaxSpeed() {
    return this.speed > Taxi.MAX_SPEED;
  }

  @Override // Let the compiler to validate the relationship of inheritance
  public boolean start() {
    if (isOn())
      return false;
    this.speed = 10;
    return true;
  }

  @Override
  public boolean stop() {
    if (isStopped())
      return false;
    this.speed = 0;
    return true;
  }

  @Override
  public boolean accelerate() {
    if (isStopped())
      return false;
    this.speed += 10;
    if (isOverMaxSpeed())
      this.speed = Taxi.MAX_SPEED;
    return true;
  }

  @Override
  public boolean brake() {
    if (isStopped())
      return false;
    this.speed -= 10;
    return true;
  }

  public static void main(String[] args) {
    Taxi t1 = Taxi.small();
    t1.start();
    t1.accelerate();
    t1.accelerate();
    t1.brake();
    t1.stop();

    System.out.println(Vehicle.x); // 10
  }

}


import javax.xml.crypto.Data;

public class ShareResrouce {

  private boolean hasData = false; // Share Resource

  // 1. both 2 thread starrts at the same time
  // 2. Profucer thread -> "synchronized produce()" -> acquire the lock
  // 3. Consumer thread is waiting outside the door of "synchronized consume()"
  // 4. Producer thread -> producing the data -> notify (叫醒 other threads)
  // 5. Producer thread -> wait() -> release the lock
  // 6. Consumer thread -> get the lock -> get into "synchronized consume()"

  // 1. waiting thread has to be notified by someone
  // 2. synchronized instance method can only be accessed when the thread has the key(lock)

  public synchronized void produce() throws InterruptedException { // if true -> produce // 同步的synchronized
    while (hasData) {
      System.out.println("producer -> self wait ...");
      wait(); // Object.wait() notify() - > obj method
    }
    System.out.println(
        "Thread ID:" + Thread.currentThread().getId() + " Producing data... ");
    Thread.sleep(2000); // simulate produce process...
    hasData = true;
    System.out.println("Produce Data.");
    notify(); // notify consumer thread to proceed
    Thread.sleep(500);
  };


  public synchronized void consume() throws InterruptedException { // if false -> consume消耗
    while (!hasData) {
      System.out.println("consumer -> self wait ...");
      wait(); // wait() control current Thread to sleep
    }
    System.out.println(
        "Thread ID:" + Thread.currentThread().getId() + "Consuming data... "); //
    Thread.sleep(2000); // simulate produce process...
    hasData = false;
    System.out.println("Consumed Data.");
    notify();
    Thread.sleep(500);
  }

  public static void main(String[] args) {
    // Produce
    
    ShareResrouce sharedResrouce = new ShareResrouce(); // obj hold a data (premitive)

    Runnable produceData = () -> {
      try {
        sharedResrouce.produce();
      } catch (InterruptedException e) {

      }
    };

    Runnable consumeData = () -> {
      try {
        sharedResrouce.produce();
      } catch (InterruptedException e) {

      }
    };
    
    Thread producer = new Thread(produceData);
    Thread consumer = new Thread(consumeData);

    producer.start();
    consumer.start();
    
    System.out.println("main ends ...");








  }

}

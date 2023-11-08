package threads;

// We can use this implementation because if you need to extend for another class, Runnable allows you but Thread doesn't
public class MyRunnable implements Runnable {
  @Override
  public void run() {
    for (int x = 0; x < 5; x++) {
      System.out.println("Tread: " + Thread.currentThread().getId() + " | Index: " + x);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.err.println("The thread " + Thread.currentThread().getId() + " was interrupted");
      }
    }
  }

  public static void main(String[] args) {
    MyRunnable r1 = new MyRunnable();
    MyRunnable r2 = new MyRunnable();

    // Set the Runnable instances inside the thread
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);

    // Use Start to execute the thread, because if invoke run() I will execute only the method
    t1.start();
    t2.start();
  }
}

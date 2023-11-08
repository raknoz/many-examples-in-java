package threads;

public class MyThread extends Thread {

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
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();

    // Use Start to execute the thread, because if invoke run() I will execute only the method
    t1.start();
    t2.start();
  }
}

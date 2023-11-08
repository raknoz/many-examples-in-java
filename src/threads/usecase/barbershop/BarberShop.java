package threads.usecase.barbershop;

import java.util.LinkedList;
import java.util.Queue;

public class BarberShop {

  private static final int MAX_ATTENDANTS = 3;
  private final Queue<Client> clientQueue = new LinkedList<>();

  //  This class is useful to 'lock' threads and process accurate synchronized methods
  private final Object lock = new Object();

  // Num of threads that this app will be needed -> MAX_ATTENDANTS
  private final Thread[] attenders;

  public BarberShop() {
    // Create the array and add the max number of attenders
    attenders = new Thread[MAX_ATTENDANTS];
    for (int a = 0; a < MAX_ATTENDANTS; a++) {
      attenders[a] = new Thread(new Attendant(this, "Attendant-" + a));
    }
  }

  // Init activity
  public void openLocal() {
    for (Thread attendant : attenders) {
      attendant.start();
    }
  }

  public void addClient(Client client) {
    synchronized (lock) {
      // Method to add a new client to the queue
      clientQueue.offer(client);
      // Notify to the rest of threads that this resource is free again for the net thread
      lock.notify();
    }
  }

  public Client getNextClient() throws InterruptedException {
    synchronized (lock) {
      while (clientQueue.isEmpty()) {
        // Method to stop the thread until the process finished. In this case the thread will wait until a client will be added
        System.out.println("No clients to be attended!");
        lock.wait();
      }
      // Return and remove the first element of the queue. If is empty, return null
      return clientQueue.poll();
    }
  }

}

package threads.usecase.barbershop;

import java.util.Random;

public class Attendant implements Runnable {
  private final BarberShop barberShop;
  private final String name;

  public Attendant(BarberShop barberShop, String name) {
    this.barberShop = barberShop;
    this.name = name;
  }

  @Override
  public void run() {
    Random random = new Random();
    try {
      while (true) {
        Client client = barberShop.getNextClient();
        System.out.println("The attendant: " + name + " started to attend the client: " + client.getName());
        int timer = (random.nextInt(10) + 1) * 1000;
        Thread.sleep(timer);
        System.out.println(
            "Attendant: " + name + " finished to attend the client: " + client.getName() + " in " + timer + " sec.");
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}

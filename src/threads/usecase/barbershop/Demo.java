package threads.usecase.barbershop;

import java.util.stream.IntStream;

public class Demo {

  public static void main(String[] args) {
    BarberShop barberShop = new BarberShop();
    IntStream.range(0, 10).forEach(c -> {
          Client tmpCli = new Client("cli-" + c);
          System.out.println("Add new client: " + tmpCli.getName());
          barberShop.addClient(tmpCli);
        }
    );
    System.out.println("Open local!");
    barberShop.openLocal();
  }
}

package threads.usecase.barbershop;

public class Client {
  private String name;

  private Client() {
  }

  public Client(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

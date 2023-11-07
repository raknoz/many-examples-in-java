package design.patterns.singleton;

public class Singleton {

  private static final Singleton instance = new Singleton();

  //Make the constructor private so that this class cannot be instantiated
  private Singleton() {
  }

  //Get the only object available
  public static Singleton getInstance() {
    return instance;
  }
}

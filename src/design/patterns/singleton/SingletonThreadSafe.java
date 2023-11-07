package design.patterns.singleton;

public class SingletonThreadSafe {

  private static volatile SingletonThreadSafe instance;

  private SingletonThreadSafe() {
  }

  public static SingletonThreadSafe getInstance() {
    if (instance == null) {
      synchronized (SingletonThreadSafe.class) {
        // double check Singleton instance
        if (instance == null) {
          instance = new SingletonThreadSafe();
        }
      }
    }
    return instance;
  }
}

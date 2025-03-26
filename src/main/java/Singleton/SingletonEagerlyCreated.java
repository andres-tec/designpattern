package Singleton;

/**
 * this is thread safe and guarantees creating just one instance of the class
 * this relies on the JVM to create the instance.
 */
public class SingletonEagerlyCreated {
    private static SingletonEagerlyCreated uniqueInstance = new SingletonEagerlyCreated();

  private SingletonEagerlyCreated(){
  }

  public static SingletonEagerlyCreated getInstnce(){
      return uniqueInstance;
  }

}

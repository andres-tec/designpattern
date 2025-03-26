package Singleton;

public class SingletonDoubleCheckedLocking {
    private volatile static SingletonDoubleCheckedLocking uniqueInstance;

    private SingletonDoubleCheckedLocking(){

    }

    public static SingletonDoubleCheckedLocking getInstance(){
        if (uniqueInstance!=null){
            synchronized (SingletonDoubleCheckedLocking.class){
                if (uniqueInstance!=null){
                    uniqueInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }
}

package Singleton;

/**
 * since this ain't multi Thread safe many issues might potentially arise
 * at runtime
 */
public class Singleton_No_Thread_Safe {
    private boolean empty;
    private boolean boiled;
    private static Singleton_No_Thread_Safe uniqueInstance;

    private Singleton_No_Thread_Safe(){
        empty = true;
        boiled = false;
    }

    public static Singleton_No_Thread_Safe getSingleton_No_Thread_Safe_Instance(){
            if (uniqueInstance==null){
                uniqueInstance = new Singleton_No_Thread_Safe();
            }
            return uniqueInstance;
    }

    public void fill(){
        if (isEmpty()){
            empty=false;
            boiled = false;
        }
    }
    public boolean isEmpty(){
        return empty;
    }
}

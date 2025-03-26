package Singleton;


//the issue with this way to create singleton classes is that the performance decreases significantly
//when many Threads want to have access to the global access point since each one has to wait until
//the method is Available

public class SingletonMultiThreading {
    private static SingletonMultiThreading uniqueInstance;
    //other useful instance variable here

    private SingletonMultiThreading(){

    }

    /**
     * this is called lazily creation
     * @return unique instance
     */
    public static synchronized SingletonMultiThreading getInstance(){
        if (uniqueInstance==null){
            uniqueInstance = new SingletonMultiThreading();

        }
        return uniqueInstance;
    }


    //other useful methods here
}

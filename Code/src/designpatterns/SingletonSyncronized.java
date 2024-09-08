package designpatterns;

public class SingletonSyncronized {
    // Volatile ensures that multiple threads handle the instance variable correctly.
    private static volatile SingletonSyncronized instance;

    // Private constructor to prevent instantiation
    private SingletonSyncronized() {
        // Prevent instantiation
    }

    public static SingletonSyncronized getInstance() {
        if (instance == null) {
            synchronized (SingletonSyncronized.class) {
                if (instance == null) { 
                    instance = new SingletonSyncronized();
                }
            }
        }
        return instance;
    }
}


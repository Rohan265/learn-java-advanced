package designpatterns;

public class Singleton {

    // Private constructor to prevent instantiation
    private Singleton() {
    }

    // Inner static helper class responsible for holding the Singleton instance
    private static class SingletonHelper {
        // The Singleton instance is created only when the SingletonHelper class is loaded
        private static final Singleton INSTANCE = new Singleton();
    }

    // Provides the global point of access to the Singleton instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

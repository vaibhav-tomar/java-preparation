package singleton;

public class SingletonClassThreadSafe {

    private static SingletonClassThreadSafe instance;

    private SingletonClassThreadSafe() {

    }

    //This solution requires that every thread be synchronized when in reality only the first few need to be.
    public synchronized SingletonClassThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonClassThreadSafe();
        }
        return instance;
    }
}

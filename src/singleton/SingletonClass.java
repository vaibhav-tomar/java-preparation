package singleton;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {

    }

    public SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

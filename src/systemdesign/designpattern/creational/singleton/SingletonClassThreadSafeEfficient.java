package systemdesign.designpattern.creational.singleton;

public class SingletonClassThreadSafeEfficient {

    private static SingletonClassThreadSafeEfficient instance;

    private SingletonClassThreadSafeEfficient() {

    }


    public SingletonClassThreadSafeEfficient getInstance() {
        if (instance == null) {
            synchronized (SingletonClassThreadSafeEfficient.class) {
                if (instance == null) {
                    instance = new SingletonClassThreadSafeEfficient();
                }
            }
        }
        return instance;
    }
}

package systemdesign.designpattern.creational.singleton;

public class SingletonClass {

    // this field should be private
    private static SingletonClass instance;

    // this constructor must be private
    private SingletonClass() {

    }

    public SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}

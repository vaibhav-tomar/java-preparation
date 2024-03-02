package systemdesign.designpattern.creational.prototypedesignpattern;

public class Student implements Prototype {

    int id;
    int age;
    private int rollNumber;

    Student(int id, int age, int rollNumber) {
        this.id = id;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                '}';
    }

    @Override
    public Prototype clone() {
        return new Student(id, age, rollNumber);
    }
}

package systemdesign.designpattern.creational.prototypedesignpattern;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, 24, 4565);
        Student clone = (Student) student.clone();
        System.out.println(clone);
    }
}

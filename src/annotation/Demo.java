package annotation;

import java.lang.annotation.Annotation;

/**
 * @author vaibhav
 * created on 25-02-2024
 */

@MyCustomAnnotation(name = "abhishek", value = 10)
public class Demo {
    public static void main(String[] args) {

        Demo demo = new Demo();
        Class aClass = demo.getClass();
        Annotation annotation = aClass.getAnnotation(MyCustomAnnotation.class);
        MyCustomAnnotation myAnno1 = (MyCustomAnnotation) annotation;
        System.out.println(myAnno1.name());
        System.out.println(myAnno1.value());
        System.out.println(myAnno1.city());
    }
}

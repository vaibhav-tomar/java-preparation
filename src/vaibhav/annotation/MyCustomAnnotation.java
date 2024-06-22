package vaibhav.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author vaibhav
 * created on 25-02-2024
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyCustomAnnotation {
    int value() default 0;

    String city() default "Delhi";

    String name() default "vaibhav";

}


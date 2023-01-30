package Task3;

import java.lang.annotation.*;



@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Superpowers{
    String superpowers() default "None";
}




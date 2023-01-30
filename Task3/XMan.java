package Task3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

//@Superpowers(superpowers = "Metal Claws")
public class XMan extends Mutant{

}

class Main{
    public static void main(String[] args) {
        XMan wolverine = new XMan();

        Annotation[] annotations = wolverine.getClass().getAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        Method[] anMethods = wolverine.getClass().getMethods();

        for (Method method : anMethods) {
            Annotation[] methodAnnotation = method.getAnnotations();
            for (Annotation annotation : methodAnnotation) {
                System.out.println(annotation);
            }
        }
    }
}

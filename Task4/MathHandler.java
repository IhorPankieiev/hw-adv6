package Task4;

import java.lang.reflect.Method;

public class MathHandler {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        MathHandler mathHandler = new MathHandler();

        Class<?> cl = mathHandler.getClass();
        try {
            Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
            Math math = method.getAnnotation(Math.class);
            mathHandler.mathSum(math.num1(), math.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

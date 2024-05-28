package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;

import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {

        for (Method method : Address.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Inspect.class)) {
                try {
                    System.out.println("Method " + method.getName() + " returns a value of type " + method.getReturnType() + ". ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

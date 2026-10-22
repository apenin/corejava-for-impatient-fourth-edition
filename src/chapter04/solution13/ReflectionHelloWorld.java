package chapter04.solution13;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionHelloWorld {
    public static void main(String[] args) throws Exception {
        Field outField = System.class.getField("out");
        Class<?> outType = outField.getType();

        Method printlnMethod = outType.getMethod("println", String.class);
        printlnMethod.invoke(outField.get(null), "Hello World!");
    }
}

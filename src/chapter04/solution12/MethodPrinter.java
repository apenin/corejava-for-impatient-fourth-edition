package chapter04.solution12;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.StringJoiner;

public class MethodPrinter {
    public static void main(String[] args) {
        Class<?> cl = int[].class;
        while (cl != null) {
            System.out.println("=== " + cl.getCanonicalName() + " ===");
            for (Method m : cl.getDeclaredMethods()) {
                StringJoiner sj = new StringJoiner(", ", "(", ")");
                for (Parameter p : m.getParameters()) {
                    sj.add(p.getType().getName());
                }

                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " +
                        m.getReturnType().getCanonicalName() + " " +
                        m.getName() + sj
                );
            }
            cl = cl.getSuperclass();
        }
    }
}

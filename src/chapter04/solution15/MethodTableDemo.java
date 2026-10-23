package chapter04.solution15;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.DoubleFunction;

public class MethodTableDemo {
    /**
     * Prints a table of values for a static method with a single parameter of type double (or Double).
     *
     * @param m the method to call; it must be static and accept a double/Double
     * @param low the lower bound of the range (inclusive)
     * @param high the upper bound of the range (inclusive)
     * @param step the step; it must be positive
     */
    public static void methodTable(Method m, double low, double high, double step) throws ReflectiveOperationException {
        if (!Modifier.isStatic(m.getModifiers())) {
            throw new IllegalArgumentException("The method must be static: " + m.getName());
        }

        Class<?>[] params = m.getParameterTypes();
        if (params.length != 1 || (params[0] != double.class && params[0] != Double.class)) {
            throw new IllegalArgumentException("The method must accept exactly one parameter of type double/Double: " + m);
        }

        if (step <= 0) {
            throw new IllegalArgumentException("The step must be positive: " + step);
        }

        m.setAccessible(true);

        System.out.printf("=== Method: %s ===%n", m.getName());
        System.out.printf("%10s | %s%n", "x", "f(x)");
        System.out.println("-----------+--------------------------------");
        for (double x = low; x <= high + 1e-9; x += step) {
            Object result = m.invoke(null, x);
            System.out.printf("%10.4f | %s%n", x, result);
        }
        System.out.println();
    }

    /**
     * Prints a table of values for a function `double -> Object`.
     */
    public static void functionTable(DoubleFunction<Object> f, String name, double low, double high, double step) {
        if (step <= 0) {
            throw new IllegalArgumentException("The step must be positive: " + step);
        }

        System.out.printf("=== DoubleFunction: %s ===%n", name);
        System.out.printf("%10s | %s%n", "x", "f(x)");
        System.out.println("-----------+--------------------------------");
        for (double x = low; x <= high + 1e-9; x += step) {
            System.out.printf("%10.4f | %s%n", x, f.apply(x));
        }
        System.out.println();
    }

    public static void main(String[] args) throws ReflectiveOperationException {
        // --- Reflection ---
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        Method toHex = Double.class.getMethod("toHexString", double.class);

        methodTable(sqrt, 1, 10, 1);
        methodTable(toHex, 1, 10, 1);

        // --- DoubleFunction ---
        functionTable(Math::sqrt, "Math.sqrt", 1, 10, 1);
        functionTable(Double::toHexString, "Double.toHexString", 1, 10, 1);
    }
}

package chapter04.solution14;

import java.lang.reflect.Method;

public class PerformanceDemo {
    public static void main(String[] args) throws Exception {
        Person harry = new Person("Harry");
        Method nameMethod = Person.class.getMethod("name");

        for (int i = 0; i < 100_000; i++) {
            harry.name();
            nameMethod.invoke(harry);
        }

        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            harry.name();
        }
        long regularNanos = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            nameMethod.invoke(harry);
        }
        long reflectionNanos = System.nanoTime() - start;

        System.out.printf("Regular: %.3f ns/call%n", (double) regularNanos / 1_000_000);
        System.out.printf("Reflection: %.3f nc/call%n", (double) reflectionNanos / 1_000_000);
    }
}

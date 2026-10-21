package chapter04.solution10;

import java.util.ArrayList;
import java.util.List;

public class ClassNameDemo {
    static class Outer {
        class Inner { }
    }

    public static void main(String[] args) {
        print("int (primitive)", int.class);
        print("void", void.class);
        print("int[]", int[].class);
        print("String[][]", String[][].class);
        print("String (usual class)", String.class);
        print("List (generic interface)", List.class);
        print("ArrayList (generic class)", ArrayList.class);
        print("Outer (outer class)", Outer.class);
        print("Outer.Inner (inner class)", Outer.Inner.class);

        Runnable anonymous = new Runnable() {
            @Override public void run() { }
        };
        print("Anonymous class (Runnable)", anonymous.getClass());

        Runnable lambda = () -> { };
        print("Lambda (Runnable)", lambda.getClass());
    }

    static void print(String label, Class<?> clazz) {
        System.out.println("=== " + label + " ===");
        System.out.println("getName():          " + clazz.getName());
        System.out.println("getTypeName():      " + clazz.getTypeName());
        System.out.println("getCanonicalName(): " + clazz.getCanonicalName());
        System.out.println("getSimpleName():    " + clazz.getSimpleName());
        System.out.println("toString():         " + clazz);
        System.out.println("toGenericString():  " + clazz.toGenericString());
        System.out.println();
    }
}

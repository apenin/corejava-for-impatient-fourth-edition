package chapter02;

public class Solution04 {
    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.printf("x and y before swap: %d %d%n", x, y);
        swapInt(x, y);
        System.out.printf("x and y after swap: %d %d%n", x, y);

        Integer obj1 = 5, obj2 = 10;
        System.out.printf("obj1 and obj2 before swap: %d %d%n", obj1, obj2);
        swapInteger(obj1, obj2);
        System.out.printf("obj1 and obj2 after swap: %d %d%n", obj1, obj2);

        IntHolder holder1 = new IntHolder(5);
        IntHolder holder2 = new IntHolder(10);
        System.out.printf("holder1 and holder2 before swap: %d %d%n", holder1.value, holder2.value);
        swapIntHolder(holder1, holder2);
        System.out.printf("holder1 and holder2 after swap: %d %d%n", holder1.value, holder2.value);
    }

    /**
     * In Java, you cannot implement a method that swaps the values of two int variables
     * because all parameters in Java are passed by value.
     * This means that the swapInt method receives copies of the variables x and y,
     * so the method swaps the values of those copies and does not affect the original variables.
     * @param a first variable
     * @param b second variable
     */
    public static void swapInt(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    /**
     * You also cannot swap the contents of two Integer objects,
     * again because of Java's pass-by-value mechanism.
     * The parameters i and j receive copies of obj1 and obj2.
     * Changes inside swapInteger do not affect the original obj1 and obj2.
     * @param i first object
     * @param j second object
     */
    public static void swapInteger(Integer i, Integer j) {
        Integer temp = i;
        i = j;
        j = temp;
    }

    /**
     * Although the parameters a and b of the swapIntHolder method are copies of the values
     * of the variables holder1 and holder2, these copies contain references to the same objects
     * that holder1 and holder2 refer to. Since the IntHolder class is mutable, we can use the
     * copies a and b to change the state of the original objects that the original variables
     * holder1 and holder2 pointed to. Consequently, when the swapIntHolder method is called,
     * the values of the variables will be swapped.
     * @param a first object
     * @param b second object
     */
    public static void swapIntHolder(IntHolder a, IntHolder b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}

/**
 * Since the org.omg.CORBA.IntHolder class has been removed from the library in JDK 21,
 * let's write our own simple implementation.
 */
class IntHolder {
    public int value;

    public IntHolder(int value) {
        this.value = value;
    }
}

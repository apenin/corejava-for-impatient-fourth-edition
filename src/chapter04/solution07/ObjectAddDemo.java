package chapter04.solution07;

public class ObjectAddDemo {
    public static Object add(Object first, Object second) {
        if (first instanceof Number number1 && second instanceof Number number2) {
            return number1.doubleValue() + number2.doubleValue();
        } else if (first instanceof Boolean b1 && second instanceof Boolean b2) {
            return b1 || b2;
        } else {
            return "" + first + second;
        }
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2)); // 3.0
        System.out.println(add(1.1, -2.2)); // -1.1
        System.out.println(add(100.234, -100.234)); // 0.0

        System.out.println(add(true, true)); // true
        System.out.println(add(false, true)); // true
        System.out.println(add(true, false)); // true
        System.out.println(add(false, false)); // false

        System.out.println(add(null, false)); // nullfalse
        System.out.println(add(1.1, null)); // 1.1null
        System.out.println(add(null, null)); // nullnull

        System.out.println(add("3", 4)); // 34
        System.out.println(add(true, "hello")); // truehello
        System.out.println(add("12", "big")); // 12big
    }
}

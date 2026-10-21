package chapter04.solution11;

public class UniversalStringDemo {

    static class Node {
        String name;
        Node next;
        Node(String name) { this.name = name; }
    }

    record Point(int x, int y) {}

    static class Person {
        private final String name;
        private final int age;
        private final String[] hobbies;

        Person(String name, int age, String[] hobbies) {
            this.name = name;
            this.age = age;
            this.hobbies = hobbies;
        }
    }

    public static void main(String[] args) {
        // 1. Usual object (record)
        System.out.println(UniversalToString.toString(new Point(3, 4)));

        // 2. Object with an array and primitives
        System.out.println(UniversalToString.toString(new Person("Alice", 30, new String[] {"chess", "run"})));

        // 3. Arrays
        System.out.println(UniversalToString.toString(new int[] {1, 2, 3}));
        System.out.println(UniversalToString.toString(new String[] {"x", "y"}));
        System.out.println(UniversalToString.toString(new int[][] { {1, 2}, {3, 4} }));

        // 4. Cyclic reference
        Node a = new Node("a");
        Node b = new Node("b");
        a.next = b;
        b.next = a;
        System.out.println(UniversalToString.toString(a));

        // 5. Self-reference
        Node self = new Node("self");
        self.next = self;
        System.out.println(UniversalToString.toString(self));

        // 6. null
        System.out.println(UniversalToString.toString(null));
    }
}

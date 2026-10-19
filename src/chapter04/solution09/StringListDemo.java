package chapter04.solution09;

public class StringListDemo {
    public static void main(String[] args) {
        StringList empty = StringList.empty();
        StringList one = StringList.of("a");
        StringList abc = StringList.of("a", "b", "c");
        StringList de = StringList.of("d", "e");

        System.out.println("empty.size() = " + empty.size()); // 0
        System.out.println("one.size() = " + one.size()); // 1
        System.out.println("abc.size() = " + abc.size()); // 3
        System.out.println("abc.append().size() = " + abc.append(de).size()); // 5
        System.out.println("empty.append(abc).size() = " + empty.append(abc).size()); // 3
        System.out.println("abc.append(empty).size() = " + abc.append(empty).size()); // 3
    }
}

package chapter02.solution18;

public class QueueDemo {
    public static void main(String[] args) {
        Queue newQueue = new Queue();

        newQueue.add("String1");
        newQueue.add("String2");
        newQueue.add("String3");

        var iter1 = newQueue.iterator();
        while (iter1.hasNext()) {
            System.out.println("Iter1 value: " + iter1.next());
        }
        System.out.println();

        var iter2 = newQueue.iterator();
        while (iter2.hasNext()) {
            System.out.println("Iter2 value: " + iter2.next());
        }
        System.out.println();
    }
}

package chapter02.solution17;

public class QueueDemo {
    public static void main(String[] args) {
        Queue newQueue = new Queue();

        newQueue.add("String1");
        newQueue.add("String2");
        newQueue.add("String3");

        System.out.println("Removed node: " + newQueue.remove());
        System.out.println("Removed node: " + newQueue.remove());
        System.out.println("Removed node: " + newQueue.remove());
    }
}

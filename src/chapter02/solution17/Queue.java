package chapter02.solution17;

import java.util.NoSuchElementException;

public class Queue {
    private static class Node {
        private final String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    public void add(String value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public String remove() {
       if (head == null) {
           throw new NoSuchElementException("Queue is empty");
       }
       String value = head.value;
       head = head.next;
       if (head == null) {
           tail = null;
       }
       return value;
    }
}

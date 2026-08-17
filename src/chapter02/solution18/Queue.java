package chapter02.solution18;

import java.util.NoSuchElementException;

public class Queue {
    private static class Node {
        private final String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }
    }

    public class Iterator {
        private Node currentNode;

        public Iterator() {
            this.currentNode = head;
        }

        public String next() {
            if (currentNode == null) {
                throw new NoSuchElementException("No elements: iterating is finished");
            }

            var value = currentNode.value;
            currentNode = currentNode.next;

            return value;
        }

        public boolean hasNext() {
            return currentNode != null;
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

    public Iterator iterator() {
        return new Iterator();
    }
}

package chapter03.solution09;

public class GreeterDemo {
    public static void main(String[] args) {
        new Thread(new Greeter("Alex", 50)).start();
        new Thread(new Greeter("Anna", 30)).start();
    }
}

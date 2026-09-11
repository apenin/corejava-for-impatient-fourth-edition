package chapter03.solution09;

public class Greeter implements Runnable {
    private final String target;
    private final int n;

    public Greeter(String target, int n) {
        this.target = target;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.printf("Hello, %s%n", target);
        }
    }
}

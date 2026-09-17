package chapter03.solution16;

public class RandomSequenceDemo {
    public static void main(String[] args) {
        var randomSequence = RandomUtils.randomInts(1, 10);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSequence.next());
        }
    }
}

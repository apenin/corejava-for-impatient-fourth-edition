package chapter03.solution05;

public class IntSequenceConstantMethodDemo {
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.constant(1);

        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}

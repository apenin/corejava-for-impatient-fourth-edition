package chapter03.solution07;

public class DigitSequenceDemo {
    public static void main(String[] args) {
        DigitSequence sequence = new DigitSequence(1234);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
    }
}

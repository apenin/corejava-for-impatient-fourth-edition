package chapter03.solution06;

public class SquareSequenceDemo {
    public static void main(String[] args) {
        var squareSequence = new SquareSequence();

        int i = 0;
        while (i <= (int) Math.sqrt(Integer.MAX_VALUE) + 100) {
            if (squareSequence.hasNext()) {
                System.out.println(squareSequence.next());
            }
            i++;
        }
    }
}

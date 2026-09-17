package chapter03.solution16;

import java.util.random.RandomGenerator;

public class RandomUtils {
    private static final RandomGenerator generator = RandomGenerator.getDefault();

    private record RandomSequence(int low, int high) implements IntSequence {
        @Override
        public int next() {
            return low + generator.nextInt(high - low + 1);
        }

        @Override
        public boolean hasNext() {
            return true;
        }
    }

    public static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }
}

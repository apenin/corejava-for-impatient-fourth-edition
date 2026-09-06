package chapter3.solution04;

public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence of(int... values) {
        return new IntSequence() {
            private int i;

            @Override
            public boolean hasNext() {
                return i < values.length;
            }

            @Override
            public int next() {
                int result = values[i];
                i++;
                return result;
            }
        };
    }
}

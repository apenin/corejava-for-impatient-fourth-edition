package chapter03.solution05;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    int next();

    static IntSequence constant(int value) {
        return () -> value;
    }
}

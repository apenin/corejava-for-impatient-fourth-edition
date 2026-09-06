package chapter3.solution06;

public interface Sequence<T> {
    default boolean hasNext() {
        return true;
    }

    T next();
}

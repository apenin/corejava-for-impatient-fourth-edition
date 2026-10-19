package chapter04.solution09;

public sealed interface StringList permits EmptyStringList, NonEmptyStringList {
    default int size() {
        return switch (this) {
            case EmptyStringList e -> 0;
            case NonEmptyStringList(String head, StringList tail) -> 1 + tail.size();
        };
    }

    default StringList append(StringList other) {
        return switch (this) {
            case EmptyStringList e -> other;
            case NonEmptyStringList(String head, StringList tail) ->
                    new NonEmptyStringList(head, tail.append(other));
        };
    }

    static StringList empty() {
        return new EmptyStringList();
    }

    static StringList of(String... values) {
        StringList list = new EmptyStringList();
        for (int i = values.length - 1; i >= 0; i--) {
            list = new NonEmptyStringList(values[i], list);
        }
        return list;
    }
}

package chapter04.solution09;

public record NonEmptyStringList(String head, StringList tail) implements StringList {}

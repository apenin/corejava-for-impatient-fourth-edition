package chapter03.solution15;

public record Employee(String name, double salary) {
    @Override
    public String toString() {
        return "Employee: { name: %s, salary: %.2f }".formatted(name, salary);
    }
}

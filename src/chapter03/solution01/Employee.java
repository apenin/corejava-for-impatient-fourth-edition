package chapter03.solution01;

public record Employee(String name, double salary) implements Measurable {

    @Override
    public double getMeasure() {
        return salary;
    }

    public static double average(Measurable[] objects) {
        double measure = 0;
        for (Measurable obj : objects) {
            measure += obj.getMeasure();
        }
        return objects.length != 0 ? measure / objects.length : 0;
    }
}

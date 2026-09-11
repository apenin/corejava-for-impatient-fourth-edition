package chapter03.solution02;

import chapter03.solution01.Measurable;

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

    public static Measurable largest(Measurable[] objects) {
        if (objects.length == 0) return null;

        Measurable personWithMaxSalary = objects[0];
        for (int i = 1; i < objects.length; i++) {
            if (objects[i].getMeasure() > personWithMaxSalary.getMeasure()) {
                personWithMaxSalary = objects[i];
            }
        }

        return personWithMaxSalary;
    }
}

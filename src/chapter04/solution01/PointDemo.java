package chapter04.solution01;

public class PointDemo {
    public static void main(String[] args) {
        Point point = new Point(10, 20);
        System.out.println("Point x: " + point.getX());
        System.out.println("Point y: " + point.getY());

        LabeledPoint labeledPoint = new LabeledPoint("origin", 0, 0);
        System.out.println("LabeledPoint label: " + labeledPoint.getLabel());
        System.out.println("LabeledPoint x: " + labeledPoint.getX());
        System.out.println("LabeledPoint y: " + labeledPoint.getY());
    }
}

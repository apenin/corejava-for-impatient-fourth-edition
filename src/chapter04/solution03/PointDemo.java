package chapter04.solution03;

import chapter04.solution03.labeledPoint.LabeledPoint;
import chapter04.solution03.point.Point;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        Point point2 = new Point(10, 20);
        Point point3 = new Point(1, 2);

        System.out.println("Point x: " + point1.getX());
        System.out.println("Point y: " + point1.getY());
        System.out.println(point1);
        System.out.println("point1 equals point2: " + point1.equals(point2));
        System.out.println("point1 equals point3: " + point1.equals(point3));
        System.out.println("point1 hashcode: " + point1.hashCode());
        System.out.println("point2 hashcode: " + point2.hashCode());
        System.out.println("point3 hashcode: " + point3.hashCode());

        System.out.println("============================");

        LabeledPoint labeledPoint1 = new LabeledPoint("origin", 0, 0);
        LabeledPoint labeledPoint2 = new LabeledPoint("origin", 0, 0);
        LabeledPoint labeledPoint3 = new LabeledPoint("some point", 1, 1);

        System.out.println("LabeledPoint x: " + labeledPoint1.getX());
        System.out.println("LabeledPoint y: " + labeledPoint1.getY());
        System.out.println("LabeledPoint label: " + labeledPoint1.getLabel());
        System.out.println(labeledPoint1);
        System.out.println("labeledPoint1 equals labeledPoint2: " + labeledPoint1.equals(labeledPoint2));
        System.out.println("labeledPoint1 equals labeledPoint3: " + labeledPoint1.equals(labeledPoint3));
        System.out.println("labeledPoint1 hashcode: " + labeledPoint1.hashCode());
        System.out.println("labeledPoint2 hashcode: " + labeledPoint2.hashCode());
        System.out.println("labeledPoint3 hashcode: " + labeledPoint3.hashCode());

        labeledPoint1.demonstrateAccess(point1, labeledPoint2);
    }
}
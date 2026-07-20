package chapter02;

public class Solution05 {
    public static void main(String[] args) {
        Point originalPoint = new Point(3, 4);
        Point newPoint = originalPoint.translate(1, 3).scale(0.5);

        System.out.println("Original point: " + originalPoint);
        System.out.println("New point: " + newPoint);

    }
}

record Point(double x, double y) {
    public Point translate(double dx, double dy) {
        return new Point(x + dx, y + dy);
    }

    public Point scale(double k) {
        return new Point(x * k, y * k);
    }
}
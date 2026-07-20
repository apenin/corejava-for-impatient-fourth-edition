package chapter02.solution06;

public class Solution06 {
    public static void main(String[] args) {
        Point originalPoint = new Point(1, 3);
        System.out.println("Original point before calling methods: " + originalPoint);

        Point newPoint = originalPoint.translate(3, 4).scale(0.5);
        System.out.println("Original point after calling methods: " + originalPoint);
        System.out.println("New point after calling methods: " + newPoint);
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        return this;
    }

    public Point scale(double k) {
        this.x *= k;
        this.y *= k;
        return this;
    }

    @Override
    public String toString() {
        return "Point[x=%.1f, y=%.1f]".formatted(this.x, this.y);
    }
}

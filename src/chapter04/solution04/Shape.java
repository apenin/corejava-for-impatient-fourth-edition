package chapter04.solution04;

public abstract class Shape {
    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point = new Point(point.x() + dx, point.y() + dy);
    }

    public Point getPoint() {
        return point;
    }

    public abstract Point getCenter();
}

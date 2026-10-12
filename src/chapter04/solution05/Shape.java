package chapter04.solution05;

public abstract class Shape implements Cloneable {
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

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }

    public abstract Point getCenter();
}

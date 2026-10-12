package chapter04.solution04;

public class Line extends Shape {
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        to = new Point(to.x() + dx, to.y() + dy);
    }

    @Override
    public Point getCenter() {
        return new Point(
                (getPoint().x() + to.x()) / 2,
                (getPoint().y() + to.y()) / 2
        );
    }
}

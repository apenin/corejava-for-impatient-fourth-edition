package chapter04.solution04;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(getPoint().x() + width / 2, getPoint().y() + height / 2);
    }
}

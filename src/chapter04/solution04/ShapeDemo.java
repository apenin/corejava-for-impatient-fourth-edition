package chapter04.solution04;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(new Point(0, 0), 5),
                new Rectangle(new Point(1, 1), 4, 6),
                new Line(new Point(0, 0), new Point(10, 10))
        };

        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() +
                    " center: (" + s.getCenter().x() +
                    ", " + s.getCenter().y() + ")");
        }

        System.out.println("=== After moveBy(1, 2) ===");
        for (Shape s : shapes) {
            s.moveBy(1, 2);
            System.out.println(s.getClass().getSimpleName() +
                    " center: (" + s.getCenter().x() +
                    ", " + s.getCenter().y() + ")");
        }
    }
}

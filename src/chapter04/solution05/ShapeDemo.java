package chapter04.solution05;

public class ShapeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circleOriginal = new Circle(new Point(0, 0), 5);
        Rectangle rectangleOriginal = new Rectangle(new Point(1, 1), 4, 6);
        Line lineOriginal = new Line(new Point(0, 0), new Point(10, 10));

        Shape[] shapes = { circleOriginal, rectangleOriginal, lineOriginal };

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

        Circle circleCloned = circleOriginal.clone();
        circleCloned.moveBy(10, 20);

        Rectangle rectangleCloned = rectangleOriginal.clone();
        rectangleCloned.moveBy(10, 20);

        Line lineCloned = lineOriginal.clone();
        lineCloned.moveBy(10, 20);

        Shape[] shapesCloned = { circleCloned, rectangleCloned, lineCloned };

        System.out.println("=== After cloning (original shapes) ===");
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() +
                    " center: (" + s.getCenter().x() +
                    ", " + s.getCenter().y() + ")");
        }

        System.out.println("=== After cloning (cloned shapes) ===");
        for (Shape s : shapesCloned) {
            System.out.println(s.getClass().getSimpleName() +
                    " center: (" + s.getCenter().x() +
                    ", " + s.getCenter().y() + ")");
        }
    }
}

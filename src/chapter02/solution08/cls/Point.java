package chapter02.solution08.cls;

/**
 * Represents the coordinates of a point on the plane
 */
public class Point {
    /**
     * the x-coordinate of the point
     */
    private double x;

    /**
     * the y-coordinate of the point
     */
    private double y;

    /**
     * Constructor for creating a new point object with the specified coordinates
     * @param x the x-coordinate of new point
     * @param y the y-coordinate of new point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Translates the point by the given offsets
     * @param dx the value for translation along the x-axis
     * @param dy the value for translation along the y-axis
     * @return the current point with the new coordinates after the translation
     */
    public Point translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        return this;
    }

    /**
     * Performs scaling along the x and y axes by a factor of k
     * @param k scaling factor
     * @return the current point with the new coordinates after scaling
     */
    public Point scale(double k) {
        this.x *= k;
        this.y *= k;
        return this;
    }

    /**
     * String representation of the point with its coordinates
     * @return a string representation of the point with its coordinates
     */
    @Override
    public String toString() {
        return "Point[x=%.1f, y=%.1f]".formatted(this.x, this.y);
    }
}

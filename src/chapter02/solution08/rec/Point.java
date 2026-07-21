package chapter02.solution08.rec;

/**
 * Represents the coordinates of a point on the plane
 * @param x the x-coordinate of the point
 * @param y the y-coordinate of the point
 */
public record Point(double x, double y) {
    /**
     * Translates the point by the given offsets
     * @param dx the value for translation along the x-axis
     * @param dy the value for translation along the y-axis
     * @return a new point with the new coordinates after the translation
     */
    public Point translate(double dx, double dy) {
        return new Point(x + dx, y + dy);
    }

    /**
     * Performs scaling along the x and y axes by a factor of k
     * @param k scaling factor
     * @return a new point with the new coordinates after scaling
     */
    public Point scale(double k) {
        return new Point(x * k, y * k);
    }
}

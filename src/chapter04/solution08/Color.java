package chapter04.solution08;

public enum Color {
    BLACK(0, 0, 0), RED(255, 0, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), CYAN(0, 255, 255), MAGENTA(255, 0, 255),
    YELLOW(255, 255, 0), WHITE(255, 255, 255);

    private final int rValue;
    private final int gValue;
    private final int bValue;

    Color(int rValue, int gValue, int bValue) {
        this.rValue = rValue;
        this.gValue = gValue;
        this.bValue = bValue;
    }

    public int getRed() {
        return rValue;
    }

    public int getGreen() {
        return gValue;
    }

    public int getBlue() {
        return bValue;
    }
}

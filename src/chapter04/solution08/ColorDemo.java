package chapter04.solution08;

public class ColorDemo {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.printf("%s(%d, %d, %d)%n", color.name(), color.getRed(), color.getGreen(), color.getBlue());
        }
    }
}

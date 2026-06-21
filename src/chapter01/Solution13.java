package chapter01;

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a string with a compass direction (N, S, E, W): ");
        String direction = in.nextLine();

        int x = 0;
        int y = 0;

        switch (direction) {
            case "N" -> y++;
            case "S" -> y--;
            case "E" -> x++;
            case "W" -> x--;
            default -> throw new IllegalArgumentException("Invalid direction: " + direction);
        }

        System.out.printf("x = %d, y = %d%n", x, y);
    }
}

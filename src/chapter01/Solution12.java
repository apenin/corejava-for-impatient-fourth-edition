package chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Enter a compass direction (N, S, E, W): ");
        String direction = in.nextLine();

        int[] offsets = switch (direction) {
            case "N" -> new int[] { 0, 1 };
            case "S" -> new int[] { 0, -1 };
            case "E" -> new int[] { 1, 0 };
            case "W" -> new int[] { -1, 0 };
            default -> throw new IllegalArgumentException("Invalid direction: " + direction);
        };

        System.out.println("Offsets: " + Arrays.toString(offsets));
    }
}

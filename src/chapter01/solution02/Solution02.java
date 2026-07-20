package chapter01.solution02;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter an integer angle: ");
        int angle = in.nextInt();

        int normalizedWithOperator = ((angle % 360) + 360) % 360;
        System.out.println("Normalized with the % operator: " + normalizedWithOperator);

        int normalizedWithFloorMod = Math.floorMod(angle, 360);
        System.out.println("Normalized with floorMod: " + normalizedWithFloorMod);
    }
}

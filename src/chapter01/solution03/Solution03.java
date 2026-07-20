package chapter01.solution03;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int maxWithConditionalOperator = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        int maxWithMathMax = Math.max(x, Math.max(y, z));

        System.out.println("Max with conditional operator: " + maxWithConditionalOperator);
        System.out.println("Max with Math.max: " + maxWithMathMax);
    }
}

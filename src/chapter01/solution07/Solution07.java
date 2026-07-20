package chapter01.solution07;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter first integer number between 0 and 4294967295: ");
        long input1 = in.nextLong();
        System.out.print("Enter second integer number between 0 and 4294967295: ");
        long input2 = in.nextLong();

        int a = (int) input1;
        int b = (int) input2;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = Integer.divideUnsigned(a, b);
        int remainder = Integer.remainderUnsigned(a, b);

        System.out.println("Unsigned sum of " + Integer.toUnsignedString(a) + " and " + Integer.toUnsignedString(b) +
                " equals: " + Integer.toUnsignedString(sum));
        System.out.println("Unsigned difference of " + Integer.toUnsignedString(a) + " and " + Integer.toUnsignedString(b) +
                " equals: " + Integer.toUnsignedString(difference));
        System.out.println("Unsigned product of " + Integer.toUnsignedString(a) + " and " + Integer.toUnsignedString(b) +
                " equals: " + Integer.toUnsignedString(product));
        System.out.println("Unsigned quotient of " + Integer.toUnsignedString(a) + " and " + Integer.toUnsignedString(b) +
                " equals: " + Integer.toUnsignedString(quotient));
        System.out.println("Unsigned remainder of " + Integer.toUnsignedString(a) + " and " + Integer.toUnsignedString(b) +
                " equals: " + Integer.toUnsignedString(remainder));
    }
}

package chapter01.solution06;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a positive integer number: ");
        int number = in.nextInt();

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + number + " equals: " + factorial);
    }
}

package chapter01;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = in.nextInt();

        System.out.printf("Binary format of number: %s%n", Integer.toBinaryString(number));
        System.out.printf("Octal format of number: %s%n", Integer.toOctalString(number));
        System.out.printf("Hexadecimal format of number: %s%n", Integer.toHexString(number));

        if (number != 0) {
            System.out.printf("Reciprocal as a hexadecimal floating-point number: %a%n", 1.0 / number);
        } else {
            System.out.println("There is no reciprocal number for 0!");
        }
    }
}

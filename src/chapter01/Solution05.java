package chapter01;

public class Solution05 {
    public static void main(String[] args) {
        double largerThanMaxInt = 3_000_000_000.0;
        int result = (int) largerThanMaxInt;

        System.out.println("Source double value: " + largerThanMaxInt);
        System.out.println("Result of casting to integer: " + result);
        System.out.println("Equals Integer.MAX_VALUE? " + (result == Integer.MAX_VALUE));
    }
}

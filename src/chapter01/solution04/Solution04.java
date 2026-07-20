package chapter01.solution04;

public class Solution04 {
    public static void main(String[] args) {
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Math.nextUp(0.0): " + Math.nextUp(0.0));
        System.out.println("Double.MIN_VALUE == Math.nextUp(0.0)? " + (Double.MIN_VALUE == Math.nextUp(0.0)));

        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Next after Double.MAX_VALUE: " + Math.nextUp(Double.MAX_VALUE));
    }
}

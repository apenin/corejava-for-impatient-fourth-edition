package chapter01;

public class Solution09 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 != s2? " + (s1 != s2)); // false
        System.out.println("s1.equals(s2)? " + s1.equals(s2)); // true

        System.out.println("s1 != s3? " + (s1 != s3)); // true
        System.out.println("s1.equals(s3)? " + s1.equals(s3)); // true
    }
}

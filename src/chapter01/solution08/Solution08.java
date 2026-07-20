package chapter01.solution08;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.println("Nonempty substrings:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                System.out.println(subStr);
            }
        }
    }
}

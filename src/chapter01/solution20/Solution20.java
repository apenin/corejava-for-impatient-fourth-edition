package chapter01.solution20;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.print("Enter a size of Pascal triangle: ");
        int n = in.nextInt();

        var pascalTriangle = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            var lineOfPascalTriangle = new ArrayList<Integer>();
            lineOfPascalTriangle.add(1);

            for (int j = 1; j < i; j++) {
                lineOfPascalTriangle.add(pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j));
            }

            if (i > 0) {
                lineOfPascalTriangle.add(1);
            }

            pascalTriangle.add(lineOfPascalTriangle);
        }

        System.out.println("Pascal triangle for n = " + n);
        System.out.println(pascalTriangle);
    }
}

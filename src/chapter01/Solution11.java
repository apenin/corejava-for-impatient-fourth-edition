package chapter01;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        System.out.println("All characters that are not ASCII:");
        for (int i = 0; i < input.length(); ) {
            int cp = input.codePointAt(i);
            if (cp > 127) {
                String symbol = new String(Character.toChars(cp));
                System.out.printf("Symbol: %s, code point: U+%04X%n", symbol, cp);
            }
            i += Character.charCount(cp);
        }
    }
}

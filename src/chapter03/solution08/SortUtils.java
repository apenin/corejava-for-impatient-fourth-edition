package chapter03.solution08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortUtils {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (true) {
            boolean correctOrder = true;

            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                    correctOrder = false;
                    Collections.shuffle(strings);
                    break;
                }
            }

            if (correctOrder) break;
        }
    }

    public static void main(String[] args) {
        String[] strings = { "bb", "a", "dddd", "ccc", "ffffff", "eeeee" };
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));

        System.out.println("Before lucky sorting by length: " + list);
        luckySort(list, Comparator.comparingInt(String::length));
        System.out.println("After lucky sorting by length: " + list);

        System.out.println();

        System.out.println("Before lucky sorting by reversed order: " + list);
        luckySort(list, Comparator.reverseOrder());
        System.out.println("After lucky sorting by reversed order: " + list);
    }
}

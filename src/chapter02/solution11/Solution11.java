package chapter02.solution11;

import java.util.ArrayList;
import java.util.List;

public class Solution11 {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println(RandomNumbers.randomElement(arr1)); // 0
        System.out.println(RandomNumbers.randomElement(arr2));

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println(RandomNumbers.randomElement(arrayList1)); // 0
        System.out.println(RandomNumbers.randomElement(arrayList2));
    }
}

package chapter02.solution11;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

/**
 * A class for retrieving random elements from an integer array and array list.
 * <p>
 * The methods of this class cannot be made instance methods because int[] is a primitive array,
 * not a class, so it cannot have instance methods. For ArrayList<Integer>,
 * one could formally create a subclass and add a method,
 * but that would require changing all the code that uses it and would cause confusion.
 */
public class RandomNumbers {
    private static final RandomGenerator GENERATOR = RandomGenerator.getDefault();

    /**
     * Returns a random element from an integer array.
     * @param array an integer array
     * @return a random element from an integer array
     */
    public static int randomElement(int[] array) {
        if (array.length == 0) return 0;
        return array[GENERATOR.nextInt(array.length)];
    }

    /**
     * Returns a random element from an integer array list.
     * @param arrayList an integer array list
     * @return a random element from an integer array list
     */
    public static int randomElement(ArrayList<Integer> arrayList) {
        if (arrayList.isEmpty()) return 0;
        return arrayList.get(GENERATOR.nextInt(arrayList.size()));
    }
}

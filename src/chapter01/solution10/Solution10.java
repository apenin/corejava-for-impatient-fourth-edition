package chapter01.solution10;

import java.util.random.RandomGenerator;

public class Solution10 {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGenerator.getDefault();
        long randomLong = generator.nextLong();
        String base36 = Long.toUnsignedString(randomLong, 36);
        System.out.println("Random string: " + base36);
    }
}

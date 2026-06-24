package chapter01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.random.RandomGenerator;

public class Solution18 {
    public static void main(String[] args) {
        int lowLotteryNumber = 1;
        int highLotteryNumber = 49;

        var lotteryNumbers = new ArrayList<Integer>();
        for (int i = lowLotteryNumber; i <= highLotteryNumber; i++) {
            lotteryNumbers.add(i);
        }

        var randomLotteryCombination = new ArrayList<Integer>();

        RandomGenerator generator = RandomGenerator.getDefault();
        for (int i = 0; i < 6; i++) {
            int randomIndex = generator.nextInt(0, lotteryNumbers.size());

            randomLotteryCombination.add(lotteryNumbers.get(randomIndex));
            lotteryNumbers.remove(randomIndex);
        }

        Collections.sort(randomLotteryCombination);
        System.out.println("Your lottery combination: " + randomLotteryCombination);
    }
}

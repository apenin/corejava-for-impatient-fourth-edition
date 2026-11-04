package chapter05.solution02;

import java.io.IOException;
import java.util.InputMismatchException;

import static chapter05.solution01.ReadValuesDemo.readValues;

public class SumValuesDemo {
    public static double sumOfValues(String filename) throws IOException {
        var values = readValues(filename);

        double sum = 0;
        for (double value : values)
            sum += value;

        return sum;
    }

    public static void main(String[] args) {
        try {
            double sum = sumOfValues("src/chapter05/solution01/numbers.txt");
            System.out.println("Sum of values from file: " + sum);
        } catch (IOException e) {
            System.err.println("Couldn't read the file: " + e.getMessage());
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("Incorrect number in the file: " + e.getMessage());
        }
    }
}

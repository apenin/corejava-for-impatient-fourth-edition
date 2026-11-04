package chapter05.solution03;

import java.io.IOException;
import java.util.InputMismatchException;

import static chapter05.solution02.SumValuesDemo.sumOfValues;

public class SolutionValuesApp {
    public static void main(String[] args) {
        try {
            double sum = sumOfValues("src/chapter05/solution01/numbers.txt");
            System.out.printf("Sum of numbers in the file: %.4f%n", sum);
        } catch (IOException e) {
            System.err.println("Couldn't read the file: " + e.getMessage());
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("Incorrect number in the file: " + e.getMessage());
        }
    }
}

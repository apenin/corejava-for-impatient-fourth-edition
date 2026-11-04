package chapter05.solution01;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadValuesDemo {
    public static ArrayList<Double> readValues(String filename) throws IOException {
        var values = new ArrayList<Double>();

        try (var in = new Scanner(Path.of(filename))) {
            while (in.hasNext()) {
                values.add(in.nextDouble());
            }
        }

        return values;
    }

    public static void main(String[] args) {
        try {
            var values = readValues("src/chapter05/solution01/numbers.txt");
            System.out.println(values);
        } catch (IOException e) {
            System.err.println("Couldn't read the file: " + e.getMessage());
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println("Incorrect number in the file: " + e.getMessage());
        }
    }
}

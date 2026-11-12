package chapter05.solution04;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ErrorCodeDemo {
    public static ReadResult readValues(String filename) {
        var values = new ArrayList<Double>();
        try (var in = new Scanner(Path.of(filename))) {
            while (in.hasNext()) {
                values.add(in.nextDouble());
            }
        } catch (IOException ex) {
            return ReadResult.failure(ErrorCode.IO_EXCEPTION);
        } catch (InputMismatchException e) {
            return ReadResult.failure(ErrorCode.INPUT_MISMATCH_EXCEPTION);
        }

        return ReadResult.success(values);
    }

    public static SumResult sumOfValues(List<Double> values) {
        if (values == null) {
            return new SumResult(ErrorCode.INPUT_MISMATCH_EXCEPTION, 0);
        }

        double sum = 0;
        for (double value : values)
            sum += value;

        if (!Double.isFinite(sum)) {
            return new SumResult(ErrorCode.INPUT_MISMATCH_EXCEPTION, 0);
        }

        return new SumResult(ErrorCode.NORMAL, sum);
    }

    public static void main(String[] args) {
        String fileName = "src/chapter05/solution01/numbers.txt";

        ReadResult read = readValues(fileName);
        if (!read.code().isSuccess()) {
            System.err.printf("%s: %s%n", read.code().getMessage(), fileName);
            System.exit(read.code().getCode());
        }

        SumResult sum = sumOfValues(read.values());
        if (!sum.code().isSuccess()) {
            System.err.printf("%s: %s%n", sum.code().getMessage(), fileName);
            System.exit(sum.code().getCode());
        }

        System.out.printf("Sum of values from file: %.4f%n", sum.value());
    }
}

package chapter01;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        var numberSquare = new ArrayList<ArrayList<Integer>>();
        var in = new Scanner(System.in);

        int magicSum = 0;
        boolean isInputBlank;
        boolean isFirstRow = true;
        String input;
        do {
            System.out.print("Enter a string of magic square: ");

            input = in.nextLine();
            isInputBlank = input.isBlank();
            var numberLine = new ArrayList<Integer>();

            if (!isInputBlank) {
                for (String strNumber : input.split("\\s+")) {
                    try {
                        int number = Integer.parseInt(strNumber);
                        numberLine.add(number);

                        if (isFirstRow) {
                            magicSum += number;
                        }
                    } catch (NumberFormatException e) {
                        throw new RuntimeException("It isn't a magic square: " + e.getMessage());
                    }
                }

                numberSquare.add(numberLine);
                isFirstRow = false;
            }
        } while (!isInputBlank);

        if (numberSquare.isEmpty()) {
            System.out.println("It isn't a magic square!");
            return;
        }

        int numberSquareSize = numberSquare.size();
        int[] sumByColumns = new int[numberSquareSize];
        int[] sumByDiagonals = new int[2];

        for (int i = 0; i < numberSquareSize; i++) {
            int numberSquareLineSize = numberSquare.get(i).size();

            if (numberSquareLineSize != numberSquareSize) {
                System.out.println("It isn't a magic square!");
                return;
            }

            int sumByRow = 0;

            for (int j = 0; j < numberSquareLineSize; j++) {
                int valueNumberSquare = numberSquare.get(i).get(j);

                sumByRow += valueNumberSquare;
                sumByColumns[j] += valueNumberSquare;

                if (i == j) {
                    sumByDiagonals[0] += valueNumberSquare;
                }

                if ((i + j) == numberSquareSize - 1) {
                    sumByDiagonals[1] += valueNumberSquare;
                }
            }

            if (sumByRow != magicSum) {
                System.out.println("It isn't a magic square!");
                return;
            }
        }

        for (int value : sumByColumns) {
            if (value != magicSum) {
                System.out.println("It isn't a magic square!");
                return;
            }
        }

        for (int value : sumByDiagonals) {
            if (value != magicSum) {
                System.out.println("It isn't a magic square!");
                return;
            }
        }

        System.out.println("It's a magic square!");
    }
}

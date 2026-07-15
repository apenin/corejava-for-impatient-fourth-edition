package chapter02;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Solution01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // set to start of month
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue(); // 1 = Monday, ... , 7 = Sunday

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < (value % 7); i++) {
            System.out.print("    "); // 4 spaces
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());

            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" "); // 1 space
            }

            date = date.plusDays(1);

            if (date.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
        }

        if (date.getDayOfWeek().getValue() != 7) {
            System.out.println();
        }
    }
}

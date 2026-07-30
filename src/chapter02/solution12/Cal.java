package chapter02.solution12;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.LocalDate.*;
import static java.lang.System.*;

public class Cal {
    public static void main(String[] args) {
        LocalDate date = now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // первый день месяца
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();   // 1 = Monday, ... 7 = Sunday

        out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            out.print("    "); // 4 пробела
        }

        while (date.getMonthValue() == month) {
            out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                out.print("*");
            } else {
                out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            out.println();
        }
    }
}

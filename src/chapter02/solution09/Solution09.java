package chapter02.solution09;

public class Solution09 {
    public static void main(String[] args) {
        TimeOfDay timeOfDay = new TimeOfDay(10, 90);
        System.out.println(timeOfDay); // 11 hours 30 minutes

        TimeOfDay newTimeOfDay = timeOfDay.plusMinutes(130);
        System.out.println(newTimeOfDay); // 13 hours 40 minutes

        int minutesDiff = timeOfDay.minutesFrom(newTimeOfDay);
        System.out.println(minutesDiff); // -130 minutes
    }
}

record TimeOfDay(int hour, int minute) {
    public TimeOfDay {
        hour += Math.floorDiv(minute, 60);
        minute = Math.floorMod(minute, 60);
        hour = Math.floorMod(hour, 24);
    }

    public TimeOfDay plusMinutes(int minutes) {
        return new TimeOfDay(this.hour, this.minute + minutes);
    }

    public int minutesFrom(TimeOfDay other) {
        return 60 * (hour - other.hour) + (minute - other.minute);
    }
}
package chapter01.solution21;

public class Solution21 {
    public static void main(String[] args) {
        double avg = average(3, 4.5, -5, 0);
        System.out.println(avg);
    }

    public static double average(double first, double... rest) {
        double sum = first;
        for (double v : rest) sum += v;
        return sum / (1 + rest.length);
    }
}

package chapter02.solution10;

public class Solution10 {
    public static void main(String[] args) {
        Car someCar = new Car(15.8, 30);

        someCar.driveMiles(20);
        someCar.addGallonsToTank(10);
        someCar.driveMiles(20);

        System.out.printf("Your current mileage: %.1f%n", someCar.getMileage());
        System.out.printf("Your current fuel level in tank: %.1f%n", someCar.getCurrentFuelLevelInTank());
    }
}

package chapter02.solution10;

/**
 * A class that models a car.
 * <p>
 * For simplicity, we assume that the fuel tank capacity does not change
 * and that the fuel consumption is constant.
 * <p>
 * The Car class should not be immutable because the driveMiles() and addGallonsToTank() methods
 * change the object's state after its creation (the car's mileage and fuel level
 * in the tank change as it drives).
 */
public class Car {
    private double currentFuelLevelInTank; // in gallons
    private double mileage; // in miles

    private final double fuelTankCapacity; // in gallons
    private final double fuelEfficiency; // in miles/gallons

    /**
     * Constructs a Car object.
     * @param fuelTankCapacity the fuel tank capacity in gallons
     * @param fuelEfficiency the fuel efficiency in miles/gallons
     */
    public Car(double fuelTankCapacity, double fuelEfficiency) {
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelEfficiency = fuelEfficiency;
        this.currentFuelLevelInTank = 0;
        this.mileage = 0;
    }

    /**
     * A method to drive a specified number of miles.
     * @param miles the specified number of miles
     */
    public void driveMiles(double miles) {
        if (miles > currentFuelLevelInTank * fuelEfficiency) {
            System.out.printf("You don't have enough fuel in your tank to drive %.1f miles!%n", miles);
        } else {
            mileage += miles;
            currentFuelLevelInTank -= (miles / fuelEfficiency);
        }
    }

    /**
     * Add a specified number of gallons of fuel to the gas tank.
     * @param gallons the specified number of gallons of fuel
     */
    public void addGallonsToTank(double gallons) {
        if (gallons > fuelTankCapacity - currentFuelLevelInTank) {
            System.out.printf("Your tank cannot hold %.1f gallons of fuel!%n", gallons);
        } else {
            currentFuelLevelInTank += gallons;
        }
    }

    /**
     * Gets a current mileage of car.
     * @return the current mileage
     */
    public double getMileage() {
        return mileage;
    }

    /**
     * Gets a current fuel in the tank of car.
     * @return the current fuel in the tank of car
     */
    public double getCurrentFuelLevelInTank() {
        return currentFuelLevelInTank;
    }
}

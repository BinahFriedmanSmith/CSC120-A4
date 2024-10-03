/**
 * simulates a train engine
 */
public class Engine {

    private final FuelType fuel;
    private final double fuelMax;
    private double fuelNow;

    /**
    * Creates an engine
    * @param fuel Type of fuel the engine uses
    * @param fuelMax Fuel capacity
    */
    public Engine(FuelType fuel, double fuelMax) {
        this.fuel = fuel;
        this.fuelMax = fuelMax;
        this.fuelNow = fuelMax;
    }

    /**
    * Sets current fuel level to maximum fuel level
    */
    public void refuel() {
        this.fuelNow = this.fuelMax;
    }

    /**
    * Uses 1 fuel and prints premaining level. If out of fuel, says so and returns false. Otherwise returns true
    * @return Whether or not there is a positive amount of fuel left.
    */
    public boolean go() {
        this.fuelNow -= 1;        
        if (this.fuelNow > 0) {
            System.out.println("Remaining Fuel: " + this.fuelNow +"/" + this.fuelMax);
            return true;
        }
        else {
            System.out.println("No Remaining Fuel.");
            return false;
        }
    }

    /**
     * Returns fuel type
     * @return returns fuel type
     */
    public FuelType getFuel() {
        return this.fuel;
    }

}
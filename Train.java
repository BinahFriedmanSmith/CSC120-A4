import java.util.ArrayList;

/**
 * simulates a train. manages aspects such as engine and passenger cars
 */
public class Train {
    private final Engine engine;
    private final ArrayList<Car> cars;

    /**
     * Creates a Train with given attriibutes
     * @param fuelType type of fuel used by the engine
     * @param fuelCapacity maximum amount of fuel engine can carry
     * @param nCars number of cars
     * @param passengerCapacity passenger capacity of each car
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        //make engine
        engine = new Engine(fuelType, fuelCapacity);
        //make list for cars
        cars = new ArrayList(nCars);
        //repeat for # of cars needed:
        for (int i = 0; i < nCars; i++) {
            //make a car with given capacity (assuming the passed value is for each car and not a total; unclear tbh)
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
    * Returns engine object
    * @return engine object
    */
    public Engine getEngine() {
        //return the engine object
        return engine;
    }
    
    /**
    * Returns ith car
    * @return car at position i
    * @param i position of desired car
    */
    public Car getCar(int i) {
        //get the ith car from the arraylist cars
        return cars.get(i);
    }

    /**
    * Returns full train capacity
    * @return full train capacity
    */
    public int getMaxCapacity() {
        //since all cars have the same capacity, multiply # of cars by first car's capacity
        return cars.size() * cars.get(0).getCapacity();
    }

    /**
    * Returns remaining empty spots
    * @return empty spots left
    */
    public int seatsRemaining() {
        //initialize variable to store total empty seats in temporarily
        int seatsRemaining = 0;
        for (Car c : cars) {
            seatsRemaining += c.seatsRemaining();
        }
        return seatsRemaining;
    }

    /**
    * Prints out each car and its passengers, or if it is empty
    */
    public void printManifest() {
        //iterates though the # of cars in the train
        for (int i = 0; i < cars.size(); i++) {
            //introduces car
            System.out.println("Car " + i + ": ");
            //print passengers in car
            cars.get(i).printManifest();
        }
    }
}

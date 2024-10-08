/**
 * simulates a train passenger. can board and disembark train cars
 */
public class Passenger {
    
    private final String name;

    public Passenger(String name) {
        this.name = name;
    }

    /**
    * When the passenger is printed, prints the passenger's name
    * @return string to print
    */
    @Override
    public String toString() {
        return name;
    }

    /**
    * Attempts to board a given train car
    * @param c car to board
    * @return success of attempt
    */
    public boolean boardCar(Car c) {
        //ask car to add this passenger
        return c.addPassenger(this);
    }

    /**
    * Attempts to disembark a given train car
    * @param c car to leave
    * @return success of attempt
    */
    public boolean getOffCar(Car c) {
        //ask car to remove this passenger
        return c.removePassenger(this);
    }
}

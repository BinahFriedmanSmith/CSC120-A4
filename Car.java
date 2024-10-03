
import java.util.ArrayList;
/**
 * Simulates a train car. can hold a set amount of passengers.
 */
public class Car
{ //i am aware you want the curly brace on the previous line but i do not care it looks better this way. 
  //if the ending brace gets its own line why not this one. its fair and then they are on the same level 
    private ArrayList<Passenger> passengers;
    private final int capacity;

    /**
    * Creates a car
    * @param c capacity
    */
    public Car(int c) 
    {
        this.capacity = c;
        this.passengers = new ArrayList(c);
    }

    /**
    * Returns capacity
    * @return capacity
    */
    public int getCapacity() 
    {
        return this.capacity;
    }

    /**
    * Returns the number of remaining seats
    * @return the number of remaining seats
    */
    public int seatsRemaining() 
    {
        return capacity - passengers.size();
    }

    /**
    * If possible, adds the given passenger to the car
    * @param p passenger to add
    * @return whether the addition was sucessful
    */
    public boolean addPassenger(Passenger p)
    {
        //first check if passenger is already on car; dont let them get on twice
        if (passengers.contains(p)) {return false;}
        //if there are any seats remaining
        if (this.seatsRemaining() > 0)
        {
            //add the passenger & return true
            passengers.add(p);
            return true;
        }
        //otherwise return false
        else { return false; }
    }

    /**
    * If possible, removes the given passenger to the car
    * @param p passenger to remove
    * @return whether the addition was sucessful
    */
    public boolean removePassenger(Passenger p)
    {
        //if the passenger is in the car
        if (passengers.contains(p))
        {
            //remove the passenger & return true
            passengers.remove(p);
            return true;
        }
        //otherwise return false
        else { return false; }
    }

    /**
     * Prints out each passenger in the car, or "This car is EMPTY"
     */
    public void printManifest()
    {
        //check if car is empty
        if (passengers.isEmpty())
        {
            //if it is, say so
            System.out.println("This car is EMPTY.");
        }
        else //else
        {
            //for each object in passengers
            for (Passenger p : passengers) {
                //print it out
                System.out.println("::" + p + "::");
            }
        }
    }
}
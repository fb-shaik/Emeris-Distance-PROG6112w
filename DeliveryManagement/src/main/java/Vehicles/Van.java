/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;
import Exceptions.InvalidVehicleIDException;
import Exceptions.InvalidCapacityException;

/**
 *
 * @author nmagongo
 */
public class Van extends DeliveryVehicle
{
    private int capacity;
    
    //Constructor
    public Van(String vehicleId, String driverName, String deliveryStatus, int capacity) throws InvalidVehicleIDException, InvalidCapacityException 
    {

        super(vehicleId, driverName, deliveryStatus);

        setCapacity(capacity);
    }
    
    //getter
    public int getCapacity()
    {
        return capacity;
    }
    
    //setter: called when the user provides a value for the van's capacity
    public void setCapacity(int capacity) throws InvalidCapacityException
    {
        if (capacity <= 0)
        {
            throw new InvalidCapacityException("The van's capacity must be greater than zero.");
        }
        this.capacity = capacity;
    }
    

    @Override
    public void deliverPackage()
    {

        System.out.println(
            getDriverName() +
            " is delivering the package by van."
        );

        System.out.println(
            "The van can carry " +
            capacity +
            " packages."
        );
    }

    @Override
    public void trackVehicle() //interface method
    {

        System.out.println("Tracking van " + getVehicleId());
    }
}

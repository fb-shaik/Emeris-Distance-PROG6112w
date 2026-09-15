/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;
import Exceptions.InvalidCapacityException;
import Exceptions.InvalidVehicleIDException;


/**
 *
 * @author nmagongo
 */
public class Truck extends DeliveryVehicle
{
    private double maximumWeight;

    //Constructor
    public Truck(String vehicleId, String driverName, String deliveryStatus, double maximumWeight) throws InvalidVehicleIDException, InvalidCapacityException 
    {

        super(vehicleId, driverName, deliveryStatus);
        
        setMaximumWeight(maximumWeight);
        

        //this.maximumWeight = maximumWeight;
    }

    //getter
    public double getMaximumWeight()
    {
        return maximumWeight;
    }
    
    //setter: accepts the value of the truck's maximum weight
    public void setMaximumWeight(double maximumWeight) throws InvalidCapacityException
    {
        if(maximumWeight <=0)
        {
            throw new InvalidCapacityException("Truck maximum weight " + "must be greater than zero.");
        }
        
        this.maximumWeight = maximumWeight;
    }

    
    @Override
    public void deliverPackage()
    {

        System.out.println(
            getDriverName() +
            " is delivering the package by truck."
        );

        System.out.println(
            "The truck can carry up to " +
            maximumWeight +
            " kg."
        );
    }

    @Override
    public void trackVehicle() //Interface
    {

        System.out.println("Tracking truck " + getVehicleId()
        );
    }
}

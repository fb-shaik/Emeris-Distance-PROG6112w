/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;
import Interfaces.Trackable;

     
/**
 *
 * @author nmagongo
 */
public abstract class DeliveryVehicle implements Trackable
{
    //Encapsulation - Information hiding
    private String vehicleId;
    private String driverName;
    private String deliveryStatus;
    
    //Constructor
    public DeliveryVehicle(String vID, String dName, String delStatus)
    {
        this.vehicleId = vID;
        this.driverName = dName;
        this.deliveryStatus = delStatus;
    }
    
    //getters
    public String getVehicleId()
    {
        return vehicleId;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public String getDeliveryStatus()
    {
        return deliveryStatus;
    }
    
    //Setters
    public void setDeliveryStatus(String deliveryStatus)
    {
        this.deliveryStatus = deliveryStatus;
    }

    // Common superclass method 
    public void startDelivery()
    {
        System.out.println(
            driverName + " has started a delivery."
        );
    }
    
    //Method to be overridden
    public abstract void deliverPackage();
    
     // Interface method
    @Override
    public abstract void trackVehicle();
    

    // Object.toString() overridden
    @Override
    public String toString()
    {

        return "Vehicle ID: " + vehicleId +
               ", Driver: " + driverName +
               ", Status: " + deliveryStatus;
    }

    // Object.equals() overridden
    @Override
    public boolean equals(Object obj)
    {

        // Same object
        if (this == obj) {
            return true;
        }

        // Null check
        if (obj == null) {
            return false;
        }

        // Check type
        if (!(obj instanceof DeliveryVehicle)) {
            return false;
        }

        DeliveryVehicle other =
            (DeliveryVehicle) obj;

        // Compare vehicle IDs
        return vehicleId.equals(other.vehicleId);
    }
    
    // Object.hashCode()
    @Override
    public int hashCode()
    {

        return vehicleId.hashCode();
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;

/**
 *
 * @author nmagongo
 */
public class Motorcycle extends DeliveryVehicle
{
    
    private boolean hasDeliveryBox;
    
    public Motorcycle(String vehicleId, String driverName, String deliveryStatus, boolean hasDeliveryBox)
    {
        super(vehicleId, driverName, deliveryStatus);
        this.hasDeliveryBox = hasDeliveryBox;
    }
    
    public boolean hasDeliveryBox()
    {
        return hasDeliveryBox;
    }
    
    @Override
    public void deliverPackage()//base class method
    {
       
        System.out.println(getDriverName() +
            " is delivering the package by motorcycle."
        );
        
         System.out.println(
            "Motorcycles are suitable for small packages."
        );
    }
    
    @Override
    public void trackVehicle() //Interface method
    {
        System.out.println("Tracking motorcycle " + getVehicleId());
    }
    
}

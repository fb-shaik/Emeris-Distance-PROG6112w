/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;

/**
 *
 * @author nmagongo
 */
public class Truck extends DeliveryVehicle
{
     private double maximumWeight;

    public Truck(String vehicleId, String driverName, String deliveryStatus, double maximumWeight)
    {

        super(vehicleId, driverName, deliveryStatus);

        this.maximumWeight = maximumWeight;
    }

    public double getMaximumWeight()
    {
        return maximumWeight;
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
    public void trackVehicle()
    {

        System.out.println(
            "Tracking truck " +
            getVehicleId()
        );
    }
}

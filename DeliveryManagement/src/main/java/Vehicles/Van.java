/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicles;

/**
 *
 * @author nmagongo
 */
public class Van extends DeliveryVehicle
{
    private int capacity;

    public Van(String vehicleId, String driverName, String deliveryStatus, int capacity)
    {

        super(vehicleId, driverName, deliveryStatus);

        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return capacity;
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
    public void trackVehicle()
    {

        System.out.println("Tracking van " + getVehicleId()
        );
    }
}

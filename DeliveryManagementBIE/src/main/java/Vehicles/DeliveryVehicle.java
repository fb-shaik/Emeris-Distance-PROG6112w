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
    private String vehicleId;
    private String driverName;
    private String deliveryStatus;

    public DeliveryVehicle(String vID, String dName, String delStatus)
    {
        validateVehicleId(vID);

        this.vehicleId = vID;
        this.driverName = dName;
        this.deliveryStatus = delStatus;
    }

    private void validateVehicleId(String vehicleId)
    {
        if (vehicleId == null || vehicleId.isBlank())
        {
            //Built-in Exception
            throw new IllegalArgumentException("Vehicle ID cannot be empty.");
        }
    }

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

    public void setDeliveryStatus(String deliveryStatus)
    {
        this.deliveryStatus = deliveryStatus;
    }

    public void startDelivery()
    {
        if (!deliveryStatus.equalsIgnoreCase("Available"))
        {
            //Built-in Exception
            throw new IllegalStateException("Vehicle " + vehicleId + " is currently not available.");
        }

        System.out.println(driverName + " has started a delivery.");
    }

    public abstract void deliverPackage();

    @Override
    public abstract void trackVehicle();

    @Override
    public String toString()
    {
        return "Vehicle ID: " + vehicleId +
               ", Driver: " + driverName +
               ", Status: " + deliveryStatus;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null)
        {
            return false;
        }

        if (!(obj instanceof DeliveryVehicle))
        {
            return false;
        }

        DeliveryVehicle other =
                (DeliveryVehicle) obj;

        return vehicleId.equals(other.vehicleId);
    }

    @Override
    public int hashCode()
    {
        return vehicleId.hashCode();
    }
}
    


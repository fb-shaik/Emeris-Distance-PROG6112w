/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliverymanagementbie;

import Vehicles.DeliveryVehicle;
import Vehicles.Motorcycle;
import Vehicles.Van;
import Vehicles.Truck;

/**
 *
 * @author nmagongo
 */



public class DeliveryManagementBIE {

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Delivery Management System");
        
        try
        {
            //create subclass objects
            Motorcycle mcycle = new Motorcycle("M001", "Thabo", "Available", true);
            Van v = new Van("V001", "Kim", "Available", 20);
            Truck tk = new Truck("T001", "Jack", "Available", 5000);

            //Array of objects 
            DeliveryVehicle[] vehicles = new DeliveryVehicle[3];

            //Specify which objects should populate the array
            vehicles[0] = mcycle;
            vehicles[1] = v;
            vehicles[2] = tk;

            for (DeliveryVehicle vehicle : vehicles)
            {
                System.out.println(vehicle);

                try
                {
                    vehicle.startDelivery();

                    vehicle.deliverPackage();

                    vehicle.trackVehicle();

                    System.out.println("Vehicle type: " + vehicle.getClass().getSimpleName());
                    
                }
                catch (IllegalStateException e)
                {
                    System.out.println("Delivery error: " + e.getMessage());
                }

                System.out.println();
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Input error: " + e.getMessage());
        }
        finally
        {
            System.out.println("System operation is complete.");
        }
    }
}


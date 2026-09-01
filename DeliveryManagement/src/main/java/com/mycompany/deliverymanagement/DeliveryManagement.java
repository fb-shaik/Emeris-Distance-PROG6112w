/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliverymanagement;

import Vehicles.DeliveryVehicle;
import Vehicles.Motorcycle;
import Vehicles.Van;
import Vehicles.Truck;

/**
 *
 * @author nmagongo
 */
public class DeliveryManagement {

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Delivery Management System");
        
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
        
        
        //Display vehicle information (display the contents of the array)
        for(DeliveryVehicle vehicle : vehicles)
        {
            System.out.println(vehicle);
            vehicle.startDelivery();
            
            //dynamic method binding
            vehicle.deliverPackage();
             
            //call interface method
            vehicle.trackVehicle();
            
            //Object getClass method to display the object's class
            System.out.println("Vehicle type: " + vehicle.getClass().getSimpleName());
            
            System.out.println();
        
        }
        
        //Compare objects
        System.out.println("Object comparison");
        
        Motorcycle mcycle2 = new Motorcycle("M001", "Thabo", "Available", true);
        Motorcycle mcycle3 = new Motorcycle("M002", "Peter", "Available", true);
        
        //Comparing the object memory locations 
        System.out.println("By using the == operator, is mcycle equal to mcycle2 " + (mcycle == mcycle2));//false
        
        //Comparing the object values 
        System.out.println("By calling the equals() method, is mcycle equal to mcycle2: "  + mcycle.equals(mcycle2));//true
        
        //Comparing the object values 
        System.out.println("By calling the equals() method, is mcycle equal to mcycle3? "  + mcycle.equals(mcycle3));//false
        
        //Can objects of different types be compared?
        //Yes, and the result should be false
        System.out.println("By calling the equals() method, is the truck object, tk, equal to mcycle? "  + tk.equals(mcycle));// false
        
        //When Comparing objects, decide if you want to compare:
        //- By value:
        //      need to use the overridden equals() method
        // - By their memory address:
        //      can use the == operator
        
        //Theory questions:
        //1. Define dynamic binding and explain how dynamic binging is implemented in this scenario
        //2. Define the use of an abstract class and explain how it has been implemented in this scenario
        //3. Differentiate between == and equals()
        //4. Identify where overridden methods have been implemented in this scenario
       
        
    }
}

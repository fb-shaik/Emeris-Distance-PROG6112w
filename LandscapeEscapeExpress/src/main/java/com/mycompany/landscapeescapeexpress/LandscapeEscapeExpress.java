/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.landscapeescapeexpress;

/**
 *
 * @author nmagongo
 */
import java.util.Scanner;

public class LandscapeEscapeExpress
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter pool length (m): ");
        double poolLength = scanner.nextDouble();

        System.out.print("Enter pool width (m): ");
        double poolWidth = scanner.nextDouble();

        System.out.print("Enter pool depth (m): ");
        double depth = scanner.nextDouble();

        System.out.print("Enter property length (m): ");
        double propertyLength = scanner.nextDouble();

        System.out.print("Enter property width (m): ");
        double propertyWidth = scanner.nextDouble();

        Rectangle pool = new Rectangle(poolLength, poolWidth);

        Rectangle property = new Rectangle(propertyLength, propertyWidth);
        
        //Array of subclass objects
        LandscapingService[] services = {

                new PoolPainting(pool, depth),

                new WaterFilling(pool, depth),

                new PoolFencing(pool),

                new Paving(pool),

                new LawnMowing(property, pool),

                new PropertyFencing(property)
                      
        };
        double total = 0;

        System.out.println("\n================================");
        System.out.println(" LANDSCAPING COST CALCULATOR");
        System.out.println("================================");

        /*
         * Dynamic method binding
         */
        for (LandscapingService service : services) {

            System.out.println("\n----------------------------");

            service.displayServiceDetails();

            double cost =
                    service.calculateCost();

            System.out.println(
                    "Calculated Cost: R" + cost);

            total += cost;
        }

        System.out.println("\n================================");
        System.out.println("TOTAL PROJECT COST: R" + total);
        System.out.println("================================");

        scanner.close();
    }
        
        
}


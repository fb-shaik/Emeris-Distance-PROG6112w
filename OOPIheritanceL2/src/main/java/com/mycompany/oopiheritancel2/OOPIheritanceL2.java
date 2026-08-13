/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopiheritancel2;

/**
 *
 * @author nmagongo
 * 
 * Inheritance Lesson 2
 * 
 * Inheritance
 * Overriding
 * Constructors
 * 
 * 
 * Create subclasses using extends.
 * Override superclass methods using @Override.
 * Call superclass constructors using super().
 * Pass arguments to superclass constructors.
 * Access superclass methods using super.
 * 
 * 
 * Apply information hiding using access modifiers.
 * - Preventing other classes from directly accessing or changing the internal data of an object
 * - private
 * 
 * 
 * 
 * Explain why fields should generally be private.
 *  - Public: access from anywhere (main method that directly calls the methods defined in the class
 *              from outside of the class)
 * - Private: access the private members of the class indirectly
 * - Protected: members that extend access to the child (derived) classes
 * 
 * 
 * Understand getters and setters in an inheritance hierarchy.
 * - Allow controlled access to private data within a class
 * - Getters: Retrieve
 * - Setters: Set
 * 
 * 
 * Identify methods that cannot be overridden.
 * Apply inheritance to a practical Pet Rescue Centre system.
 * 
 * 
 */


import java.util.Scanner;
public class OOPIheritanceL2 {

    public static void main(String[] args) {
        System.out.println("Pet Rescue System");
        
        Scanner input = new Scanner(System.in);
        
        //instantiating a dog object
        Dog d1 = new Dog("Buddy", 4);
        d1.eat();
        
        d1.makeSound();
        
        
        
        
        
        //demonstrate the importance of information hiding
        Dog d2 = new Dog("Rex", 10);//values have been set
        System.out.println(d2.getAge()); //attempt to retrieve the age value
       
        Dog d3 = new Dog();
        
       
        
        
        System.out.println("Enter the dog's name");
        String n = input.nextLine();
        d3.setName(n);
        
        System.out.println("The dog's name is: " + d3.getName());
        
        System.out.println("Enter the dog's age");
        int a = input.nextInt(); 
        d3.setAge(a);
        System.out.println("The dog's age is: " + d3.getAge());
        
        
    }
}

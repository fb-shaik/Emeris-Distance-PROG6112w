/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopadvancedexhandling;

/**
 *
 * @author nmagongo
 * 
 * ABSTRACT CLASSES, DYNAMIC METHOD BINDING, ARRAYS OF SUBCLASS OBJECTS,
 * USING THE OBJECT CLASS AND ITS METHODS, USING INTERFACES, USING PACKAGES
 * 
 * Inheritance: Dog extends Pet
 * 
 * 
 * Abstract class: abstract class pet
 * 
 * 
 * Abstract method: abstract void makeSound()
 * - 
 * 
 * Method overriding: @override makeSound()
 * 
 * 
 * Superclass constructor: super(name, age)
 * 
 * 
 * Superclass method: super.makeSound()
 * - this method is called in the Main program
 * 
 * Information hiding: private String name
 * 
 * 
 * Encapsulation: Getters/ Setters
 * 
 * 
 * Interface: implements Adoptable
 * 
 * 
 * Interface Method: prepareForAdoption
 * - Separate entity that is not concerned with other classes behaviours
 * - Other classes can implement it
 * - Outside of the inheritance structure
 * 
 * Interface vs Abstract class:
 * - Abstract class: Inheritance
 *      - Dog is a Pet
 *      - Cat is a Pet
 * - Interface: Capability
 *      - Dog can be adopted
 * 
 * Dynamic method binding: pet.makeSound()
 * - a method call is resolved at runtime based on the object's actual type
 *      - runtime: the period when a program is running (after compile time)
 * 
 * 
 *      - Compile time: the period when the code is converted to machine code (binary code)
 * 
 * 
 * Array of subclass objects: Pet[] pets
 * 
 * 
 * Object class: toString(), getClass(), equals()
 *      - When you define a class, if you do not explicitly extend another
           class, your class implicitly is an extension of the Object class.
           The Object class is defined in the java.lang
           package, which is imported automatically every time you write a program
 * 
 *      - The Object class includes methods that descendant classes can use, overload, or override
 *  
 * The Object class's equals() method:
 *  - Used to compare objects
 *      - Comparing object references (memory locations: false)
 *          - default
 *      - Comparing the actual information stored in objects
 * 
 *      
 * 
 * 
 * 
 * 
 * Packages: package pets;
 *      - A mechanism for organizing related classes
 * 
 * Importing: import pets.Dog
 * 
 * Final Method: final registerPet()
 * 
 * Polymorphism:
 * - A single entity taking multiple forms
 * - Using the same method name to indicate different implementations for methods based
    on the type of object.
*  - Overriding a superclass method in a subclass by creating a method with the same name and parameter list.
 * 
 * OOP 4 PILLARS:
*  - Encapsulation : 
*      Information hiding: The process of a class hiding its internal data
*      - private
*  - Inheritance
*      OOP concept that allows a class to inherit attributes and methods from
*      another class, creating a parent-child relationship between the classes
*      where the parent class is known as a superclass or base class and the 
*      child/children classes is/are known as derived or child classes.
*  - Abstraction
*      Generalizing complex information to allow subclasses to implement the 
*      details. A method will be declared without its implementation 
*      and the subclasses will provide their unique implementations of the
*      method.
*  - Polymorphism: overriding
 * 
 * 
 * 
 */
public class OOPAdvancedExHandling
{

    public static void main(String[] args)
    {
        System.out.println("Advanced Inheritance Demo");
        
        //Instantiating an object of the abstract class
        Pet p;
        
        p = new Dog("RES003", "Bud", 10, "Labrador");
        
        //calling the overridden Dog class's makeSound method
        p.makeSound();
        
        //creating an array of subclass objects
        Pet[] pets = new Pet[3];
        
        //populate the array
        //These are objects of different subclasses
        pets[0] = new Dog("RES004", "Rex", 3, "Jack Russel" );
        pets[1] = new Cat ("RES005", "Mittens", 1, "Orange");
        pets[2] = new Dog ("RES006", "Tiger", 7, "Pitbull");
        
        
        //dynamic method binding in action!
        for(Pet pet : pets)
        {
            
            //Displays the pet's details
            //This is the overridden toString method of the Object class
            //defined in the Pet class
            System.out.println(pet);
            
            pet.makeSound();
            pet.eat();
            pet.sleep();
            
            //This demonstrates the Object class's getClass() method
            //This is used to return an object's class detail
            System.out.println("Class: " + pet.getClass().getSimpleName());
        }
        
        //toString method is automatically called to display the dog's details
        Dog dog = new Dog("RES007", "Buddy", 4, "Labrador");
        System.out.println(dog);
        
        
         
        
        //Object class's equals() method 
        //This will execute as false. Why?
        //Because when 2 objects are created, they are considered different
        //Dog d1 = new Dog("Sam", 3, "Pitbull");
        //Dog d2 = new Dog("Sam", 3, "Pitbull");
    
        
        //How do we then compare objects?
        //We will investigate this in the next lesson :-)
        
        //Next lesson:
        //- Using the getClass() Object method
        //- Comparing objects
        //- Which methods cannot be overridden
        //****************************************
        
        //Comparing 2 objects
        Dog d1 = new Dog("RES001", "Sam", 3, "Pitbull");
        Dog d2 = new Dog("RES001", "Sam", 3, "Pitbull");
 
        //How does Java compare these objects?
        
        //== vs equals()
        //System.out.println(d1 == d2);
        
        
        
        //Why is this false? 
        // == compares object references
        
        System.out.println(d1.equals(d2));
        
        //We want to show that d1 and d2 data are equal
        //Override the equals() method
        //What does "equal" mean?
        //1. Same: false because of the different memory addresses
        //2. Same, age, breed: yes
        //3. Same RescueID?: RES001, RES002, RES003
        // same: RES001 = RES001
        
        //In our context, the eqauls() method is used it
        //check if the same pet (with same rescueID) 
        //is the same as another pet with the 
        //same rescue ID. If this is true, then
        //we can say that the objects are equal!
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopinheritancel1;

/**
 *
 * @author nmagongo
 * 
 * INHERITANCE
 * 
 * Imagine you are creating a game with many different characters.
 * Characters:
 *  - Wizard
 *  - Knight
 *  - Archer
 *  - Healer
 * 
 * All characters have:
 *  - Name
 *  - Health
 *  - Level
 *  - Attack()
 * 
 * Should we write these properties four different times?
 * For each character?
 * 
 * Place common features into one parent class, and allow the other classes to inherit them.
 * 
 * What is Inheritance:
 * a mechanism that enables one class to acquire all the 
 * behaviors and attributes of another class

 * It promotes:
 * - Code reuse
 * - Easier maintenance
 * - Cleaner code
 * - Real-world modeling
 * 
 * Examples: Pet, dog, cat
 * 
 * Superclass / Parent class/ base class: PET
 * 
 * Subclass / Derived class / Child class: DOG, CAT, BIRD, RABBIT
 * 
 * Inheritance:
 * Extends
 * 
 * Questions:
 * 1. Where did eat() come from?
 * 
 * Overriding the Superclass methods:
 * - Sometimes the subclasses will behave differently
 * E.g: every pet makes a different sound
 * 
 * @Override: Tells Java that this method replaces a method from the parent class
 * and modifies how the method behaves
 * Advantages of overriding:
 * - Improves readability
 * - Makes code safer
 * - Detects mistakes
 * 
 * Coding Challenge:
 * Modify the code so that the output includes:
 * 
 * McBarkous says Woof!
 * Isabella says Meow!
 * 
 * 
 * Calling Constructors During Inheritance:
 * Rule: Whenever a subclass object is created, the superclass constructor runs first
 * 
 * Using Superclass Constructors that Require Arguments:
 * - Suppose Pet needs a name.
 * - This means that Dog must pass the name to Pet
 * 
 * Using super():
 * - This calls the constructor of the parent class
 * - It must be the first line inside the constructor
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class OOPInheritanceL1 {

    public static void main(String[] args)
    {
        System.out.println("Inheritance Demo 1");
        
        Scanner input = new Scanner(System.in);
        
        //Whenever a subclass object is created, the superclass constructor runs first
        
        //Instantiate/create an object of the Dog class
        //className objName = new className();
        Dog d1 = new Dog();
        
        d1.name = "McBarkous";
        d1.age = 4;
        
        System.out.println(d1.name);
        System.out.println(d1.age);
        
        d1.eat();
        d1.sleep();
        d1.fetch();
        d1.makeSound();
        
        Dog d2 = new Dog("Howley");
        
        System.out.println(d2.name);
        d2.eat();
        d2.sleep();
        d2.fetch();
        d2.makeSound();
        
        Dog d3 = new Dog("Sasha", 6, "Golden Retriever");
        d3.eat();
        d3.sleep();
        
        
        Cat c = new Cat();
        c.makeSound();
        
        
        
        
        
        /*
        d1.eat();
        d1.sleep();
        d1.fetch();
        d1.makeSound();
        
        Cat c = new Cat();
        c.makeSound();
        
        Dog d2 = new Dog("Howley");
        d2.sleep();
        
        
        Dog d3 = new Dog("Sasha", 6, "Golden Retriever");
        d3.sleep();*/
        
        
    }
}

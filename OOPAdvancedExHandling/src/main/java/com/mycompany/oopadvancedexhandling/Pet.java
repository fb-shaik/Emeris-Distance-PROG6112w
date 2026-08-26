/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopadvancedexhandling;

/**
 *
 * @author nmagongo
 * 
 * Abstract class:
 * - Contain methods that must be overridden in their child
 * - A blueprint for other classes
 * - It cannot be instantiated directly
 *      - Why have a Pet class if its object cannot be instantiated?
 *          - Specific
 *          - The abstract class provides common characteristics that 
 *            derived classes can use in their specific ways
 * 
classes.
 */
public abstract class Pet 
{
    private String rescueID;
    private String name;
    private int age;
    
    //constructor
    public Pet(String resID, String n, int a)
    {
        this.rescueID = resID;
        this.name = n;
        setAge(a);
        
    }
    
    //getters
    public String getRescueID()
    {
        return rescueID;
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    //setters
    public void setAge(int a)
    {
        //validating the age value the user provided
        if (a >=0)
        {
            this.age = a;
        }
        else
        {
            System.out.println("Age cannot be negative");
        }
    }
    
    //methods
    public void eat()
    {
        System.out.println(name + " is eating.");
    }
    
    public void sleep()
    {
        System.out.println(name + " is sleeping.");
    }
    
    //abstract method
    public abstract void makeSound();
    
    
    public final void registerPet()
    {
        System.out.println(name +" has been registered.");
    }
    
    //overridden method from the Object class
    @Override
    public String toString()//from the Object class
    {
        return "Pet Name: " + name + ", Age: " + age;
    }
    
    @Override
    public boolean equals(Object compareObject)//the parameter is of the Object class
    {
        //if statement to compare the object
        //Are these references pointing to the exact same object?
        if(this == compareObject)
        {
            return true;
        }
        
        //check that the compare object is not empty
        if (compareObject == null)
        {
            return false;
        }
        
        
        //check if we are comparing like objects 
        //check if the object compared is an instance of the Pet class
        //"comparing apples with apples"
        if(!(compareObject instanceof Pet))
        {
            return false;
        }
        
        //
        Pet other = (Pet) compareObject;
        
        return rescueID.equals(other.rescueID);
      
    }
    
    
   public void displayInfo()
   {
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
   }
    
    
    
}

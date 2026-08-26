/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopadvancedexhandling;


import com.mycompany.oopadvancedexhandling.interfaces.Adopt;

/**
 *
 * @author nmagongo
 */
public class Dog extends Pet implements Adopt
{
    private String breed;
    
    public Dog(String resID, String n, int a, String b)
    {
        super(resID, n, a);
        this.breed = b;
        
    }
    
    //getter
    public String getBreed()
    {
        return breed;
    }
    
    @Override
    public void makeSound()
    {
        System.out.println(getName() + " says Woof!");
    }
    
    public void fetch()
    {
        System.out.println(getName() + " is fetching the ball");
    }
    
    //overridden Pet method
    @Override
    public void displayInfo()
   {
       super.displayInfo();//displays the name and age
       
       System.out.println("Breed: " + breed);
   }
    
    //Interface's method
    @Override
    public void prepareForAdoption()
    {

        System.out.println(getName() + " is being prepared for adoption.");
    }
    
    
    
    
}

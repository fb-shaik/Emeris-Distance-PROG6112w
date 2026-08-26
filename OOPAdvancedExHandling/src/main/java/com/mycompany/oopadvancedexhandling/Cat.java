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
public class Cat extends Pet implements Adopt
{
    
    private String colour;

    public Cat(String rescueID, String name, int age, String colour) {

        super(rescueID, name, age);

        this.colour = colour;
    }

    //getter
    public String getColour()
    {
        return colour;
    }
    
    @Override
    public void makeSound()
    {

        System.out.println(getName() + " says Meow!");
    }
    
    public void climb()
    {

        System.out.println(getName() + " is climbing.");
    }
    
    @Override
    public void prepareForAdoption()
    {

        System.out.println(getName() + " is being prepared for adoption.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopiheritancel2;

/**
 *
 * @author nmagongo
 */
public class Dog extends Pet
{
    public Dog()
    {
        super("", 0);
    }
    
    public Dog(String name, int age)
    {
        super(name, age);
    }
    
    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("Woof!");
    }
    
}

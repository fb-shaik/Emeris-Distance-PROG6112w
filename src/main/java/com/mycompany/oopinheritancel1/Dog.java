/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopinheritancel1;

/**
 *
 * @author nmagongo
 */
public class Dog extends Pet
{
    //member variables
    String breed;
    
    //default constructor
    public Dog()
    {

        System.out.println("Dog created.");

    }
    
    //P. Contructor 1
    public Dog(String name)
    {

        super(name);

    }
    
    //P. constructor 2
    public Dog(String name, int age, String breed)
    {

        super(name, age);

        this.breed = breed;

    }
    
    public void fetch() 
    {
        System.out.println(name + " fetched the ball!");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    
}

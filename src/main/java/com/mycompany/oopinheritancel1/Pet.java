/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopinheritancel1;

/**
 *
 * @author nmagongo
 */
public class Pet
{
    
    String name;
    int age;
    
    
    public Pet()
    {
        System.out.println("Pet created.");
    }
    
    public Pet(String name)
    {
        this.name = name;

        System.out.println("Pet created.");
    } 
    
    public Pet(String name, int age)
    {

        this.name = name;
        this.age = age;

    }
    

    public void eat()
    {
        System.out.println(name + " is eating.");
    }

    public void sleep()
    {
        System.out.println(name + " is sleeping.");
    }
    
    public void makeSound() {
        System.out.println(name + " says");
    }
    
}

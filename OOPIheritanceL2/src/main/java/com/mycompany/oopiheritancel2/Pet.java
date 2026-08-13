/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopiheritancel2;

/**
 *
 * @author nmagongo
 */
public class Pet
{
    //member variables
    //information hiding is enforced by the private access modifyer
    private String name;
    private int age;
    
    public Pet()
    {
        
    }

    public Pet(String n, int a)
    {
        //This allows the main program to alter the values 
        //of the private member variables of this class indirectly
        this.name = n;
        this.age = a;
    }
    
    //getter method
    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }
    
    
    //setters
    public void setAge(int a)
    {
        if(age >= 0)
        {
            this.age = a;
        }
    }
    
    public void setName(String n)
    {
        this.name = n;
    }

    public void eat()
    {
        System.out.println(name + " is eating.");
    }

    public void sleep()
    {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound()
    {
        System.out.println("The pet makes a sound.");
    }
    
}

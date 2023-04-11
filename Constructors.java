/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
/** A constructor is a special method that is used to initialize objects. It is called when an 
 * object of a class is created **/

class person 
{
    int age;
    double height;
    double weight;
    
    person()
    {
     System.out.println("No Paramatrized constructor");
     age=0;
     height=0.0;
     weight=0.0;
    }
    person(int age)
    {
        System.out.println("One parameter construtor");
        this.age=age;
        height=0.0;
        weight=0.0;
    }
    person(int age, double height, double weight)
    {
        System.out.println("Three parameter constructor");
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    public String toString()
    {
        return "Age:"+age+"\nHeight:"+height+"\nWeight"+weight;
    }
}

public class Constructors {
    
    public static void main(String args[])
    {
        person p0=new person();
        System.out.println(p0);
         person p1=new person(22);
        System.out.println(p1);
         person p3=new person(22,5.8,75);
        System.out.println(p3);
    }   
}

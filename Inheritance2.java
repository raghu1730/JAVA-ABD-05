/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

/**
 *
 * @author student
 */
class Student    // base class
{
    protected String name;   // decleration
    protected void display()  // method
    {
        System.out.println("I am student");
    }
}
class College extends Student   // class extension, derived class
{
    public void getInfo()  // method
    {
        System.out.println("My name is:" + name);
    }
}
public class Inheritance2  // main class 
{
    public static void main(String args[])  // main method
    {
        College mycol = new College();  // object creation
        
        mycol.name="Raghu";
        mycol.display();
        mycol.getInfo();
    }         
}

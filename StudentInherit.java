/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

/**
 *
 * @author student
 */
class College
{
    public void study()
    {
        System.out.println("I am in the college do not disturb");
    }
}
class University extends College
{        
    public void study()  // method override 
    {
        System.out.println("I am in the University do not disturb");
    }
    public void brake()
    {
        System.out.println("I am in brake");
    }
}
public class StudentInherit {
    
    public static void main(String args[])
    {
    // College myobj1 = new College();
    // myobj1.study1();
     University myobj = new University();
     // myobj.study1();
        myobj.study();
        myobj.brake();
    }
    
}
 
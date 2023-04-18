/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
import java.util.Scanner;
abstract class Student   // abstract class, super class, base class, parent class
{
  private String name;
    public void study(String a)
    {
        System.out.println("Person Name is:"+a);
        
    }
         public String getname()
    {
        return name;
    }
    public void setname(String b)
    {
        name=b;
    }   
}
class Teacher extends Student   // subClass / Derived class, child class
{
    String name;
    public void teach()
    {
        System.out.println("I am teaching Oops Concepts");
    }
    
}
public class Abst_No {   // main class
    public static void main(String args[])  // main method
    {
        String a;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name:");
        a=scan.nextLine();
       // Student std = new Student();
        //std.setname();
        Teacher std = new Teacher();
        std.study(a);
        std.setname(a);
        std.teach();
       
       // std.teach();
    }
}

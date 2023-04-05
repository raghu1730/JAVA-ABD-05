/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Method_Class {
    String std_name="David";
    
    public void myid()
    {
        int std_id=521542;
        System.out.println("Student id is:" +std_id);
    }
    public void mygender()
    {
        String gender="male";
        System.out.println("The gender is:"+gender);
    }
    public void sum(int x, int y)
    {
        int z = x + y;
        System.out.println("The sum of two No:"+z);
    }
    public static void main(String args[])
    {
        int a, b;
        Method_Class myobj = new Method_Class(); // object creation using class name 
        Scanner sc = new Scanner(System.in); // default method
        System.out.println("Enter number 1:");
        a=sc.nextInt();
        System.out.println("Enter number 2:");
        b=sc.nextInt();
        System.out.println(myobj.std_name);
        myobj.sum(a, b);
        myobj.myid();
        myobj.mygender();
    }
}

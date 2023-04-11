/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
import java.io.*;
class Worldpopulation
{
   int a;
   int b;
   int sum=0;
    
    public int world(int a, int b)
    {
      sum=a + b;
      return sum;
    }
}
public class Method 
{
    public static void main(String args[])
    {
     Worldpopulation pop = new Worldpopulation();
     
     int abc=pop.world(1,2);
     
     System.out.println("Sum of two number are:"+abc);
    }
}

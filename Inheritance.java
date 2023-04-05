/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

/**
 *
 * @author student
 */
class calculatenumbers  // base class
{
   public  int z;
    
    public void addnumber(int x, int y)
    {
        z = x + y;
        System.out.println("The sum of two numbers are:" +z);
    }
    public void subnumber(int x , int y)
    {
        z = x - y;
        System.out.println("The sub of two numbers are:"+z);
    }
   
}
class calculatenumbers1 extends calculatenumbers
{
    
    public void divnumber(int x, int y)
    {
        z = x/y;
        System.out.println("The div of number is:"+z);
    }
}

public class Inheritance extends calculatenumbers1  // su
{
    public void multnumbers(int x, int y)
    {
        z = x * y;
        System.out.println("The mul of two numbers are:"+z);
    }
    public static void main(String args[])
    {
        int a = 10, b=20;
        Inheritance myobj = new Inheritance();
        myobj.addnumber(a, b);
        myobj.subnumber(a , b);
        myobj.multnumbers(a , b);
        myobj.divnumber(a, b );
    }
}

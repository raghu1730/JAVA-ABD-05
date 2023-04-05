/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

/**
 *
 * @author student
 */
class Addclassfrom{
public int a;
    public void trapezioarea(int x, int y, int z)
    {
    a = (x-y)*z;
            System.out.println("The area of trapezio is: "+a);
    }
    public void retanglearea(int x, int y)
    {
    a = x*y;
            System.out.println("The area of retangle is: "+a);
    }
    public void trianglearea(int x, int h)
    {
    a = (x*h)/2;
            System.out.println("The area of triangle is: "+a);
    }
}
   
public class William extends Addclassfrom
{
    public void circlearea(int x, int y)
    {
        a = (x*y*y);
        System.out.println("The area of the circle is: "+a);
    }
    public static void main(String args[])
    {
        int b=10, c=12, d=5;
        William myobj = new William();
        myobj.retanglearea(b, c);
        myobj.trapezioarea(b, c, d );
        myobj.trianglearea(b, c );
        myobj.circlearea(b, c);
    }
}  

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
// Program to calcualte the speed of different bikes
import java.util.Scanner;
abstract class MotoBike
{
    float speed;
    public void speed1(float a, float b)
    {
       speed = (a / b);
       System.out.println("The speed of MotoBike is:"+speed);
    }
}
class SportBike extends MotoBike
{
    public void speed(float a, float b)
    {
         speed = (a / b);
         System.out.println("The speed of SportBike is:"+speed);
    }
}
class MountainBike extends MotoBike
{
    public void speed(float a, float b)
    {
         speed = (a / b);
         System.out.println("The speed of MountainBike is:"+speed);
    }
}
public class AbstractClass1 { // main class
    public static void main(String args[])
    {
        float dist;
        float time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travel in KM:");
        dist=sc.nextFloat();
        System.out.println("Enter the time taken to reach String  to Endng point :");
        time=sc.nextFloat();
        SportBike sb = new SportBike();
        sb.speed(dist, time);
        MountainBike mb = new  MountainBike();
        mb.speed(dist, time);
        mb.speed1(dist, time);
        
    }
    
}

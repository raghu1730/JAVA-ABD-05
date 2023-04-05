/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05;

/**
 *
 * @author student
 */
import java.io.*;
import java.util.Scanner;
public class Inputtype 
{
    public static void main(String args[])
    {
        int a;   // Declerations;
        Float b;
        String s;
        Scanner raghu = new Scanner(System.in);
        System.out.println("Enter the number:");
        a = raghu.nextInt();
        System.out.println("Enter anothe number:");
        b=raghu.nextFloat();
        System.out.println("Enter the string:");
        s=raghu.next();
        System.out.println("The number is int:"+a);
        System.out.println("The number is float:"+b);
        System.out.println("The string is:"+s);
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
import java.util.*;
public class Switch {
    public static void main(String args[])
    {
        int num=0;
        String day=null;
         Scanner myscan = new Scanner(System.in);
         System.out.println("Enter the number");
         num=myscan.nextInt();
         
         switch (num)
         {
             case 1: day ="Monday";
             break;
             case 2: day ="Tuesday";
             break;
             case 3: day ="Wednesday";
             default:
                 System.out.println("No match found");
             
         }
         System.out.println(day);
    }
}

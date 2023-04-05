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
public class For_Stat {
    public static void main(String args[])
       
    {
             int num;
             Scanner myscan = new Scanner(System.in);
             System.out.println("Enter the conditional number:");
             num=myscan.nextInt();
             
        int sum=1;
        for(int i=1;i<num;i++)
        {
            sum+=i;
           
        }
        System.out.println("The sum of numbers are:"+sum);
    }
}

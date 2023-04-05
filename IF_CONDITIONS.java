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
public class IF_CONDITIONS {
    public static void main(String args[])
    {
        Scanner myscan = new Scanner(System.in);
        int a = myscan.nextInt();
        int b = myscan.nextInt();
        int c = myscan.nextInt();
        
        int sum = a + b + c;
        System.out.println("The sum of numbers are: " +sum);
        if((a > b) && (a > c))
        {
            System.out.println("Maximum num:" +a);
        }
        else if((b > a) && ( b > c))
        {
            System.out.println("Maximum num:" +b);
        }
        else
        {
            System.out.println("Maximum num:"+c);
        }
    }
}

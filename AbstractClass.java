/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
// PROGRAM FOR CUSTOMER KYC (KNOW YOU CUSTOMER) 
import java.util.Scanner;
abstract class Bank   // base class or super class or parent class, abstract class
{
    float saving;
    public void account(float amount)
    {
       saving = amount  + 5000;
       System.out.println("My saving amount is:"+saving);
    }
}
class Customer extends Bank  // child class or sub class or derived class
{
    public void kyc(String a, int b)
    {
        System.out.println("Customer Name is:"+a);
        System.out.println("Customer Account No is:"+b);
    }
}
public class AbstractClass {   // main class
    public static void main(String args[])   // main method
    {
        String name;
        int accno;
        float cash;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Name:");
        name=sc.nextLine();
        System.out.println("Enter the Account No:");
        accno=sc.nextInt();
        System.out.println("Enter the cash deposit amount:");
        cash=sc.nextFloat();
        
        
        Customer cst=new Customer();
        cst.kyc(name, accno);
       // Bank bk=new Bank();
        cst.account(cash);
       
    }
    
}

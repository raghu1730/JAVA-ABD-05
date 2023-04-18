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
class Account       
{
    public void Bank(String x)
    {       
      System.out.println("Name of the customer is:"+x);
    }
}
class Accounno extends Account
{
    public void Bank(String y)
    {
        System.out.println("Customer account number is:"+y);
    }   
}
class accountype extends Account
{
    public void Bank(String z, String x)
    {
        String location="montreal";
       if(z.equals("saving") && location.equals("montreal"))
       {
           System.out.println("Customer savings account is created");
       }
       else
       {
           System.out.println("Customer checking account is craeted");
       }
    }
}
public class Polymorphism {
    public static void main(String args[])
    {
        String a;
        String b;
        String c;
        //String addr;
        Scanner newscan = new Scanner(System.in);
        
        System.out.println("Enter the name of the customer:");
        a=newscan.nextLine();
        System.out.println("Enter the Account number:");
        b=newscan.nextLine();
        System.out.println("Enter the type of account:");
        c=newscan.nextLine();
        
        Account newacc = new Account();  
        newacc.Bank( a);
        
        Accounno accno = new Accounno();
        accno.Bank(b);
        
        accountype acctype = new accountype();
        acctype.Bank(c);
        
        //Country cty = new Country();
        //cty.city();
    }   
}

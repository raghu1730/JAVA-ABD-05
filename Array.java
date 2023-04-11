/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
/** Array is a data type which hold the elements of similar type. **/
public class Array {
    public static void main(String args[])
    {
        //create an array
        int[] age={12, 10, 5, 8, 20, 23};
        int sum=0;
        // access the elements from array
        
        System.out.print("First array:"+age[0] +'\n');
        System.out.print("Second array:"+age[1] +'\n');
        System.out.print("Third array:"+age[2] +'\n');
        System.out.print("Fouth array:"+age[3] +'\n');
        System.out.print("Fifth array:"+age[4] +'\n');
        System.out.print("Sixth array:"+age[5] +'\n');
        
        for(int i=0;i<age.length;i++)
        {
            System.out.println(age[i]);
            sum+=age[i];
            System.out.println("Sum of array elements are:" +sum);
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_05.JavaStatements;

/**
 *
 * @author student
 */
import java.util.Arrays;
public class ArrayDeclare {
    public static void main(String args[])
    {
        // Array Declare
        int array1[] = new int[] {10, 20, 30};
        int[] array2 = {10, 20, 30, 40};
        int[] array3 = new int[3];
        array3[0]=20;
        array3[1]=30;
        array3[2]=10;
        
        int[] array4 = new int[1];
        array4[0]=10;
        
        Integer arr[] = new Integer[1];
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array3));
        
        for(int i: array4)
            System.out.println(i);
    }
}

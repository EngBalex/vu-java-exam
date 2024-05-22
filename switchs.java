/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.evening;

/**
 *
 * @author Eng. Balex
 */
import java.util.Scanner;
public class switchs {
     public static void main(String [] args){
        Scanner save = new Scanner(System.in);
        System.out.println("Enter Marks for OPP");
        int oop = save.nextInt();        
        System.out.println("Enter Marks for CR&M");
        int crm = save.nextInt();        
        System.out.println("Enter Marks for AI");
        int ai = save.nextInt();
        
        int total = oop+crm+ai;
        System.out.println("The Total is " +total);
        int avg = total/3;        
        System.out.println("The Average is " +avg);
        
        //Switch Statements
        switch(avg){
            case 90:
                System.out.println("Grade is A++");
                 break;
           
            case 80:
                System.out.println("Grade is A");
                 break;
                 
            case 70:
                System.out.println("Grade is B");
                 break;
                             
            case 60:
                System.out.println("Grade is C");
                 break;
                 
            case 50:
                System.out.println("Grade is d");
                 break;
            default:
                System.out.println("Not considered");
     }
        
     }
    
}

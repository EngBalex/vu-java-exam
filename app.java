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
public class app {
    public static void main(String [] args){
        Scanner save = new Scanner(System.in);
        System.out.println("Enter the name of the product");
        String product = save.nextLine();
        System.out.println("Enter the Price of the product");
        double price = save.nextDouble();
        System.out.println("Enter the Quantity required");
        int qty = save.nextInt();
        
        double amount = price*qty;
        
        System.out.println("The client took " + qty + " pcs of " +product + "at a unit price of " + price + "\n\nThe TotalAMount is "+amount  );
        
        
    }
    
}

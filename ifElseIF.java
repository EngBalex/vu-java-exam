package vu.evening;

import java.util.Scanner;
public class ifElseIF {
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
        double avg = total/3;        
        System.out.println("The Average is " +avg);
        
        if(avg>=90){
            System.out.println(avg + " is an A++");
        }  
        
        else if(avg>=80){
            System.out.println(avg + " is an A");
        }
        else if(avg>=70){
            System.out.println(avg + " is a B");
        }
        
        else if(avg>=60){
            System.out.println(avg + " is a C");
        }
        
        else if(avg>=50){
            System.out.println(avg + " is a D");
        }
        else{            
            System.out.println(avg + " is an F");            
        }
        
    }
    
}

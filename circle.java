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
public class circle {
    
    //area =PI*R*R
    //perimeter = 2*PI*R
    
    // declaring constants
    public static final int age = 35;
    
    //Access Modifier
    public static double PI = 3.142;
    //public double radius;
    
    public double computeArea(double radius){
        return PI*radius*radius;
    }
        
    public double computeCircumference(double radius){
        return 2*PI*radius;
    }
    
    public static void main(String [] main){
        Scanner save = new Scanner(System.in);
        circle c = new circle();
        System.out.println("Enter the value of the Radius");
        double radius = save.nextDouble();
        System.out.println("Area of a circle of radius "+ radius + " is  " +c.computeArea(radius) + " and circumference is " + c.computeCircumference(radius));
    }
    
    
}

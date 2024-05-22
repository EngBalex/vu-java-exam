
package vu.evening;

import java.util.Scanner;
public class interativeSums {
    public static void main(String [] args){
        Scanner save= new Scanner(System.in);
        //declare variables;
        double num;
        double sum = 0; //4
        int count = 0; // num[count];
        System.out.println("Enter the Number required but press 'x' toterminate");
        while(save.hasNextDouble()){
            num =save.nextDouble();
            if(num =='x'){
                break;
            }
            sum +=num; //sum = sum+num; 1st=4; sum =4  2nd 5 ; sum =9;
            count++;      
             //System.out.println(num + ',' );
        }
        if(count >0){
            System.out.println("The sum of entered values is " + sum);
        }
        else{
            System.out.println("No Summation due to null entry");
        }
        
    }
    
}

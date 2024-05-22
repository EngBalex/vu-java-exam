
package vu.evening;


import java.util.Scanner;
public class gradeBook {
    
   // Object for the Scanner class
    Scanner s = new Scanner(System.in);
    //Fields 
    public double marks; 
    public String grade;
    
    //Methods
    public String getAlevelGrade(){
        System.out.println("Enter the Name of the Subject");
        String subject = s.nextLine();        
        System.out.println("Enter the Marks");
        marks = s.nextDouble();
             
        if(marks >=90){
            grade = "A+";
        }
        else if(marks>=80){
            grade = "A";
        }
        else if(marks>=70){
            grade = "B";
        }
        
         else if(marks>=60){
            grade = "C";
        }
         
          else if(marks>=50){
            grade = "D";
        }
        
        else{
            grade = "F";
        }
        return subject;
  }
    
    public static void main(String [] args){        
    gradeBook Alevel = new gradeBook(); 
    System.out.println("Your A-level grade is "+Alevel.getAlevelGrade());
    
    }
        
}

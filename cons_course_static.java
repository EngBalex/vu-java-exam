/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.evening;

/**
 *
 * @author Eng. Balex
 */
public class cons_course_static {
    
//Static fields    
 static int noCoursesOffered;

//Fields
    
    String name ;
    int duration;
    String faculty;
    
    
    //Static Constructor Initialization block
    static {
        noCoursesOffered = 0;
    }
    
     //Constructor  Initialization block with default values
   {
        name ="unknown";
        faculty = "unknown";
        duration = 0;
        
    }
    
    
    public cons_course_static(String name, int duration,String faculty){
        this.name =name;
        this.faculty = faculty;
        this.duration = duration;
        noCoursesOffered++;
        
        
    }
    
    //Method
    public void courseInfo(){
        System.out.println("The name of the course  is :"+ name);
        System.out.println("The Duration of the course is :"+ duration);
        System.out.println("The Course is under the department of  "+ faculty);
    }
       
    public static void main(String [] args){
        cons_course course1 = new cons_course("BIT", 3 ,"FST");
        cons_course course2 = new cons_course("BCS", 3 ,"FST");
        cons_course course3 = new cons_course("DIT", 2 ,"FST");
        
        
        System.out.println("No of Courses offered before object creaion :" + noCoursesOffered);
        
        System.out.println("The List of courses doing OOP are \n 1.");
                course1.courseInfo();
        System.out.println("2.");
                course2.courseInfo();
        System.out.println("3.");
                 course3.courseInfo();
       
        System.out.println("No of Courses offered after object creaion :" + noCoursesOffered);
        
        
    }
    
}

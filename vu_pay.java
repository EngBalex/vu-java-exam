
package vu.evening;

 import java.util.Scanner;
public class vu_pay {


    // min_wage and max_hours constants
    private static final double min_wage = 40000.00;
    private static final int max_hrs = 60;

    //Method
    public static void calculatePay(String employeeName, double basePay, int hoursWorked) {
        
        // Check for errors
        if (basePay < min_wage) {
            System.out.println("Error: Base pay for " + employeeName + " is below the minimum wage of UGX40,000.00 per hour.");
            return;
        }
        if (hoursWorked > max_hrs) {
            System.out.println("Error: Number of hours worked by " + employeeName + " exceeds the maximum limit of 60 hours per week.");
            return;
        }

        // Calculate pay
        double totalPay;
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }

        // Print the total pay
        System.out.printf("Total pay for %s with base pay UGX%.2f and hours worked %d is UGX%.2f%n", employeeName, basePay, hoursWorked, totalPay);
    }

    public static void main(String[] args) { //Main Method
        Scanner save = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int numEmployees = save.nextInt(); //3
        save.nextLine(); 

        for (int i = 0; i < numEmployees; i++) {// i =0; i< 3; 1++
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Enter employee name: ");
            String employeeName = save.nextLine();

            System.out.print("Enter base pay (UGX): ");
            double basePay = save.nextDouble();

            System.out.print("Enter hours worked: ");
            int hoursWorked = save.nextInt();
            save.nextLine(); 
            

            // print total for a given employee
            calculatePay(employeeName, basePay, hoursWorked);
            System.out.println();  
        }

        save.close();
    }
}

package vu.evening;


public class Employees {

    // General fields for Teaching and Non-Teaching Staff
    public String name;
    public int age;
    public String role;

    // Employees Constructor
    public Employees(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    // Method for showing employee details
    public void showEmployeeDetails() {
        System.out.println(name + " is our employee of " + age + " years old and currently works as " + role);
    }
}

// Subclass: teachingEmployee
class TeachingEmployee extends Employees {
    String faculty;
    String vclassID;

    public TeachingEmployee(String name, int age, String role, String faculty, String vclassID) {
        super(name, age, role);
        this.faculty = faculty;
        this.vclassID = vclassID;
    }

    @Override
    public void showEmployeeDetails() {
        super.showEmployeeDetails();
        System.out.println("Employee teaching in " + faculty + " using vClass ID of " + vclassID);
    }
}

// Subclass: nonTeaching
class NonTeaching extends Employees {
    String nonStaffID;
    double salary;

    public NonTeaching(String name, int age, String role, String nonStaffID, double salary) {
        super(name, age, role);
        this.nonStaffID = nonStaffID;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        super.showEmployeeDetails();
        System.out.println("Employee working as " + role + " and earns " + salary);
    }
}

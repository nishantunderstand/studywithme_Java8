package javaCoreInnerClass;

/**
 * Created : 2026-08-05 18:45:00
 *
 * Topic : Member Inner Class (Non-Static Nested Class)
 *
 * Interview Questions
 * -------------------
 * Q1. How do you create an object of a Member Inner Class?
 * Q2. Can an Inner Class access private members of the Outer Class?
 * Q3. Does a Member Inner Class require an Outer Class object?
 */
public class B_MemberInnerClassProgram {

    private int employeeId = 101;
    private String company = "OpenAI";

    class Employee {
        void display() {
            // Inner class can access ALL members
            // of the outer class (even private members)
            System.out.println("Employee Id : " + employeeId);
            System.out.println("Company     : " + company);
        }
    }

    public static void main(String[] args) {

        // Step 1 : Create Outer Class Object
        B_MemberInnerClassProgram outer = new B_MemberInnerClassProgram();
        // Step 2 : Create Member Inner Class Object
        B_MemberInnerClassProgram.Employee employee = outer.new Employee();
        employee.display();
    }
}
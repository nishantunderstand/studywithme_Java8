package javaCoreInnerClass;

/**
 * Created : 2026-08-05 18:41:58
 *
 * Topic : Static Nested Class
 *
 * Interview Questions
 * -------------------
 * Q1. How do you create an object of a static nested class?
 * Q2. Can a static nested class access instance variables?
 * Q3. Why is it called "Nested" instead of "Inner"?
 */
public class A_StaticNestedClassProgram {

    static int companyCode = 101;
    int employeeId = 5001;

    static class Employee {
        void display() {
            // Static member can be accessed directly
            System.out.println("Company Code : " + companyCode);
            // ❌ Uncomment and observe compile error
            //System.out.println(employeeId);

            // To access instance members, create Outer object
            A_StaticNestedClassProgram obj = new A_StaticNestedClassProgram();
            System.out.println("Employee Id  : " + obj.employeeId);
        }
    }

    public static void main(String[] args) {
        // Creating Static Nested Class Object
        A_StaticNestedClassProgram.Employee employee = new A_StaticNestedClassProgram.Employee();
        employee.display();
    }
}
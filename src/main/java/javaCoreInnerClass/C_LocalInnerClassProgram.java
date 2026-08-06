package javaCoreInnerClass;

/**
 * Created : 2026-08-05 18:50:00
 *
 * Topic : Local Inner Class
 *
 * Interview Questions
 * -------------------
 * Q1. Where can a Local Inner Class be declared?
 * Q2. Can it access local variables?
 * Q3. Why must local variables be effectively final?
 */
public class C_LocalInnerClassProgram {

    private int employeeId = 101;

    void display() {
        int salary = 50000;      // Effectively Final
        // Local Inner Class
        class Employee {
            void printDetails() {
                System.out.println("Employee Id : " + employeeId);
                // Accessing local variable
                System.out.println("Salary      : " + salary);
            }
        }
        Employee employee = new Employee();
        employee.printDetails();
    }

    public static void main(String[] args) {
        C_LocalInnerClassProgram obj = new C_LocalInnerClassProgram();
        obj.display();
    }
}
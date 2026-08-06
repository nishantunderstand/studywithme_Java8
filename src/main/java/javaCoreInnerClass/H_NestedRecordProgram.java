package javaCoreInnerClass;

/**
 * Created : 2026-08-05 19:30:00
 *
 * Topic : Nested Record (Java 16+)
 *
 * Interview Questions
 * -------------------
 * Q1. Can a record be declared inside a class?
 * Q2. Is a nested record static?
 * Q3. Are records immutable?
 * Q4. Can records have constructors and methods?
 */
public class H_NestedRecordProgram {

    record Employee(int id, String name) {

        // Compact Constructor
        Employee {

            if (id <= 0) {
                throw new IllegalArgumentException("Invalid Employee Id");
            }
        }

        public void display() {
            System.out.println(id + " : " + name);
        }
    }

    public static void main(String[] args) {

        Employee employee = new Employee(101, "Nishant");

        System.out.println(employee);

        System.out.println(employee.id());

        System.out.println(employee.name());

        employee.display();
    }
}
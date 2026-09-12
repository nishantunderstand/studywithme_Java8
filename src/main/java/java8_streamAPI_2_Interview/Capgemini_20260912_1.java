package java8_streamAPI_2_Interview;

import java.util.*;
import java.util.stream.*;

class Employee {
    int empId;
    String empName;
    int empSalary;
    String empDept;

    public Employee(int empId, String empName, int empSalary, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDept = empDept;
    }

    public int getEmpId() {
        //return empId;
        return this.empId; // Both are Correct
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getEmpDept() {
        return empDept;
    }

    @Override
    public String toString() {
        return empId + " " + empName + " " + empSalary + " " + empDept;
    }
}

// Online Complier If Both of them are public or default It would work
public class Capgemini_20260912_1 {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Alok", 5000, "IT");
        Employee emp2 = new Employee(102, "Amit", 7000, "IT");
        Employee emp3 = new Employee(103, "Nitin", 8000, "Finance");

        List<Employee> myList = new ArrayList<>();

        myList.add(emp1);
        myList.add(emp2);
        myList.add(emp3);

        // 1. Highest Salary
        Optional<Employee> highestSalary =
                myList.stream()
                        .max(Comparator.comparingInt(Employee::getEmpSalary));

        highestSalary.ifPresent(System.out::println);


        // 2. Count employee department-wise
        Map<String, Long> countByDept =
                myList.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getEmpDept,
                                Collectors.counting()
                        ));

        System.out.println(countByDept);


        // 3. Employee name starts with "A"
        myList.stream()
                .filter(e -> e.getEmpName().startsWith("A"))
                .forEach(System.out::println);
    }
}


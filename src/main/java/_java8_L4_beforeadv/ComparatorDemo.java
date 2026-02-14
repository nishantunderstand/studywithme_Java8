package _java8_L4_beforeadv;

import java.util.*;

class Employee {
    String name; int age; double salary;
    Employee(String n, int a, double s){name=n;age=a;salary=s;}
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
    
    public String toString(){return name + "(" + age + ", " + salary + ")";}
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("Ria", 25, 60000),
            new Employee("Aman", 28, 60000),
            new Employee("Vivek", 30, 55000)
        );

        list.stream()
            .sorted(Comparator.comparing(Employee::getSalary)
                              .thenComparing(Employee::getName))
            .forEach(System.out::println);
    }
}

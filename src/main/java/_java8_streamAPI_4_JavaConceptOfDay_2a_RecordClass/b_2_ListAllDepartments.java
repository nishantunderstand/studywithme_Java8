package _java8_streamAPI_4_JavaConceptOfDay_2a_RecordClass;

import java.util.Arrays;
import java.util.List;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/


class b_2_ListAllDepartments {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(11, "Aman", 25, "M", "IT", 2022, 75000),
                new Employee(20, "Aman Kumar", 28, "M", "HR", 2020, 65000),
                new Employee(12, "Anmanika", 24, "F", "IT", 2023, 70000),
                new Employee(13, "Anmanika Jee", 30, "F", "Finance", 2019, 80000)
        );

        empList.stream().forEach(System.out::println);
    }
}
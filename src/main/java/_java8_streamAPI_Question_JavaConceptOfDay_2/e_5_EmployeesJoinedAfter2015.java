package _java8_streamAPI_Question_JavaConceptOfDay_2a;

import java.util.stream.Collectors;

import static _java8_streamAPI_Question_JavaConceptOfDay_2a.Main.employeeList;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class e_5_EmployeesJoinedAfter2015 {

    public static void main(String[] args) {

        employeeList.stream()
                .filter(emp -> emp.Employee::getYearOfJoining>2015)
                .forEach((k,v)-> System.out.println(k+ "-> "+ v));
    }
}

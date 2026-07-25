package _java8_streamAPI_Question_JavaConceptOfDay_2;

import static _java8_streamAPI_Question_JavaConceptOfDay_2.Main.employeeList;

/**
* @see <a href="https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/">
*     Java 8 Interview Sample Coding Questions </a>
*/
public class b_2_ListAllDepartments {

    public static void main(String[] args) {
        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }
}

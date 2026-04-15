package java8_L5_advanced;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestAsPerDept {

	public static void main(String[] args) {
		
		List<Employee> emp = EmployeeData.getEmployees();

		System.out.println(emp.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors
		.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get))));
	}

}

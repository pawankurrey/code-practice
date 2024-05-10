package com.abc.java8code.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortBySalary {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, 25000, "Rakesh");
		Employee emp2 = new Employee(2, 20000, "Akash");
		Employee emp3 = new Employee(3, 32000, "Naksh");
		Employee emp4 = new Employee(4, 27000, "Amar");
		Employee emp5 = new Employee(5, 45000, "Tanu");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		//Sort the employee by its salary based on descending order
		List<Employee> sortedEmpList = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(sortedEmpList);
		List<Employee> sortList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		System.out.println("Decsending Order : "+sortList);
		//Fetch  3 highest salary
		List<Employee> threeHighSalList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).limit(3).collect(Collectors.toList());
		System.out.println("Three highest salary person : "+threeHighSalList);
		List<Employee> ascedningList = empList.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
		System.out.println("Ascsending Order : "+ascedningList);
		
		double secondSalr = empList.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondSalr);
		
		//Calculate total pay is done for the employee whose sal >= 25000 for the current month
		double sumOfSalaries = empList.stream().filter(emp -> emp.getSalary() >= 25000).mapToDouble(Employee::getSalary).sum();
		System.out.println("Sum of salaries (salary >= 25000): " + sumOfSalaries);

		
	}

}

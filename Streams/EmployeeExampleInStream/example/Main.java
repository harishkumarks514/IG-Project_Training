package com.pack.streamapi.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();
		
//		Filter Method
//		Here we filter the employees list with the gender female. 
		empList.stream().filter(e->e.getGender().equals("Male")).forEach(e -> System.out.println(e));
		
//		we filter the employees list with newJoineers TRUE.
		empList.stream().filter(e ->  e.getNewJoiner().equals("TRUE")).forEach(e->System.out.println(e));

//		SORT METHODS
//		We will sort  the employee list by rating ASCE.
		
		empList.stream().sorted(Comparator.comparing(Employee::getRating))
		.forEach(e -> System.out.println(e));
		
//		We will sort  the employee list by rating DESE.
		empList.stream()
		.sorted(Comparator.comparing(Employee::getRating)
				.reversed())
		.forEach(e->System.out.println(e));
		
//		We will sort the employee list by both rating and salary.
		empList.stream().sorted(Comparator.comparing(Employee::getRating))
						.sorted(Comparator.comparing(Employee::getSalary))
						.forEach(e -> System.out.println(e));
		
//		We will see all employees with salary more than 1000
		boolean isSalary = empList.stream().allMatch(e->e.getSalary()>1000);
		System.out.println(isSalary);
		
//		Max Function
//		we will retrieve employee with max salary
		empList.stream().max(Comparator.comparing(Employee::getSalary))
		.ifPresent(System.out::println);
		
//		we will retrieve employee with max rating.
		
		empList.stream()
		 .max(Comparator.comparing(Employee::getRating))
		 .ifPresent(System.out::println);
		
//		Min function
//		we will retrieve employees with min salary
		empList.stream().min(Comparator.comparing(Employee::getSalary))
		.ifPresent(System.out::println);
		
//		we will retrieve the employee with min rating
		empList.stream().min(Comparator.comparing(Employee::getRating))
		.ifPresent(System.out::println);
		
//		GroupBy Function
//		We will group by all our employees by gender
		Map<String, List<Employee>> employeeByGeder =empList
				.stream().collect(Collectors.groupingBy(Employee::getGender));
		
		employeeByGeder.forEach(((g,e)-> {
			System.out.println(g);
			e.forEach(System.out::println);
		}));
		
		
	}
	
	public static List<Employee> getEmpList() {
		// TODO Auto-generated method stub

		return Arrays.asList(new Employee("59-385-1088","Zacharias", "Schwerin","Zchwerin@gmail.com", "Male", "TRUE",101146, 0),
				new Employee("73-274-6476", "Kyle", "Frudd", "kfruddl@ovh.net", "Male", "False", 29310, 2),
				new Employee("85-939-9584","Axe","Gumb","agumb2@twitter.com","Female","FALSE",62291,4),
                new Employee("08-180-8292","Robinet","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4),
                new Employee("21-825-2623","Ulick","Burrel","uburrel4@google.ru","Male","FALSE",128764,5),
                new Employee("66-708-5539","Tailor","Ridding","Ridding","Female","FALSE",152924,4),
                new Employee("81-697-2363","Joete","Braybrooke","jbraybrooke6@prnewswire.com","Male","TRUE",128907,0),
                new Employee("63-019-1110","Elroy","Baverstock","ebaverstock7@ehow.com","Male","TRUE",2510,0)
				
				);
	}
}

package rohan;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String city;

    // Constructor
    public Employee(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    // Optional: Override toString for better output readability
    @Override
    public String toString() {
        return "Employee{name='" + name + "', city='" + city + "'}";
    }
}

public class TargetSum {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", "New York"),
            new Employee("Jane", "Los Angeles"),
            new Employee("Doe", "Chicago"),
            new Employee("Smith", "New York"),
            new Employee("Adam", "Chicago"),
            new Employee("Eve", "Los Angeles")
        );

         LinkedHashMap<String, List<Employee>> sortedEmployees = employees.stream()
                 .sorted(Comparator.comparing(Employee::getCity)
                         .thenComparing(Employee::getName))
       .collect(Collectors.groupingBy(Employee::getCity, LinkedHashMap::new, Collectors.toList()));

                              
                             

        sortedEmployees.entrySet().stream().forEach(System.out::println);
    }
}


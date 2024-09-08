package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;

    // Constructor
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "'}";
    }
}

public class EmployeeGouping {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "HR"),
            new Employee(2, "Bob", "Finance"),
            new Employee(3, "Charlie", "HR"),
            new Employee(4, "David", "HR"),
            new Employee(4, "Eve", "HR")
        );

        Map<String, List<Employee>> hrEmployeesDept = employees.stream()
            .filter(employee -> "HR".equals(employee.getDepartment())) // Filter employees in HR department
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList())); // Collect into Map with ID as department
        
        Map<Integer, Set<Employee>> hrEmployees = employees.stream()
                .filter(employee -> "HR".equals(employee.getDepartment())) // Filter employees in HR department
                .collect(Collectors.groupingBy(Employee::getId, Collectors.toSet())); // Collect into Map with ID as key

//        hrEmployees.forEach((id, employee) -> 
//            System.out.println("ID: " + id + ", Employee: " + employee));
        System.out.println(hrEmployees);
        System.out.println(hrEmployeesDept);
    }
}
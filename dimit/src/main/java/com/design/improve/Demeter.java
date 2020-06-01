package com.design.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

// 学校总部员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

// 学院员工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理学院员工的类
class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院id" + i);
            employees.add(collegeEmployee);
        }
        return employees;
    }

    public void printEmployee() {
        getAllEmployee().forEach(a -> System.out.println(a.getId()));
    }
}

//管理总部员工的类
// CollegeEmployee 不是直接朋友 违反迪米特法则
class SchoolManager {

    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("总部id" + i);
            employees.add(employee);
        }
        return employees;
    }

    void printAllEmployee(CollegeManager collegeManager) {
        collegeManager.printEmployee();
        System.out.println("------------------");
        List<Employee> employees = this.getAllEmployee();
        employees.forEach(e -> System.out.println(e.getId()));
    }
}
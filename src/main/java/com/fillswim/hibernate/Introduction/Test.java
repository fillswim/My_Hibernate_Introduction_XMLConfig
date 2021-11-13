package com.fillswim.hibernate.Introduction;

import com.fillswim.hibernate.Introduction.Entity.Employee;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Чтение сотрудника из БД
//        Employee employee = employeeDAO.getEmployee(9);
//        System.out.println(employee);

        // Получение всех сотрудников из БД
//        List<Employee> employees = employeeDAO.getAllEmployees();
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

        // Поиск сотрудников по имени
//        List<Employee> employees = employeeDAO.findByName("Oleg");
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

        // Создание пользователя в БД
        Employee employee = new Employee("Mike", "Bush", "IT", 650);
        employeeDAO.saveEmployee(employee);

        // Обновление пользователя в БД
//        Employee employee = employeeDAO.getEmployee(12);
//        System.out.println(employee);
//        employee.setSalary(1500);
//        System.out.println(employee);
//        employeeDAO.saveEmployee(employee);

        // Удаление пользователя
//        employeeDAO.deleteEmployee(2);
    }
}

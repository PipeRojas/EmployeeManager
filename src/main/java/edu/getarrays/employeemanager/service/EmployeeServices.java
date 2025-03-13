package edu.getarrays.employeemanager.service;


import edu.getarrays.employeemanager.exception.UserNotFoundException;
import edu.getarrays.employeemanager.model.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeServices {

    public Employee addEmployee(Employee employee);

    public List<Employee> findAllEmployees();

    public Employee updateEmployee(Employee employee);

    public Employee findEmployee(Long id);

    public void deleteEmployee(Long id);
}

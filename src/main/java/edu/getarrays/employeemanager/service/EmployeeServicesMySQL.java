package edu.getarrays.employeemanager.service;

import edu.getarrays.employeemanager.exception.UserNotFoundException;
import edu.getarrays.employeemanager.model.Employee;
import edu.getarrays.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServicesMySQL implements EmployeeServices{

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee findEmployee(Long id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with id "+ id + "not found."));
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}

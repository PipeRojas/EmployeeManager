package edu.getarrays.employeemanager.repository;

import edu.getarrays.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

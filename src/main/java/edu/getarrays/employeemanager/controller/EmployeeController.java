package edu.getarrays.employeemanager.controller;

import edu.getarrays.employeemanager.model.Employee;
import edu.getarrays.employeemanager.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<>(employeeServices.findAllEmployees(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id){
        return new ResponseEntity<>(employeeServices.findEmployee(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeServices.addEmployee(employee), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> getEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeServices.updateEmployee(employee), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeServices.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

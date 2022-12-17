package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    public EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //build create employee RESt API
    @PostMapping()
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //build all employees REST API
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //build get Employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long emplId){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(emplId),HttpStatus.OK);
    }

    //build employee update REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long empId,
                                                   @RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,empId),HttpStatus.OK);
    }

    //Build employee delete Rest API
    @DeleteMapping("{id}")
    public ResponseEntity<String> employeeDelete(@PathVariable("id") long id){

        //delete employee from DB
        employeeService.deleteEmployee(id);

        return new ResponseEntity<>("Employee Deleted Successfully.", HttpStatus.OK);
    }
}
